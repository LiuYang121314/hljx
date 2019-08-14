package com.kingdee.hljx.dao;

import com.kingdee.hljx.entity.stock.TStock;
import com.kingdee.hljx.entity.stock.TStockPlace;
import com.kingdee.hljx.entity.stock.TStockPlaceGroup;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockDao {

    public List<TStock> findAllStock();

    public List<TStockPlace> findAllStockPlace();

    //    @Query(value="select sp.* from t_StockPlace sp where sp.FSPGroupID = ?", nativeQuery = true)
    public List<TStockPlace> findAllStockPlaceByGroupID(int stockID);

    public List<TStockPlaceGroup> findAllStockPlaceGroup();


}
