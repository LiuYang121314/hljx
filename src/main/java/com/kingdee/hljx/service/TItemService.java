package com.kingdee.hljx.service;

import com.kingdee.hljx.dao.ItemDao;
import com.kingdee.hljx.entity.ext.TItem3001;
import com.kingdee.hljx.entity.ext.TItem3001_;
import com.kingdee.hljx.entity.item.*;
import com.kingdee.hljx.repository.ext.TItem3001Reposition;
import com.kingdee.hljx.repository.item.TEmpReposition;
import com.kingdee.hljx.repository.item.TICItemReposition;
import com.kingdee.hljx.repository.item.TItemReposition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class TItemService {

    private static final Logger logger = LoggerFactory.getLogger(TItemService.class);

    @Resource
    private ItemDao itemDao;

    public List<TItem3001> getTItem3001() {
        return itemDao.getTItem3001();
    }

    public TItem3001 getTItem3001ByFItemID(int fItemID) {
        return itemDao.getTItem3001ByFItemID(fItemID);
    }

    public TWorkCenter getTWorkCenterByFItemID(int fItemID) {
        return itemDao.getTWorkCenterByFItemID(fItemID);
    }
//
//    public List<TICItem> getAllTICItems(){
//        return ticItemReposition.findByFItemID(615);
//    }


    //    public List<TItem> getAllTItems(){
//        return tItemReposition.findAll();
//    }
//
    public List<TICItem> getICItems(String fNumber) {
        return itemDao.getICItemsByFNumber(fNumber);
    }

    public TICItem getICItemByFItemID(int fItemID) {
        return itemDao.getICItemByFItemID(fItemID);
    }
//
//    public List<TEmp> getAllTEmp(){
//        return tEmpReposition.findAll();
//    }
//
//    public List<TItem3001> findTItem3001(String key) {
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<TItem3001> cq = cb.createQuery(TItem3001.class);
//        Root<TItem3001> rt=cq.from(TItem3001.class);
//        logger.warn((cb == null) + "");
//        logger.warn((rt == null )+"");
//        cq.where(
//                cb.or(
//                        cb.like(rt.get(TItem3001_.fName), "%"+key+"%"),
//                        cb.like(rt.get(TItem3001_.f104), "%"+key.toUpperCase()+"%"),
//                        cb.like(rt.get(TItem3001_.fNumber), "%"+key+"%")
//                )
//        );
//        cq.select(rt);
//        TypedQuery<TItem3001> q = em.createQuery(cq);
//        return q.getResultList();
//    }
}
