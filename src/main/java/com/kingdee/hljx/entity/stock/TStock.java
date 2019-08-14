/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.stock;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author moon
 */
@Entity
@Table(name = "t_Stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("5")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TStock.findAll", query = "SELECT t FROM TStock t")
        , @NamedQuery(name = "TStock.findByFItemID", query = "SELECT t FROM TStock t WHERE t.fItemID = :fItemID")
        , @NamedQuery(name = "TStock.findByFBrNO", query = "SELECT t FROM TStock t WHERE t.fBrNO = :fBrNO")
        , @NamedQuery(name = "TStock.findByFHelperCode", query = "SELECT t FROM TStock t WHERE t.fHelperCode = :fHelperCode")
        , @NamedQuery(name = "TStock.findByFEmpID", query = "SELECT t FROM TStock t WHERE t.fEmpID = :fEmpID")
        , @NamedQuery(name = "TStock.findByFAddress", query = "SELECT t FROM TStock t WHERE t.fAddress = :fAddress")
        , @NamedQuery(name = "TStock.findByFPhone", query = "SELECT t FROM TStock t WHERE t.fPhone = :fPhone")
        , @NamedQuery(name = "TStock.findByFProperty", query = "SELECT t FROM TStock t WHERE t.fProperty = :fProperty")
        , @NamedQuery(name = "TStock.findByFBWorkShop", query = "SELECT t FROM TStock t WHERE t.fBWorkShop = :fBWorkShop")
        , @NamedQuery(name = "TStock.findByFName", query = "SELECT t FROM TStock t WHERE t.fName = :fName")
        , @NamedQuery(name = "TStock.findByFNumber", query = "SELECT t FROM TStock t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TStock.findByFParentID", query = "SELECT t FROM TStock t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TStock.findByFDeleted", query = "SELECT t FROM TStock t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TStock.findByFShortNumber", query = "SELECT t FROM TStock t WHERE t.fShortNumber = :fShortNumber")
        , @NamedQuery(name = "TStock.findByFTypeID", query = "SELECT t FROM TStock t WHERE t.fTypeID = :fTypeID")
        , @NamedQuery(name = "TStock.findByFIsStockMgr", query = "SELECT t FROM TStock t WHERE t.fIsStockMgr = :fIsStockMgr")
        , @NamedQuery(name = "TStock.findByFSPGroupID", query = "SELECT t FROM TStock t WHERE t.fSPGroupID = :fSPGroupID")
        , @NamedQuery(name = "TStock.findByFMRPAvail", query = "SELECT t FROM TStock t WHERE t.fMRPAvail = :fMRPAvail")
        , @NamedQuery(name = "TStock.findByFGroupID", query = "SELECT t FROM TStock t WHERE t.fGroupID = :fGroupID")
        , @NamedQuery(name = "TStock.findByFStockGroupID", query = "SELECT t FROM TStock t WHERE t.fStockGroupID = :fStockGroupID")
        , @NamedQuery(name = "TStock.findByFCalcCostOrder", query = "SELECT t FROM TStock t WHERE t.fCalcCostOrder = :fCalcCostOrder")
        , @NamedQuery(name = "TStock.findByFPlanArea", query = "SELECT t FROM TStock t WHERE t.fPlanArea = :fPlanArea")
        , @NamedQuery(name = "TStock.findByFUnderStock", query = "SELECT t FROM TStock t WHERE t.fUnderStock = :fUnderStock")
        , @NamedQuery(name = "TStock.findByFIncludeAccounting", query = "SELECT t FROM TStock t WHERE t.fIncludeAccounting = :fIncludeAccounting")})
public class TStock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FItemID")
    private Integer fItemID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FBrNO")
    private String fBrNO;
    @Size(max = 30)
    @Column(name = "FHelperCode")
    private String fHelperCode;
    @Column(name = "FEmpID")
    private Integer fEmpID;
    @Size(max = 255)
    @Column(name = "FAddress")
    private String fAddress;
    @Size(max = 30)
    @Column(name = "FPhone")
    private String fPhone;
    @Column(name = "FProperty")
    private Short fProperty;
    @Column(name = "FBWorkShop")
    private Integer fBWorkShop;
    @Size(max = 255)
    @Column(name = "FName")
    private String fName;
    @Size(max = 80)
    @Column(name = "FNumber")
    private String fNumber;
    @Column(name = "FParentID")
    private Integer fParentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private short fDeleted;
    @Size(max = 30)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FTypeID")
    private int fTypeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIsStockMgr")
    private boolean fIsStockMgr;
    @JoinColumn(name = "FSPGroupID", referencedColumnName = "FSPGroupID")
    @ManyToOne
    private TStockPlaceGroup fSPGroupID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FMRPAvail")
    private boolean fMRPAvail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FGroupID")
    private int fGroupID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FStockGroupID")
    private int fStockGroupID;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Column(name = "FCalcCostOrder")
    private Integer fCalcCostOrder;
    @Column(name = "FPlanArea")
    private Integer fPlanArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUnderStock")
    private int fUnderStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIncludeAccounting")
    private boolean fIncludeAccounting;


    public TStock(Integer fItemID) {
        this.fItemID = fItemID;
    }

    public Integer getfItemID() {
        return fItemID;
    }

    public TStockPlaceGroup getfSPGroupID() {
        return fSPGroupID;
    }

    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return "TStock{" +
                "fItemID=" + fItemID +
                ", fBrNO='" + fBrNO + '\'' +
                ", fHelperCode='" + fHelperCode + '\'' +
                ", fEmpID=" + fEmpID +
                ", fAddress='" + fAddress + '\'' +
                ", fPhone='" + fPhone + '\'' +
                ", fProperty=" + fProperty +
                ", fBWorkShop=" + fBWorkShop +
                ", fName='" + fName + '\'' +
                ", fNumber='" + fNumber + '\'' +
                ", fParentID=" + fParentID +
                ", fDeleted=" + fDeleted +
                ", fShortNumber='" + fShortNumber + '\'' +
                ", fTypeID=" + fTypeID +
                ", fIsStockMgr=" + fIsStockMgr +
                ", fSPGroupID=" + fSPGroupID +
                ", fMRPAvail=" + fMRPAvail +
                ", fGroupID=" + fGroupID +
                ", fStockGroupID=" + fStockGroupID +
                ", fModifyTime=" + Arrays.toString(fModifyTime) +
                ", fCalcCostOrder=" + fCalcCostOrder +
                ", fPlanArea=" + fPlanArea +
                ", fUnderStock=" + fUnderStock +
                ", fIncludeAccounting=" + fIncludeAccounting +
                '}';
    }
}
