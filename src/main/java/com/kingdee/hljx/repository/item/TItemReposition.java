package com.kingdee.hljx.repository.item;

import com.kingdee.hljx.entity.item.TItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TItemReposition extends JpaRepository<TItem, Long> {
}
