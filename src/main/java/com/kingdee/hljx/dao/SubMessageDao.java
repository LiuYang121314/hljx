package com.kingdee.hljx.dao;

import com.kingdee.hljx.entity.submessage.MeasureInType;
import com.kingdee.hljx.entity.submessage.Team;

import java.util.List;

public interface SubMessageDao {
    public List<MeasureInType> getMeasureInType();

    public List<Team> getTeams();
}
