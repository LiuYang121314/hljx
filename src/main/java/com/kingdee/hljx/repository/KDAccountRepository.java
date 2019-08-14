package com.kingdee.hljx.repository;

import com.kingdee.hljx.entity.TAdKdAccountGl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KDAccountRepository extends CrudRepository<TAdKdAccountGl, Long> {

}
