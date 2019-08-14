package com.kingdee.hljx.dao.impl;

import com.kingdee.hljx.dao.UserDao;
import com.kingdee.hljx.entity.user.TUser;
import com.kingdee.hljx.repository.user.UserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private EntityManager em;

    @Resource
    private UserRepository userRepository;

    @Override
    public TUser getUserByUsername(String username) {
        Query query = em.createQuery("SELECT u.fName");
//        query.setParameter(0, "%"+fNumber+"%");
//        return query.getResultList();
        return null;
    }

    public List<TUser> findAll() {
        return userRepository.findAll();
    }

    public TUser findByFUserID(Integer fUserID) {
        return userRepository.findByFUserID(fUserID);
    }

    public TUser findByFName(String fName) {
        return userRepository.findByFName(fName);
    }
}
