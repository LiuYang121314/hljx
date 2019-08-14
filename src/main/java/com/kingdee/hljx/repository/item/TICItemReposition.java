package com.kingdee.hljx.repository.item;

import com.kingdee.hljx.entity.item.TICItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TICItemReposition extends JpaRepository<TICItem, Integer> {
    List<TICItem> findByFItemID(Integer fItemID);
}
