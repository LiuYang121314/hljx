package com.kingdee.hljx.dao.impl;

import com.kingdee.hljx.dao.BOSDao;
import com.kingdee.hljx.entity.ext.TBOS200000007;
import com.kingdee.hljx.repository.ext.TBOS200000007Repository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BOSDaoImpl implements BOSDao {
    @Resource
    private TBOS200000007Repository tbos200000007Repository;


    public List<TBOS200000007> findPackageTypes() {
        return tbos200000007Repository.findAll();
    }
}
