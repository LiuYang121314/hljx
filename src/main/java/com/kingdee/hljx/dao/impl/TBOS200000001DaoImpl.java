package com.kingdee.hljx.dao.impl;

import com.kingdee.hljx.dao.TBOS200000001Dao;
import com.kingdee.hljx.entity.ext.TBOS200000001;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TBOS200000001DaoImpl implements TBOS200000001Dao {
    //    @Resource
//    private HibernateTemplate template;
    @Override
    public void addBill(TBOS200000001 tbos) {
//        template.save(tbos);
    }
}
