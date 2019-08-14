/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.item;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 * @author moon
 */
@Entity
@Table(name = "t_ItemClass")
@Getter
@Setter
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TItemClass.findAll", query = "SELECT t FROM TItemClass t")
        , @NamedQuery(name = "TItemClass.findByFItemClassID", query = "SELECT t FROM TItemClass t WHERE t.fItemClassID = :fItemClassID")
        , @NamedQuery(name = "TItemClass.findByFNumber", query = "SELECT t FROM TItemClass t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TItemClass.findByFName", query = "SELECT t FROM TItemClass t WHERE t.fName = :fName")
        , @NamedQuery(name = "TItemClass.findByFNamecht", query = "SELECT t FROM TItemClass t WHERE t.fNamecht = :fNamecht")
        , @NamedQuery(name = "TItemClass.findByFNameen", query = "SELECT t FROM TItemClass t WHERE t.fNameen = :fNameen")
        , @NamedQuery(name = "TItemClass.findByFSQLTableName", query = "SELECT t FROM TItemClass t WHERE t.fSQLTableName = :fSQLTableName")
        , @NamedQuery(name = "TItemClass.findByFVersion", query = "SELECT t FROM TItemClass t WHERE t.fVersion = :fVersion")
        , @NamedQuery(name = "TItemClass.findByFImport", query = "SELECT t FROM TItemClass t WHERE t.fImport = :fImport")
        , @NamedQuery(name = "TItemClass.findByFBrNo", query = "SELECT t FROM TItemClass t WHERE t.fBrNo = :fBrNo")
        , @NamedQuery(name = "TItemClass.findByFUserDefilast", query = "SELECT t FROM TItemClass t WHERE t.fUserDefilast = :fUserDefilast")
        , @NamedQuery(name = "TItemClass.findByFType", query = "SELECT t FROM TItemClass t WHERE t.fType = :fType")
        , @NamedQuery(name = "TItemClass.findByFGRType", query = "SELECT t FROM TItemClass t WHERE t.fGRType = :fGRType")
        , @NamedQuery(name = "TItemClass.findByFRemark", query = "SELECT t FROM TItemClass t WHERE t.fRemark = :fRemark")
        , @NamedQuery(name = "TItemClass.findByFGrControl", query = "SELECT t FROM TItemClass t WHERE t.fGrControl = :fGrControl")
        , @NamedQuery(name = "TItemClass.findByUuid", query = "SELECT t FROM TItemClass t WHERE t.uuid = :uuid")
})

//虽然t_ItemClass 继承 t_Item 表，但是t_ItemClass 里面没有FItemID ！如果继承TItem的话，查询的时候，sql会拼上父类继承来的属性————FItem，
// 就报错了！
public class TItemClass /*extends TItem*/ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FItemClassID")
    private Integer fItemClassID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;
    @Size(max = 255)
    @Column(name = "FName_cht")
    private String fNamecht;
    @Size(max = 255)
    @Column(name = "FName_en")
    private String fNameen;
    @Size(max = 30)
    @Column(name = "FSQLTableName")
    private String fSQLTableName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FVersion")
    private short fVersion;
    @Column(name = "FImport")
    private Boolean fImport;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FBrNo")
    private String fBrNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUserDefilast")
    private int fUserDefilast;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FType")
    private short fType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FGRType")
    private short fGRType;
    @Size(max = 80)
    @Column(name = "FRemark")
    private String fRemark;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FGrControl")
    private int fGrControl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UUID")
    private String uuid;


//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fItemClassID")
//    private List<TItem> tItemList;

//    @XmlTransient
//    public List<TItem> getTItemList() {
//        return tItemList;
//    }
//
//    public void setTItemList(List<TItem> tItemList) {
//        this.tItemList = tItemList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fItemClassID != null ? fItemClassID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TItemClass)) {
            return false;
        }
        TItemClass other = (TItemClass) object;
        if ((this.fItemClassID == null && other.fItemClassID != null) || (this.fItemClassID != null && !this.fItemClassID.equals(other.fItemClassID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.TItemClass[ fItemClassID=" + fItemClassID + " ]";
    }

}
