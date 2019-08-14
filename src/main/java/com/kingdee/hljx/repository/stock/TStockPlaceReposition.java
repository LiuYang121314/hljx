package com.kingdee.hljx.repository.stock;

import com.kingdee.hljx.entity.stock.TStockPlace;
import com.kingdee.hljx.entity.stock.TStockPlaceGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TStockPlaceReposition extends JpaRepository<TStockPlace, Long> {
    public List<TStockPlace> findByFSPGroup(TStockPlaceGroup group);
}
