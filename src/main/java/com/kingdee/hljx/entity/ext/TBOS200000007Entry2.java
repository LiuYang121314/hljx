/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.ext;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000007Entry2")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000007Entry2.findAll", query = "SELECT t FROM TBOS200000007Entry2 t")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFEntryID", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fEntryID = :fEntryID")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFClassTypeID", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fClassTypeID = :fClassTypeID")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFid", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFIndex", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fIndex = :fIndex")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFNumber", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFName", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fName = :fName")
        , @NamedQuery(name = "TBOS200000007Entry2.findByFDecimal", query = "SELECT t FROM TBOS200000007Entry2 t WHERE t.fDecimal = :fDecimal")})
public class TBOS200000007Entry2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FEntryID")
    private Integer fEntryID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FClassTypeID")
    private int fClassTypeID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FID")
    private int fid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIndex")
    private int fIndex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal")
    private BigDecimal fDecimal;

    public TBOS200000007Entry2() {
    }

    public TBOS200000007Entry2(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public TBOS200000007Entry2(Integer fEntryID, int fClassTypeID, int fid, int fIndex, String fNumber, String fName, BigDecimal fDecimal) {
        this.fEntryID = fEntryID;
        this.fClassTypeID = fClassTypeID;
        this.fid = fid;
        this.fIndex = fIndex;
        this.fNumber = fNumber;
        this.fName = fName;
        this.fDecimal = fDecimal;
    }

    public Integer getFEntryID() {
        return fEntryID;
    }

    public void setFEntryID(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public int getFClassTypeID() {
        return fClassTypeID;
    }

    public void setFClassTypeID(int fClassTypeID) {
        this.fClassTypeID = fClassTypeID;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getFIndex() {
        return fIndex;
    }

    public void setFIndex(int fIndex) {
        this.fIndex = fIndex;
    }

    public String getFNumber() {
        return fNumber;
    }

    public void setFNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public BigDecimal getFDecimal() {
        return fDecimal;
    }

    public void setFDecimal(BigDecimal fDecimal) {
        this.fDecimal = fDecimal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fEntryID != null ? fEntryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBOS200000007Entry2)) {
            return false;
        }
        TBOS200000007Entry2 other = (TBOS200000007Entry2) object;
        if ((this.fEntryID == null && other.fEntryID != null) || (this.fEntryID != null && !this.fEntryID.equals(other.fEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.ext.TBOS200000007Entry2[ fEntryID=" + fEntryID + " ]";
    }

}
