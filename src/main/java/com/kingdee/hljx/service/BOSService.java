package com.kingdee.hljx.service;

import com.kingdee.hljx.dao.BOSDao;
import com.kingdee.hljx.entity.ext.TBOS200000001;
import com.kingdee.hljx.entity.ext.TBOS200000001Entry2;
import com.kingdee.hljx.entity.ext.TBOS200000007;
import com.kingdee.hljx.repository.ext.TBOS200000001Entry2Reposition;
import com.kingdee.hljx.repository.ext.TBOS200000001Repository;
import com.kingdee.hljx.repository.ext.TBOS200000007Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.List;

@Service
public class BOSService {
    @Resource
    private EntityManager em;
    @Resource
    private BOSDao bosDao;
    @Resource
    private TBOS200000007Repository tbos7Repository;
    @Resource
    private TBOS200000001Repository tbos1Repository;
    @Resource
    private TBOS200000001Entry2Reposition tbos2EntryRepository;

    public List<TBOS200000007> getPackageTypes() {
        return bosDao.findPackageTypes();
    }

    //受影响的行数
    public int saveTBOS200000007(TBOS200000007 tbos) {
        TBOS200000007 newBos = tbos7Repository.save(tbos);
        if (newBos == null) {
            return 0;
        } else if (newBos.getFid() == null || newBos.getFid() == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Transactional
    public int saveTBOS200000001(TBOS200000001 tbos, TBOS200000001Entry2 tbos2Entry) {

        String table = TBOS200000001.class.getAnnotation(Table.class).name();
        tbos.setFid(getNewBillFid(table));
        tbos.setfBillNo(getNewBillNo((long) 0, "", (long) 2));

        TBOS200000001 newBos = tbos1Repository.save(tbos);

        if (newBos == null || newBos.getFid() == null || newBos.getFid() == 0) {
            throw new RuntimeException("test3 runtime error");
        } else {
            tbos2Entry.setFid(newBos.getFid());

            TBOS200000001Entry2 newTbosEntry = tbos2EntryRepository.save(tbos2Entry);
            if (newTbosEntry == null || newTbosEntry.getFid() == 0) {
                throw new RuntimeException("test3 runtime error");
            } else {
                return 1;
            }
        }
    }

    private String getNewBillNo(Long itemid, String text, long classType) {
        StoredProcedureQuery query = em.createStoredProcedureQuery("p_BM_GetBillNo2");
        query.registerStoredProcedureParameter("ClassType", Long.class, ParameterMode.IN);//参数名与存储过程一致
        query.registerStoredProcedureParameter("ItemID", Long.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("Text", String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("BillNo", String.class, ParameterMode.OUT);
        query.setParameter("ClassType", classType);
        query.setParameter("ItemID", itemid);
        query.setParameter("Text", text);
        query.execute();
        return (String) query.getOutputParameterValue("BillNo");
    }

    public int getNewBillFid(String tableName) {
        StoredProcedureQuery query = em.createStoredProcedureQuery("GetICMaxNum");
        query.registerStoredProcedureParameter("TableName", String.class, ParameterMode.IN);//参数名与存储过程一致
        query.registerStoredProcedureParameter("FInterID", Long.class, ParameterMode.OUT);
        query.setParameter("TableName", tableName);
        query.execute();
        Object o = query.getOutputParameterValue("FInterID");
        return Integer.parseInt(o.toString());
    }

    public TBOS200000001 findOne() {
        return tbos1Repository.findAll().get(0);
    }
}
