package com.kingdee.hljx.repository.user;

import com.kingdee.hljx.entity.user.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TUser, Long>, JpaSpecificationExecutor<TUser> {
    public TUser findByFNameAndPasswordHashValue(String fName, String passwordHashValue);

    public TUser findByFName(String fName);

    public TUser findByFUserID(int fUserID);
}
