package com.kingdee.hljx.repository.stock;

import com.kingdee.hljx.entity.stock.TStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TStockReposition extends JpaRepository<TStock, Long> {
    public TStock findByFItemID(int fItemID);
}
