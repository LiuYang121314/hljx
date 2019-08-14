package com.kingdee.hljx.dao;

import com.kingdee.hljx.entity.user.TUser;

import java.util.List;

public interface UserDao {
    public TUser getUserByUsername(String username);

    public List<TUser> findAll();

    public TUser findByFUserID(Integer fUserID);

    public TUser findByFName(String fName);
}
