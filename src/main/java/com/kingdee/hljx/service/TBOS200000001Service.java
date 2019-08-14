package com.kingdee.hljx.service;

import com.kingdee.hljx.dao.TBOS200000001Dao;
import com.kingdee.hljx.entity.ext.TBOS200000001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

@Service
public class TBOS200000001Service {
    @Autowired
    private EntityManager em;

    @Resource
    private TBOS200000001Dao bosDao;

    public void addBill(TBOS200000001 bos) {
        bosDao.addBill(bos);
    }

}
