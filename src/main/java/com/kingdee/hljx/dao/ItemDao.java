package com.kingdee.hljx.dao;


import com.kingdee.hljx.entity.ext.TItem3001;
import com.kingdee.hljx.entity.item.TICItem;
import com.kingdee.hljx.entity.item.TWorkCenter;

import java.util.List;

public interface ItemDao {
    public List<TItem3001> getTItem3001();

    public TItem3001 getTItem3001ByFItemID(int fItemID);

    public List<TICItem> getICItemsByFNumber(String fNumber);

    public TICItem getICItemByFItemID(int fItemID);

    public TWorkCenter getTWorkCenterByFItemID(int fItemID);

}
