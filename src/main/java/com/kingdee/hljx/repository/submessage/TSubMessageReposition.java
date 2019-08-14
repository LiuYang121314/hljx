package com.kingdee.hljx.repository.submessage;

import com.kingdee.hljx.entity.submessage.TSubMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TSubMessageReposition extends JpaRepository<TSubMessage, Integer> {

    public List<TSubMessage> findAllByFParentID(int fParentID);
}
