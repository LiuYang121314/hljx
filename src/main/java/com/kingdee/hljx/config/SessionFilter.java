package com.kingdee.hljx.config;

import com.kingdee.hljx.entity.user.TUser;
import com.kingdee.hljx.util.FinalVariable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
public class SessionFilter implements Filter {

    private final String[] white = {
            "/css/", "/js/", "/img/", "/webfonts/", "/fonts/", "/adminlte_files/", "/scripts/"};


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();

        HttpSession session = request.getSession();
        boolean flag = true;//加一个标识，因为 doFilter() 执行后，代码会继续向下执行，会报错
        if (uri.equals("/login")) {
            DataSourceContextHodler.setDataSource(FinalVariable.MAIN.getValue());
            filterChain.doFilter(servletRequest, servletResponse);
            flag = false;
        } else if (uri.equals("/error") || uri.equals("/getaccs") || uri.equals("/load")) {
            filterChain.doFilter(servletRequest, servletResponse);
            flag = false;
        }
        if (flag) {
            for (String s : white) {
                if (uri.startsWith(s)) {
                    filterChain.doFilter(servletRequest, servletResponse);
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            log.info("当前uri:{}", uri);
            String dsName = (String) session.getAttribute(session.getId());
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            if (dsName == null || dsName.equals("")) {
                //没有存储数据源
                //没有存储的user
                //说明 ，没有登录成功，或者session失效，那就跳转到 /login  重新登录
                //把登录页面的ajax 放行掉
                response.sendRedirect("/login");
            } else {
                TUser user = (TUser) session.getAttribute(FinalVariable.USER.getValue());
                if (user == null) {
                    response.sendRedirect("/login");
                }
                DataSourceContextHodler.setDataSource(dsName);

                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
