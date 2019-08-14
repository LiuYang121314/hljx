package com.kingdee.hljx.service;

import com.kingdee.hljx.entity.TAdKdAccountGl;
import com.kingdee.hljx.repository.KDAccountRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class KDAccountService {

    @Resource
    private KDAccountRepository rep;

    public Iterable<TAdKdAccountGl> getAllAccount() {
        return rep.findAll();
    }

//    public TAdKdAccountGl getAccount(int id){
//        if
//    }
}
