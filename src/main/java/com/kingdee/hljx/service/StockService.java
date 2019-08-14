package com.kingdee.hljx.service;

import com.kingdee.hljx.dao.StockDao;
import com.kingdee.hljx.entity.stock.TStock;
import com.kingdee.hljx.entity.stock.TStockPlace;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockService {
    @Resource
    private StockDao stockDao;

    public List<TStock> getAllStock() {
        return stockDao.findAllStock();
    }

    public List<TStockPlace> getStockPlace(int stockID) {
        return stockDao.findAllStockPlaceByGroupID(stockID);
    }
}
