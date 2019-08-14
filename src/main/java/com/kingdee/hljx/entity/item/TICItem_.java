package com.kingdee.hljx.entity.item;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TICItem.class)
public class TICItem_ {
    public static volatile SingularAttribute<TICItem, Integer> fItemID;
    public static volatile SingularAttribute<TICItem, String> fName;
    public static volatile SingularAttribute<TICItem, String> fNumber;
    public static volatile SingularAttribute<TICItem, String> fHelpCode;
    public static volatile SingularAttribute<TICItem, String> fModel;
    public static volatile SingularAttribute<TICItem, Integer> fDeleted;

}
