/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.ext;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000001Entry2")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000001Entry2.findAll", query = "SELECT t FROM TBOS200000001Entry2 t")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFEntryID", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fEntryID = :fEntryID")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFid", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFIndex", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fIndex = :fIndex")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFDecimal", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fDecimal = :fDecimal")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFDecimal1", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fDecimal1 = :fDecimal1")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFDecimal2", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fDecimal2 = :fDecimal2")
        , @NamedQuery(name = "TBOS200000001Entry2.findByFDecimal3", query = "SELECT t FROM TBOS200000001Entry2 t WHERE t.fDecimal3 = :fDecimal3")})
public class TBOS200000001Entry2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FEntryID")
    private Integer fEntryID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FID")
    private int fid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIndex")
    private int fIndex;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal")
    private BigDecimal fDecimal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal1")
    private BigDecimal fDecimal1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal2")
    private BigDecimal fDecimal2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal3")
    private BigDecimal fDecimal3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal4")
    private BigDecimal fDecimal4;

    public TBOS200000001Entry2() {
    }

    public TBOS200000001Entry2(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public TBOS200000001Entry2(Integer fEntryID, int fid, int fIndex, BigDecimal fDecimal, BigDecimal fDecimal1, BigDecimal fDecimal2, BigDecimal fDecimal3, BigDecimal fDecimal4) {
        this.fEntryID = fEntryID;
        this.fid = fid;
        this.fIndex = fIndex;
        this.fDecimal = fDecimal;
        this.fDecimal1 = fDecimal1;
        this.fDecimal2 = fDecimal2;
        this.fDecimal3 = fDecimal3;
        this.fDecimal4 = fDecimal4;
    }

    public Integer getFEntryID() {
        return fEntryID;
    }

    public void setFEntryID(Integer fEntryID) {
        this.fEntryID = fEntryID;
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

    public BigDecimal getFDecimal() {
        return fDecimal;
    }

    public void setFDecimal(BigDecimal fDecimal) {
        this.fDecimal = fDecimal;
    }

    public BigDecimal getFDecimal1() {
        return fDecimal1;
    }

    public void setFDecimal1(BigDecimal fDecimal1) {
        this.fDecimal1 = fDecimal1;
    }

    public BigDecimal getFDecimal2() {
        return fDecimal2;
    }

    public void setFDecimal2(BigDecimal fDecimal2) {
        this.fDecimal2 = fDecimal2;
    }

    public BigDecimal getFDecimal3() {
        return fDecimal3;
    }

    public void setFDecimal3(BigDecimal fDecimal3) {
        this.fDecimal3 = fDecimal3;
    }

    public BigDecimal getFDecimal4() {
        return fDecimal4;
    }

    public void setFDecimal4(BigDecimal fDecimal4) {
        this.fDecimal4 = fDecimal4;
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
        if (!(object instanceof TBOS200000001Entry2)) {
            return false;
        }
        TBOS200000001Entry2 other = (TBOS200000001Entry2) object;
        if ((this.fEntryID == null && other.fEntryID != null) || (this.fEntryID != null && !this.fEntryID.equals(other.fEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.ext.TBOS200000001Entry2[ fEntryID=" + fEntryID + " ]";
    }

}
