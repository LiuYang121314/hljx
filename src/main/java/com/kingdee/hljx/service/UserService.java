package com.kingdee.hljx.service;

import com.kingdee.hljx.dao.UserDao;
import com.kingdee.hljx.entity.user.TUser;
import com.kingdee.hljx.repository.user.UserRepository;
import com.kingdee.hljx.util.GetMD5String;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public List<TUser> getAllUsers() {
        return userDao.findAll();
    }

    public TUser getUserByFUserID(int fUserID) {
        return userDao.findByFUserID(fUserID);
    }

    public TUser getUserByUsernamePwd(String username, String pwd) {
        TUser user = userDao.findByFName(username);
        if (pwd != null) {
            if (user.getPasswordHashValue().equals(GetMD5String.getMD5String(pwd).toUpperCase())) {
                user = null;
            }
        }
        return user;
    }
}
