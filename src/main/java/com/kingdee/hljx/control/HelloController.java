package com.kingdee.hljx.control;

import com.kingdee.hljx.config.DataSourceContextHodler;
import com.kingdee.hljx.entity.ext.TItem3001;
import com.kingdee.hljx.entity.item.TICItem;
import com.kingdee.hljx.entity.item.TItem;
import com.kingdee.hljx.entity.submessage.MeasureInType;
import com.kingdee.hljx.entity.submessage.TSubMessage;
import com.kingdee.hljx.entity.submessage.Team;
import com.kingdee.hljx.entity.user.TUser;
import com.kingdee.hljx.entity.user.TUserType;
import com.kingdee.hljx.repository.user.TUserTypeReposition;
import com.kingdee.hljx.service.TItemService;
import com.kingdee.hljx.service.TSubMessageService;
import com.kingdee.hljx.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    private TItemService itemService;
    @Resource
    private UserService userService;
    @Resource
    private TUserTypeReposition userTypeReposition;
    @Resource
    private TSubMessageService submsgService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello hljx";
    }
}
