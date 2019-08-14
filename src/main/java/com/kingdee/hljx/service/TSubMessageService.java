package com.kingdee.hljx.service;

import com.kingdee.hljx.dao.SubMessageDao;
import com.kingdee.hljx.entity.submessage.MeasureInType;
import com.kingdee.hljx.entity.submessage.TSubMessage;
import com.kingdee.hljx.entity.submessage.Team;
import com.kingdee.hljx.repository.submessage.MeasureInTypeReposition;
import com.kingdee.hljx.repository.submessage.TSubMessageReposition;
import com.kingdee.hljx.repository.submessage.TeamReposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TSubMessageService {

    @Resource
    private SubMessageDao subMsgDao;

    public List<MeasureInType> getMeasureInType() {
        return subMsgDao.getMeasureInType();
    }

    public List<Team> getTeams() {
        return subMsgDao.getTeams();
    }
}
