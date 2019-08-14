package com.kingdee.hljx.repository.stock;

import com.kingdee.hljx.entity.stock.TStockPlaceGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TStockPlaceGroupReposition extends JpaRepository<TStockPlaceGroup, Long> {
    public TStockPlaceGroup findByFSPGroupID(Integer fSPGroupID);

}
