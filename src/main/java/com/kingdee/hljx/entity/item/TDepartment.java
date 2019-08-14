/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.item;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author moon
 */
@Entity
@Table(name = "t_Department")
@DiscriminatorValue("2")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TDepartment.findAll", query = "SELECT t FROM TDepartment t")
        , @NamedQuery(name = "TDepartment.findByFItemID", query = "SELECT t FROM TDepartment t WHERE t.fItemID = :fItemID")
        , @NamedQuery(name = "TDepartment.findByFBrNO", query = "SELECT t FROM TDepartment t WHERE t.fBrNO = :fBrNO")
        , @NamedQuery(name = "TDepartment.findByFManager", query = "SELECT t FROM TDepartment t WHERE t.fManager = :fManager")
        , @NamedQuery(name = "TDepartment.findByFPhone", query = "SELECT t FROM TDepartment t WHERE t.fPhone = :fPhone")
        , @NamedQuery(name = "TDepartment.findByFFax", query = "SELECT t FROM TDepartment t WHERE t.fFax = :fFax")
        , @NamedQuery(name = "TDepartment.findByFNote", query = "SELECT t FROM TDepartment t WHERE t.fNote = :fNote")
        , @NamedQuery(name = "TDepartment.findByFNumber", query = "SELECT t FROM TDepartment t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TDepartment.findByFName", query = "SELECT t FROM TDepartment t WHERE t.fName = :fName")
        , @NamedQuery(name = "TDepartment.findByFParentID", query = "SELECT t FROM TDepartment t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TDepartment.findByFDProperty", query = "SELECT t FROM TDepartment t WHERE t.fDProperty = :fDProperty")
        , @NamedQuery(name = "TDepartment.findByFDStock", query = "SELECT t FROM TDepartment t WHERE t.fDStock = :fDStock")
        , @NamedQuery(name = "TDepartment.findByFDeleted", query = "SELECT t FROM TDepartment t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TDepartment.findByFShortNumber", query = "SELECT t FROM TDepartment t WHERE t.fShortNumber = :fShortNumber")
        , @NamedQuery(name = "TDepartment.findByFAcctID", query = "SELECT t FROM TDepartment t WHERE t.fAcctID = :fAcctID")
        , @NamedQuery(name = "TDepartment.findByFCostAccountType", query = "SELECT t FROM TDepartment t WHERE t.fCostAccountType = :fCostAccountType")
        , @NamedQuery(name = "TDepartment.findByFCalID", query = "SELECT t FROM TDepartment t WHERE t.fCalID = :fCalID")
        , @NamedQuery(name = "TDepartment.findByFPlanArea", query = "SELECT t FROM TDepartment t WHERE t.fPlanArea = :fPlanArea")
        , @NamedQuery(name = "TDepartment.findByFOtherARAcctID", query = "SELECT t FROM TDepartment t WHERE t.fOtherARAcctID = :fOtherARAcctID")
        , @NamedQuery(name = "TDepartment.findByFOtherAPAcctID", query = "SELECT t FROM TDepartment t WHERE t.fOtherAPAcctID = :fOtherAPAcctID")
        , @NamedQuery(name = "TDepartment.findByFPreARAcctID", query = "SELECT t FROM TDepartment t WHERE t.fPreARAcctID = :fPreARAcctID")
        , @NamedQuery(name = "TDepartment.findByFPreAPAcctID", query = "SELECT t FROM TDepartment t WHERE t.fPreAPAcctID = :fPreAPAcctID")
        , @NamedQuery(name = "TDepartment.findByFIsCreditMgr", query = "SELECT t FROM TDepartment t WHERE t.fIsCreditMgr = :fIsCreditMgr")
        , @NamedQuery(name = "TDepartment.findByFIsVDept", query = "SELECT t FROM TDepartment t WHERE t.fIsVDept = :fIsVDept")})
public class TDepartment extends TItem {


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
    @Column(name = "FManager")
    private Integer fManager;
    @Size(max = 30)
    @Column(name = "FPhone")
    private String fPhone;
    @Size(max = 30)
    @Column(name = "FFax")
    private String fFax;
    @Size(max = 255)
    @Column(name = "FNote")
    private String fNote;
    @Size(max = 255)
    @Column(name = "FNumber")
    private String fNumber;
    @Size(max = 255)
    @Column(name = "FName")
    private String fName;
    @Column(name = "FParentID")
    private Integer fParentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDProperty")
    private int fDProperty;
    @Column(name = "FDStock")
    private Integer fDStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private short fDeleted;
    @Size(max = 80)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FAcctID")
    private int fAcctID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCostAccountType")
    private int fCostAccountType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FModifyTime")
//    @Lob
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCalID")
    private int fCalID;
    @Column(name = "FPlanArea")
    private Integer fPlanArea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOtherARAcctID")
    private int fOtherARAcctID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOtherAPAcctID")
    private int fOtherAPAcctID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FPreARAcctID")
    private int fPreARAcctID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FPreAPAcctID")
    private int fPreAPAcctID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIsCreditMgr")
    private boolean fIsCreditMgr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIsVDept")
    private boolean fIsVDept;
    @OneToMany(mappedBy = "fDepartmentID")
    private List<TEmp> tEmps;

    public TDepartment() {
    }

    public TDepartment(Integer fItemID) {
        this.fItemID = fItemID;
    }

    public TDepartment(Integer fItemID, String fBrNO, int fDProperty, short fDeleted, int fAcctID, int fCostAccountType, byte[] fModifyTime, int fCalID, int fOtherARAcctID, int fOtherAPAcctID, int fPreARAcctID, int fPreAPAcctID, boolean fIsCreditMgr, boolean fIsVDept) {
        this.fItemID = fItemID;
        this.fBrNO = fBrNO;
        this.fDProperty = fDProperty;
        this.fDeleted = fDeleted;
        this.fAcctID = fAcctID;
        this.fCostAccountType = fCostAccountType;
        this.fModifyTime = fModifyTime;
        this.fCalID = fCalID;
        this.fOtherARAcctID = fOtherARAcctID;
        this.fOtherAPAcctID = fOtherAPAcctID;
        this.fPreARAcctID = fPreARAcctID;
        this.fPreAPAcctID = fPreAPAcctID;
        this.fIsCreditMgr = fIsCreditMgr;
        this.fIsVDept = fIsVDept;
    }

//    public Integer getFItemID() {
//        return fItemID;
//    }
//
//    public void setFItemID(Integer fItemID) {
//        this.fItemID = fItemID;
//    }

    public String getFBrNO() {
        return fBrNO;
    }

    public void setFBrNO(String fBrNO) {
        this.fBrNO = fBrNO;
    }

    public Integer getFManager() {
        return fManager;
    }

    public void setFManager(Integer fManager) {
        this.fManager = fManager;
    }

    public String getFPhone() {
        return fPhone;
    }

    public void setFPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    public String getFFax() {
        return fFax;
    }

    public void setFFax(String fFax) {
        this.fFax = fFax;
    }

    public String getFNote() {
        return fNote;
    }

    public void setFNote(String fNote) {
        this.fNote = fNote;
    }

//    public String getFNumber() {
//        return fNumber;
//    }
//
//    public void setFNumber(String fNumber) {
//        this.fNumber = fNumber;
//    }
//
//    public String getFName() {
//        return fName;
//    }
//
//    public void setFName(String fName) {
//        this.fName = fName;
//    }
//
//    public Integer getFParentID() {
//        return fParentID;
//    }
//
//    public void setFParentID(Integer fParentID) {
//        this.fParentID = fParentID;
//    }

    public int getFDProperty() {
        return fDProperty;
    }

    public void setFDProperty(int fDProperty) {
        this.fDProperty = fDProperty;
    }

    public Integer getFDStock() {
        return fDStock;
    }

    public void setFDStock(Integer fDStock) {
        this.fDStock = fDStock;
    }

//    public short getFDeleted() {
//        return fDeleted;
//    }
//
//    public void setFDeleted(short fDeleted) {
//        this.fDeleted = fDeleted;
//    }
//
//    public String getFShortNumber() {
//        return fShortNumber;
//    }
//
//    public void setFShortNumber(String fShortNumber) {
//        this.fShortNumber = fShortNumber;
//    }

    public int getFAcctID() {
        return fAcctID;
    }

    public void setFAcctID(int fAcctID) {
        this.fAcctID = fAcctID;
    }

    public int getFCostAccountType() {
        return fCostAccountType;
    }

    public void setFCostAccountType(int fCostAccountType) {
        this.fCostAccountType = fCostAccountType;
    }

//    public byte[] getFModifyTime() {
//        return fModifyTime;
//    }
//
//    public void setFModifyTime(byte[] fModifyTime) {
//        this.fModifyTime = fModifyTime;
//    }

    public int getFCalID() {
        return fCalID;
    }

    public void setFCalID(int fCalID) {
        this.fCalID = fCalID;
    }

    public Integer getFPlanArea() {
        return fPlanArea;
    }

    public void setFPlanArea(Integer fPlanArea) {
        this.fPlanArea = fPlanArea;
    }

    public int getFOtherARAcctID() {
        return fOtherARAcctID;
    }

    public void setFOtherARAcctID(int fOtherARAcctID) {
        this.fOtherARAcctID = fOtherARAcctID;
    }

    public int getFOtherAPAcctID() {
        return fOtherAPAcctID;
    }

    public void setFOtherAPAcctID(int fOtherAPAcctID) {
        this.fOtherAPAcctID = fOtherAPAcctID;
    }

    public int getFPreARAcctID() {
        return fPreARAcctID;
    }

    public void setFPreARAcctID(int fPreARAcctID) {
        this.fPreARAcctID = fPreARAcctID;
    }

    public int getFPreAPAcctID() {
        return fPreAPAcctID;
    }

    public void setFPreAPAcctID(int fPreAPAcctID) {
        this.fPreAPAcctID = fPreAPAcctID;
    }

    public boolean getFIsCreditMgr() {
        return fIsCreditMgr;
    }

    public void setFIsCreditMgr(boolean fIsCreditMgr) {
        this.fIsCreditMgr = fIsCreditMgr;
    }

    public boolean getFIsVDept() {
        return fIsVDept;
    }

    public void setFIsVDept(boolean fIsVDept) {
        this.fIsVDept = fIsVDept;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fItemID != null ? fItemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TDepartment)) {
            return false;
        }
        TDepartment other = (TDepartment) object;
        if ((this.fItemID == null && other.fItemID != null) || (this.fItemID != null && !this.fItemID.equals(other.fItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.TDepartment[ fItemID=" + fItemID + " ]";
    }

}
