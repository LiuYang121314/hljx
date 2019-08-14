package com.kingdee.hljx.control;

import com.kingdee.hljx.config.DataSourceContextHodler;
import com.kingdee.hljx.entity.TAdKdAccountGl;
import com.kingdee.hljx.entity.user.TUser;
import com.kingdee.hljx.service.KDAccountService;
import com.kingdee.hljx.service.UserService;
import com.kingdee.hljx.util.FinalVariable;
import com.kingdee.hljx.util.ReturnJsonData;
import org.hibernate.Session;
import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private KDAccountService kdaService;
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpSession session) {
        return "/login.html";
    }

    @ResponseBody
    @RequestMapping("/getaccs")
    public Iterable<TAdKdAccountGl> getAll() {
        return kdaService.getAllAccount();
    }

    @RequestMapping("/getmsg")
    @ResponseBody
    public List<Iterable> getMsg() {
        List<Iterable> list = new ArrayList<>();
        list.add(kdaService.getAllAccount());
//        list.add();
        return list;
    }

    @ResponseBody
    @RequestMapping("/load")
    public String load(String fAcctID, String fName, String pwd, boolean remember, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        DataSourceContextHodler.setDataSource("DB_" + fAcctID);

        TUser user = userService.getUserByUsernamePwd(fName, pwd);
        if (user == null) {
            DataSourceContextHodler.setDataSource("MAIN");
            return ReturnJsonData.formatJson(false, "密码错误~");
        } else {
            session.setAttribute(FinalVariable.USER.getValue(), user);
            session.setAttribute(session.getId(), "DB_" + fAcctID);

            session.setAttribute(fName, fAcctID);
            if (remember) {
//                boolean flag = true;
//                for(Cookie coo : request.getCookies()){
//                    logger.info("cookie的name：{}",coo.getName());
//                    if(coo.getName().equalsIgnoreCase(fName)){
//                        flag = false;
//                        break;
//                    }
//                }
//                if(flag){
//                    Cookie cookie = new Cookie(fName, pwd);
//                    response.addCookie(cookie);
//                }
            }
            DataSourceContextHodler.setDataSource("DB_"+fAcctID);
            return ReturnJsonData.formatJson(true, "登陆成功");
        }
    }

    @RequestMapping("/index")
    public String index() {
//        return "/phoneindex.html";
        return "/index.html";
    }

    @RequestMapping("/weighing")
    public String weighing() {
        return "/weighing.html";
    }

    @RequestMapping("/storage")
    public String storage() {
        return "/storage.html";
    }

    @ResponseBody
    @RequestMapping("/session")
    public Object getValueByName(String parameName, HttpSession session) {
        return session.getAttribute(parameName.toUpperCase());
    }

    @RequestMapping("/quit")
    public String quit(HttpSession session) {
        session.removeAttribute(FinalVariable.USER.getValue());
        session.removeAttribute(session.getId());
        return "/login";
    }


}