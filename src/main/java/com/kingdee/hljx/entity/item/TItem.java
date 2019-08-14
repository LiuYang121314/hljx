/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.item;


import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author moon
 */
@Entity
@Table(name = "t_Item")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "FItemClassID", discriminatorType = DiscriminatorType.INTEGER)
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TItem.findAll", query = "SELECT t FROM TItem t")
        , @NamedQuery(name = "TItem.findByFItemID", query = "SELECT t FROM TItem t WHERE t.fItemID = :fItemID")
        , @NamedQuery(name = "TItem.findByFExternID", query = "SELECT t FROM TItem t WHERE t.fExternID = :fExternID")
        , @NamedQuery(name = "TItem.findByFNumber", query = "SELECT t FROM TItem t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TItem.findByFLevel", query = "SELECT t FROM TItem t WHERE t.fLevel = :fLevel")
        , @NamedQuery(name = "TItem.findByFDetail", query = "SELECT t FROM TItem t WHERE t.fDetail = :fDetail")
        , @NamedQuery(name = "TItem.findByFName", query = "SELECT t FROM TItem t WHERE t.fName = :fName")
        , @NamedQuery(name = "TItem.findByFUnUsed", query = "SELECT t FROM TItem t WHERE t.fUnUsed = :fUnUsed")
        , @NamedQuery(name = "TItem.findByFBrNo", query = "SELECT t FROM TItem t WHERE t.fBrNo = :fBrNo")
        , @NamedQuery(name = "TItem.findByFFullNumber", query = "SELECT t FROM TItem t WHERE t.fFullNumber = :fFullNumber")
        , @NamedQuery(name = "TItem.findByFDiff", query = "SELECT t FROM TItem t WHERE t.fDiff = :fDiff")
        , @NamedQuery(name = "TItem.findByFDeleted", query = "SELECT t FROM TItem t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TItem.findByFShortNumber", query = "SELECT t FROM TItem t WHERE t.fShortNumber = :fShortNumber")
        , @NamedQuery(name = "TItem.findByFFullName", query = "SELECT t FROM TItem t WHERE t.fFullName = :fFullName")
        , @NamedQuery(name = "TItem.findByUuid", query = "SELECT t FROM TItem t WHERE t.uuid = :uuid")
        , @NamedQuery(name = "TItem.findByFGRCommonID", query = "SELECT t FROM TItem t WHERE t.fGRCommonID = :fGRCommonID")
        , @NamedQuery(name = "TItem.findByFSystemType", query = "SELECT t FROM TItem t WHERE t.fSystemType = :fSystemType")
        , @NamedQuery(name = "TItem.findByFUseSign", query = "SELECT t FROM TItem t WHERE t.fUseSign = :fUseSign")
        , @NamedQuery(name = "TItem.findByFChkUserID", query = "SELECT t FROM TItem t WHERE t.fChkUserID = :fChkUserID")
        , @NamedQuery(name = "TItem.findByFAccessory", query = "SELECT t FROM TItem t WHERE t.fAccessory = :fAccessory")
        , @NamedQuery(name = "TItem.findByFGrControl", query = "SELECT t FROM TItem t WHERE t.fGrControl = :fGrControl")
        , @NamedQuery(name = "TItem.findByFHavePicture", query = "SELECT t FROM TItem t WHERE t.fHavePicture = :fHavePicture")
})
public abstract class TItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    private Integer fItemID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FExternID")
    private int fExternID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLevel")
    private short fLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDetail")
    private boolean fDetail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;
    @Column(name = "FUnUsed")
    private Boolean fUnUsed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FBrNo")
    private String fBrNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FFullNumber")
    private String fFullNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDiff")
    private boolean fDiff;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private Short fDeleted;
    @Size(max = 80)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Size(max = 255)
    @Column(name = "FFullName")
    private String fFullName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UUID")
    private String uuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FGRCommonID")
    private int fGRCommonID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FSystemType")
    private int fSystemType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUseSign")
    private int fUseSign;
    @Column(name = "FChkUserID")
    private Integer fChkUserID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FAccessory")
    private short fAccessory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FGrControl")
    private int fGrControl;
    @Basic(optional = false)
    @NotNull
////    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FHavePicture")
    private short fHavePicture;
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "FParentID", referencedColumnName = "FItemID")
    @ManyToOne(optional = true, targetEntity = TEmp.class)
    private TItem tItem;
//    @JoinColumn(name="FParentID",referencedColumnName = "FItemID")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fParentID")
//    private List<TItem> tItemList;


    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "FItemClassID")
    @ManyToOne(optional = true)
    private TItemClass fItemClassID;

//    @XmlTransient
//    public List<TItem> getTItemList() {
//        return tItemList;
//    }
//
//    public void setTItemList(List<TItem> tItemList) {
//        this.tItemList = tItemList;
//    }

    public void setfItemID(Integer fItemID) {
        this.fItemID = fItemID;
    }

    public void setfExternID(int fExternID) {
        this.fExternID = fExternID;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public void setfLevel(short fLevel) {
        this.fLevel = fLevel;
    }

    public void setfDetail(boolean fDetail) {
        this.fDetail = fDetail;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setfUnUsed(Boolean fUnUsed) {
        this.fUnUsed = fUnUsed;
    }

    public void setfBrNo(String fBrNo) {
        this.fBrNo = fBrNo;
    }

    public void setfFullNumber(String fFullNumber) {
        this.fFullNumber = fFullNumber;
    }

    public void setfDiff(boolean fDiff) {
        this.fDiff = fDiff;
    }

    public void setfDeleted(Short fDeleted) {
        this.fDeleted = fDeleted;
    }

    public void setfShortNumber(String fShortNumber) {
        this.fShortNumber = fShortNumber;
    }

    public void setfFullName(String fFullName) {
        this.fFullName = fFullName;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setfGRCommonID(int fGRCommonID) {
        this.fGRCommonID = fGRCommonID;
    }

    public void setfSystemType(int fSystemType) {
        this.fSystemType = fSystemType;
    }

    public void setfUseSign(int fUseSign) {
        this.fUseSign = fUseSign;
    }

    public void setfChkUserID(Integer fChkUserID) {
        this.fChkUserID = fChkUserID;
    }

    public void setfAccessory(short fAccessory) {
        this.fAccessory = fAccessory;
    }

    public void setfGrControl(int fGrControl) {
        this.fGrControl = fGrControl;
    }

    public void setfModifyTime(byte[] fModifyTime) {
        this.fModifyTime = fModifyTime;
    }

    public void setfHavePicture(short fHavePicture) {
        this.fHavePicture = fHavePicture;
    }


//    public void setfParentID(TItem fParentID) {
//        this.fParentID = fParentID;
//    }

    public void setfItemClassID(TItemClass fItemClassID) {
        this.fItemClassID = fItemClassID;
    }

    public Integer getfItemID() {
        return fItemID;
    }

    public int getfExternID() {
        return fExternID;
    }

    public String getfNumber() {
        return fNumber;
    }

    public short getfLevel() {
        return fLevel;
    }

    public boolean isfDetail() {
        return fDetail;
    }

    public String getfName() {
        return fName;
    }

    public Boolean getfUnUsed() {
        return fUnUsed;
    }

    public String getfBrNo() {
        return fBrNo;
    }

    public String getfFullNumber() {
        return fFullNumber;
    }

    public boolean isfDiff() {
        return fDiff;
    }

    public Short getfDeleted() {
        return fDeleted;
    }

    public String getfShortNumber() {
        return fShortNumber;
    }

    public String getfFullName() {
        return fFullName;
    }

    public String getUuid() {
        return uuid;
    }

    public int getfGRCommonID() {
        return fGRCommonID;
    }

    public int getfSystemType() {
        return fSystemType;
    }

    public int getfUseSign() {
        return fUseSign;
    }

    public Integer getfChkUserID() {
        return fChkUserID;
    }

    public short getfAccessory() {
        return fAccessory;
    }

    //
    public int getfGrControl() {
        return fGrControl;
    }

    public byte[] getfModifyTime() {
        return fModifyTime;
    }

    public short getfHavePicture() {
        return fHavePicture;
    }


//    public TItem getfParentID() {
//        return fParentID;
//    }

    public TItemClass getfItemClassID() {
        return fItemClassID;
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
        if (!(object instanceof TItem)) {
            return false;
        }
        TItem other = (TItem) object;
        if ((this.fItemID == null && other.fItemID != null) || (this.fItemID != null && !this.fItemID.equals(other.fItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TItem{" + "fItemID=" + fItemID + ", fItemClassID=" +
//                fItemClassID
                +'}';
    }

}