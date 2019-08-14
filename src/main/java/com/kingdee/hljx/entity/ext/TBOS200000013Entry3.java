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
@Table(name = "t_BOS200000013Entry3")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000013Entry3.findAll", query = "SELECT t FROM TBOS200000013Entry3 t")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFEntryID", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fEntryID = :fEntryID")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFid", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFIndex", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fIndex = :fIndex")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFBase12", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fBase12 = :fBase12")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFBase2", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fBase2 = :fBase2")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFBase3", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fBase3 = :fBase3")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFQty1", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fQty1 = :fQty1")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFBase4", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fBase4 = :fBase4")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFQty2", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fQty2 = :fQty2")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFDecimal", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fDecimal = :fDecimal")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFQty3", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fQty3 = :fQty3")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFQty4", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fQty4 = :fQty4")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFQtyBase", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fQtyBase = :fQtyBase")
        , @NamedQuery(name = "TBOS200000013Entry3.findByFQty5", query = "SELECT t FROM TBOS200000013Entry3 t WHERE t.fQty5 = :fQty5")})
public class TBOS200000013Entry3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase12")
    private int fBase12;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase2")
    private int fBase2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase3")
    private int fBase3;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty1")
    private BigDecimal fQty1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase4")
    private int fBase4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty2")
    private BigDecimal fQty2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal")
    private BigDecimal fDecimal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty3")
    private BigDecimal fQty3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty4")
    private BigDecimal fQty4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty_Base")
    private BigDecimal fQtyBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty5")
    private BigDecimal fQty5;

    public TBOS200000013Entry3() {
    }

    public TBOS200000013Entry3(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public TBOS200000013Entry3(Integer fEntryID, int fid, int fIndex, int fBase12, int fBase2, int fBase3, BigDecimal fQty1, int fBase4, BigDecimal fQty2, BigDecimal fDecimal, BigDecimal fQty3, BigDecimal fQty4, BigDecimal fQtyBase, BigDecimal fQty5) {
        this.fEntryID = fEntryID;
        this.fid = fid;
        this.fIndex = fIndex;
        this.fBase12 = fBase12;
        this.fBase2 = fBase2;
        this.fBase3 = fBase3;
        this.fQty1 = fQty1;
        this.fBase4 = fBase4;
        this.fQty2 = fQty2;
        this.fDecimal = fDecimal;
        this.fQty3 = fQty3;
        this.fQty4 = fQty4;
        this.fQtyBase = fQtyBase;
        this.fQty5 = fQty5;
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

    public int getFBase12() {
        return fBase12;
    }

    public void setFBase12(int fBase12) {
        this.fBase12 = fBase12;
    }

    public int getFBase2() {
        return fBase2;
    }

    public void setFBase2(int fBase2) {
        this.fBase2 = fBase2;
    }

    public int getFBase3() {
        return fBase3;
    }

    public void setFBase3(int fBase3) {
        this.fBase3 = fBase3;
    }

    public BigDecimal getFQty1() {
        return fQty1;
    }

    public void setFQty1(BigDecimal fQty1) {
        this.fQty1 = fQty1;
    }

    public int getFBase4() {
        return fBase4;
    }

    public void setFBase4(int fBase4) {
        this.fBase4 = fBase4;
    }

    public BigDecimal getFQty2() {
        return fQty2;
    }

    public void setFQty2(BigDecimal fQty2) {
        this.fQty2 = fQty2;
    }

    public BigDecimal getFDecimal() {
        return fDecimal;
    }

    public void setFDecimal(BigDecimal fDecimal) {
        this.fDecimal = fDecimal;
    }

    public BigDecimal getFQty3() {
        return fQty3;
    }

    public void setFQty3(BigDecimal fQty3) {
        this.fQty3 = fQty3;
    }

    public BigDecimal getFQty4() {
        return fQty4;
    }

    public void setFQty4(BigDecimal fQty4) {
        this.fQty4 = fQty4;
    }

    public BigDecimal getFQtyBase() {
        return fQtyBase;
    }

    public void setFQtyBase(BigDecimal fQtyBase) {
        this.fQtyBase = fQtyBase;
    }

    public BigDecimal getFQty5() {
        return fQty5;
    }

    public void setFQty5(BigDecimal fQty5) {
        this.fQty5 = fQty5;
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
        if (!(object instanceof TBOS200000013Entry3)) {
            return false;
        }
        TBOS200000013Entry3 other = (TBOS200000013Entry3) object;
        if ((this.fEntryID == null && other.fEntryID != null) || (this.fEntryID != null && !this.fEntryID.equals(other.fEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.mavenproject2.TBOS200000013Entry3[ fEntryID=" + fEntryID + " ]";
    }

}
