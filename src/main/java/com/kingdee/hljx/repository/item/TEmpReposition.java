package com.kingdee.hljx.repository.item;

import com.kingdee.hljx.entity.item.TEmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TEmpReposition extends JpaRepository<TEmp, Integer> {
}
