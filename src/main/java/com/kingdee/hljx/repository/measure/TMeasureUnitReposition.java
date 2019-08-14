package com.kingdee.hljx.repository.measure;

import com.kingdee.hljx.entity.measure.TMeasureUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TMeasureUnitReposition extends JpaRepository<TMeasureUnit, Long> {
}
