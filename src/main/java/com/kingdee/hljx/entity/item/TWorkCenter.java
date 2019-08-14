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
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 工作中心
 *
 * @author moon
 */
@Entity
@Table(name = "t_WorkCenter")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TWorkCenter.findAll", query = "SELECT t FROM TWorkCenter t")
        , @NamedQuery(name = "TWorkCenter.findByFItemID", query = "SELECT t FROM TWorkCenter t WHERE t.fItemID = :fItemID")
        , @NamedQuery(name = "TWorkCenter.findByFName", query = "SELECT t FROM TWorkCenter t WHERE t.fName = :fName")
        , @NamedQuery(name = "TWorkCenter.findByFDeptID", query = "SELECT t FROM TWorkCenter t WHERE t.fDeptID = :fDeptID")
        , @NamedQuery(name = "TWorkCenter.findByFNote", query = "SELECT t FROM TWorkCenter t WHERE t.fNote = :fNote")
        , @NamedQuery(name = "TWorkCenter.findByFParentID", query = "SELECT t FROM TWorkCenter t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TWorkCenter.findByFDeleted", query = "SELECT t FROM TWorkCenter t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TWorkCenter.findByFShortNumber", query = "SELECT t FROM TWorkCenter t WHERE t.fShortNumber = :fShortNumber")
        , @NamedQuery(name = "TWorkCenter.findByFNumber", query = "SELECT t FROM TWorkCenter t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TWorkCenter.findByFCalID", query = "SELECT t FROM TWorkCenter t WHERE t.fCalID = :fCalID")
        , @NamedQuery(name = "TWorkCenter.findByFKey", query = "SELECT t FROM TWorkCenter t WHERE t.fKey = :fKey")
        , @NamedQuery(name = "TWorkCenter.findByFTeamTimeID", query = "SELECT t FROM TWorkCenter t WHERE t.fTeamTimeID = :fTeamTimeID")
        , @NamedQuery(name = "TWorkCenter.findByFWorkNumber", query = "SELECT t FROM TWorkCenter t WHERE t.fWorkNumber = :fWorkNumber")
        , @NamedQuery(name = "TWorkCenter.findByFDeviceNum", query = "SELECT t FROM TWorkCenter t WHERE t.fDeviceNum = :fDeviceNum")
        , @NamedQuery(name = "TWorkCenter.findByFPersonNum", query = "SELECT t FROM TWorkCenter t WHERE t.fPersonNum = :fPersonNum")
        , @NamedQuery(name = "TWorkCenter.findByFUseingRate", query = "SELECT t FROM TWorkCenter t WHERE t.fUseingRate = :fUseingRate")
        , @NamedQuery(name = "TWorkCenter.findByFEfficiency", query = "SELECT t FROM TWorkCenter t WHERE t.fEfficiency = :fEfficiency")
        , @NamedQuery(name = "TWorkCenter.findByFUnitCost", query = "SELECT t FROM TWorkCenter t WHERE t.fUnitCost = :fUnitCost")
        , @NamedQuery(name = "TWorkCenter.findByFWorkCapacity", query = "SELECT t FROM TWorkCenter t WHERE t.fWorkCapacity = :fWorkCapacity")
        , @NamedQuery(name = "TWorkCenter.findByFCapacityCalType", query = "SELECT t FROM TWorkCenter t WHERE t.fCapacityCalType = :fCapacityCalType")
        , @NamedQuery(name = "TWorkCenter.findByFCostCenterID", query = "SELECT t FROM TWorkCenter t WHERE t.fCostCenterID = :fCostCenterID")
        , @NamedQuery(name = "TWorkCenter.findByF102", query = "SELECT t FROM TWorkCenter t WHERE t.f102 = :f102")})
public class TWorkCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FItemID")
    private Integer fItemID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName")
    private String fName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeptID")
    private int fDeptID;
    @Size(max = 255)
    @Column(name = "FNote")
    private String fNote;
    @Column(name = "FParentID")
    private Integer fParentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private short fDeleted;
    @Size(max = 80)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Size(max = 80)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCalID")
    private int fCalID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FKey")
    private boolean fKey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FTeamTimeID")
    private int fTeamTimeID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FWorkNumber")
    private BigDecimal fWorkNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeviceNum")
    private int fDeviceNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FPersonNum")
    private int fPersonNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUseingRate")
    private BigDecimal fUseingRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEfficiency")
    private BigDecimal fEfficiency;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUnitCost")
    private BigDecimal fUnitCost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FWorkCapacity")
    private BigDecimal fWorkCapacity;
    @Column(name = "FCapacityCalType")
    private Integer fCapacityCalType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCostCenterID")
    private int fCostCenterID;
    @Column(name = "F_102")
    private Integer f102;

    public TWorkCenter() {
    }

    public TWorkCenter(Integer fItemID) {
        this.fItemID = fItemID;
    }

    public TWorkCenter(Integer fItemID, String fName, int fDeptID, short fDeleted, byte[] fModifyTime, int fCalID, boolean fKey, int fTeamTimeID, int fDeviceNum, int fPersonNum, BigDecimal fUseingRate, BigDecimal fEfficiency, BigDecimal fUnitCost, BigDecimal fWorkCapacity, int fCostCenterID) {
        this.fItemID = fItemID;
        this.fName = fName;
        this.fDeptID = fDeptID;
        this.fDeleted = fDeleted;
        this.fModifyTime = fModifyTime;
        this.fCalID = fCalID;
        this.fKey = fKey;
        this.fTeamTimeID = fTeamTimeID;
        this.fDeviceNum = fDeviceNum;
        this.fPersonNum = fPersonNum;
        this.fUseingRate = fUseingRate;
        this.fEfficiency = fEfficiency;
        this.fUnitCost = fUnitCost;
        this.fWorkCapacity = fWorkCapacity;
        this.fCostCenterID = fCostCenterID;
    }

    public Integer getFItemID() {
        return fItemID;
    }

    public void setFItemID(Integer fItemID) {
        this.fItemID = fItemID;
    }

    public String getFName() {
        return fName.replace("\n", "").replace("\r", "").trim();
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public int getFDeptID() {
        return fDeptID;
    }

    public void setFDeptID(int fDeptID) {
        this.fDeptID = fDeptID;
    }

    public String getFNote() {
        return fNote;
    }

    public void setFNote(String fNote) {
        this.fNote = fNote;
    }

    public Integer getFParentID() {
        return fParentID;
    }

    public void setFParentID(Integer fParentID) {
        this.fParentID = fParentID;
    }

    public short getFDeleted() {
        return fDeleted;
    }

    public void setFDeleted(short fDeleted) {
        this.fDeleted = fDeleted;
    }

    public String getFShortNumber() {
        return fShortNumber;
    }

    public void setFShortNumber(String fShortNumber) {
        this.fShortNumber = fShortNumber;
    }

    public String getFNumber() {
        return fNumber;
    }

    public void setFNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public byte[] getFModifyTime() {
        return fModifyTime;
    }

    public void setFModifyTime(byte[] fModifyTime) {
        this.fModifyTime = fModifyTime;
    }

    public int getFCalID() {
        return fCalID;
    }

    public void setFCalID(int fCalID) {
        this.fCalID = fCalID;
    }

    public boolean getFKey() {
        return fKey;
    }

    public void setFKey(boolean fKey) {
        this.fKey = fKey;
    }

    public int getFTeamTimeID() {
        return fTeamTimeID;
    }

    public void setFTeamTimeID(int fTeamTimeID) {
        this.fTeamTimeID = fTeamTimeID;
    }

    public BigDecimal getFWorkNumber() {
        return fWorkNumber;
    }

    public void setFWorkNumber(BigDecimal fWorkNumber) {
        this.fWorkNumber = fWorkNumber;
    }

    public int getFDeviceNum() {
        return fDeviceNum;
    }

    public void setFDeviceNum(int fDeviceNum) {
        this.fDeviceNum = fDeviceNum;
    }

    public int getFPersonNum() {
        return fPersonNum;
    }

    public void setFPersonNum(int fPersonNum) {
        this.fPersonNum = fPersonNum;
    }

    public BigDecimal getFUseingRate() {
        return fUseingRate;
    }

    public void setFUseingRate(BigDecimal fUseingRate) {
        this.fUseingRate = fUseingRate;
    }

    public BigDecimal getFEfficiency() {
        return fEfficiency;
    }

    public void setFEfficiency(BigDecimal fEfficiency) {
        this.fEfficiency = fEfficiency;
    }

    public BigDecimal getFUnitCost() {
        return fUnitCost;
    }

    public void setFUnitCost(BigDecimal fUnitCost) {
        this.fUnitCost = fUnitCost;
    }

    public BigDecimal getFWorkCapacity() {
        return fWorkCapacity;
    }

    public void setFWorkCapacity(BigDecimal fWorkCapacity) {
        this.fWorkCapacity = fWorkCapacity;
    }

    public Integer getFCapacityCalType() {
        return fCapacityCalType;
    }

    public void setFCapacityCalType(Integer fCapacityCalType) {
        this.fCapacityCalType = fCapacityCalType;
    }

    public int getFCostCenterID() {
        return fCostCenterID;
    }

    public void setFCostCenterID(int fCostCenterID) {
        this.fCostCenterID = fCostCenterID;
    }

    public Integer getF102() {
        return f102;
    }

    public void setF102(Integer f102) {
        this.f102 = f102;
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
        if (!(object instanceof TWorkCenter)) {
            return false;
        }
        TWorkCenter other = (TWorkCenter) object;
        if ((this.fItemID == null && other.fItemID != null) || (this.fItemID != null && !this.fItemID.equals(other.fItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.item.TWorkCenter[ fItemID=" + fItemID + " ]";
    }

}
