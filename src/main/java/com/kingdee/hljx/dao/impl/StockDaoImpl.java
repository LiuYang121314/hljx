package com.kingdee.hljx.dao.impl;

import com.kingdee.hljx.dao.StockDao;
import com.kingdee.hljx.entity.stock.TStock;
import com.kingdee.hljx.entity.stock.TStockPlace;
import com.kingdee.hljx.entity.stock.TStockPlaceGroup;
import com.kingdee.hljx.repository.stock.TStockPlaceGroupReposition;
import com.kingdee.hljx.repository.stock.TStockPlaceReposition;
import com.kingdee.hljx.repository.stock.TStockReposition;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class StockDaoImpl implements StockDao {
    @Autowired
    private EntityManager em;
    //    @Resource(name = "sessionFactory")
//    private SessionFactory sessionFactory;
    @Resource
    private TStockReposition stockReposition;
    @Resource
    private TStockPlaceReposition placeReposition;
    @Resource
    private TStockPlaceGroupReposition groupReposition;

    public List<TStock> findAllStock() {
        return stockReposition.findAll();
    }

    public List<TStockPlace> findAllStockPlace() {
        return placeReposition.findAll();
    }

    @Override
    public List<TStockPlace> findAllStockPlaceByGroupID(int stockID) {
        TStock stock = stockReposition.findByFItemID(stockID);
        return placeReposition.findByFSPGroup(stock.getfSPGroupID());
    }

    public List<TStockPlaceGroup> findAllStockPlaceGroup() {
        return groupReposition.findAll();
    }


}
