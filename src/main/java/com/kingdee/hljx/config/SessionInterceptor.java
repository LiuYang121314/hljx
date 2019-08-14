package com.kingdee.hljx.config;

import com.kingdee.hljx.util.FinalVariable;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Configuration
public class SessionInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String MAIN_DATASOURCE = "MAIN";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("当前线程的数据源名称为：{}", DataSourceContextHodler.getDataSource());
        String uri = request.getRequestURI();
        logger.info("当前uri为：{}", uri);
        if (uri.contains("/test/") || uri.equals("/error")) {
            return true;
        } else {
            HttpSession session = request.getSession();
            logger.info("session的ID：{}", session.getId());
            String dataSourceName = (String) session.getAttribute(session.getId());
            if (uri.equals("/login")) {
//                DataSourceContextHodler.setDataSource("MAIN");
                return true;
            } else {
                for (FinalVariable variable : FinalVariable.values()) {
                    if (variable.name().contains("WHITE") && uri.equals(variable.getValue())) {
                        return true;
                    }
                }
                Object user = session.getAttribute(FinalVariable.USER.getValue());
                if (dataSourceName == null || dataSourceName.equals("") || user == null) {
                    response.sendRedirect("/login");
                    return false;
                }
                logger.info("数据源NAME：{}", dataSourceName);
                DataSourceContextHodler.setDataSource(dataSourceName);
            }
            return true;
        }
    }
}
