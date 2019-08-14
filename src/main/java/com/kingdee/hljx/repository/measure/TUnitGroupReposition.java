package com.kingdee.hljx.repository.measure;

import com.kingdee.hljx.entity.measure.TUnitGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TUnitGroupReposition extends JpaRepository<TUnitGroup, Long> {
}
