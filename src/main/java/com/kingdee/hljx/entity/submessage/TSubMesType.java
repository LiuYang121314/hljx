/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.submessage;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author moon
 */
@Entity
@Table(name = "t_SubMesType")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TSubMesType.findAll", query = "SELECT t FROM TSubMesType t")
        , @NamedQuery(name = "TSubMesType.findByFTypeID", query = "SELECT t FROM TSubMesType t WHERE t.fTypeID = :fTypeID")
        , @NamedQuery(name = "TSubMesType.findByFName", query = "SELECT t FROM TSubMesType t WHERE t.fName = :fName")
        , @NamedQuery(name = "TSubMesType.findByFDetail", query = "SELECT t FROM TSubMesType t WHERE t.fDetail = :fDetail")
        , @NamedQuery(name = "TSubMesType.findByFType", query = "SELECT t FROM TSubMesType t WHERE t.fType = :fType")
        , @NamedQuery(name = "TSubMesType.findByFGRType", query = "SELECT t FROM TSubMesType t WHERE t.fGRType = :fGRType")
        , @NamedQuery(name = "TSubMesType.findByUuid", query = "SELECT t FROM TSubMesType t WHERE t.uuid = :uuid")})
public class TSubMesType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FTypeID")
    private Integer fTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;
    @Column(name = "FDetail")
    private Short fDetail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FType")
    private short fType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FGRType")
    private short fGRType;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UUID")
    private String uuid;

    public TSubMesType() {
    }

    public TSubMesType(Integer fTypeID) {
        this.fTypeID = fTypeID;
    }

    public TSubMesType(Integer fTypeID, String fName, short fType, short fGRType, byte[] fModifyTime, String uuid) {
        this.fTypeID = fTypeID;
        this.fName = fName;
        this.fType = fType;
        this.fGRType = fGRType;
        this.fModifyTime = fModifyTime;
        this.uuid = uuid;
    }

    public Integer getFTypeID() {
        return fTypeID;
    }

    public void setFTypeID(Integer fTypeID) {
        this.fTypeID = fTypeID;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public Short getFDetail() {
        return fDetail;
    }

    public void setFDetail(Short fDetail) {
        this.fDetail = fDetail;
    }

    public short getFType() {
        return fType;
    }

    public void setFType(short fType) {
        this.fType = fType;
    }

    public short getFGRType() {
        return fGRType;
    }

    public void setFGRType(short fGRType) {
        this.fGRType = fGRType;
    }

    public byte[] getFModifyTime() {
        return fModifyTime;
    }

    public void setFModifyTime(byte[] fModifyTime) {
        this.fModifyTime = fModifyTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fTypeID != null ? fTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TSubMesType)) {
            return false;
        }
        TSubMesType other = (TSubMesType) object;
        if ((this.fTypeID == null && other.fTypeID != null) || (this.fTypeID != null && !this.fTypeID.equals(other.fTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.TSubMesType[ fTypeID=" + fTypeID + " ]";
    }

}
