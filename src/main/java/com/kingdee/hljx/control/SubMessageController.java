package com.kingdee.hljx.control;

import com.kingdee.hljx.config.DataSourceContextHodler;
import com.kingdee.hljx.entity.submessage.MeasureInType;
import com.kingdee.hljx.service.TSubMessageService;
import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.activation.DataContentHandler;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/submsg")
public class SubMessageController {
    @Resource
    private TSubMessageService submsgService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = {"/measureInType"})
    public List<MeasureInType> getTypes() {
        logger.info(DataSourceContextHodler.getDataSource());
        return submsgService.getMeasureInType();
    }

}
