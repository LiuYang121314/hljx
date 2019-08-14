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
import java.util.Date;

/**
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000013Entry2")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000013Entry2.findAll", query = "SELECT t FROM TBOS200000013Entry2 t")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFEntryID", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fEntryID = :fEntryID")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFid", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFIndex", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fIndex = :fIndex")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFBase", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fBase = :fBase")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFBase1", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fBase1 = :fBase1")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFQty", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fQty = :fQty")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFDate1", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fDate1 = :fDate1")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFText", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fText = :fText")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFBase7", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fBase7 = :fBase7")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFBase8", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fBase8 = :fBase8")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFBase9", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fBase9 = :fBase9")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFnote", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fnote = :fnote")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFBase10", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fBase10 = :fBase10")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFQty6", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fQty6 = :fQty6")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFnote3", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fnote3 = :fnote3")
        , @NamedQuery(name = "TBOS200000013Entry2.findByFInteger", query = "SELECT t FROM TBOS200000013Entry2 t WHERE t.fInteger = :fInteger")})
public class TBOS200000013Entry2 implements Serializable {

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
    @Column(name = "FBase")
    private int fBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase1")
    private int fBase1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty")
    private BigDecimal fQty;
    @Column(name = "FDate1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDate1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FText")
    private String fText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase7")
    private int fBase7;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase8")
    private int fBase8;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase9")
    private int fBase9;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "FNOTE")
    private String fnote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase10")
    private int fBase10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FQty6")
    private BigDecimal fQty6;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "FNOTE3")
    private String fnote3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FInteger")
    private int fInteger;

    public TBOS200000013Entry2() {
    }

    public TBOS200000013Entry2(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public TBOS200000013Entry2(Integer fEntryID, int fid, int fIndex, int fBase, int fBase1, BigDecimal fQty, String fText, int fBase7, int fBase8, int fBase9, String fnote, int fBase10, BigDecimal fQty6, String fnote3, int fInteger) {
        this.fEntryID = fEntryID;
        this.fid = fid;
        this.fIndex = fIndex;
        this.fBase = fBase;
        this.fBase1 = fBase1;
        this.fQty = fQty;
        this.fText = fText;
        this.fBase7 = fBase7;
        this.fBase8 = fBase8;
        this.fBase9 = fBase9;
        this.fnote = fnote;
        this.fBase10 = fBase10;
        this.fQty6 = fQty6;
        this.fnote3 = fnote3;
        this.fInteger = fInteger;
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

    public int getFBase() {
        return fBase;
    }

    public void setFBase(int fBase) {
        this.fBase = fBase;
    }

    public int getFBase1() {
        return fBase1;
    }

    public void setFBase1(int fBase1) {
        this.fBase1 = fBase1;
    }

    public BigDecimal getFQty() {
        return fQty;
    }

    public void setFQty(BigDecimal fQty) {
        this.fQty = fQty;
    }

    public Date getFDate1() {
        return fDate1;
    }

    public void setFDate1(Date fDate1) {
        this.fDate1 = fDate1;
    }

    public String getFText() {
        return fText;
    }

    public void setFText(String fText) {
        this.fText = fText;
    }

    public int getFBase7() {
        return fBase7;
    }

    public void setFBase7(int fBase7) {
        this.fBase7 = fBase7;
    }

    public int getFBase8() {
        return fBase8;
    }

    public void setFBase8(int fBase8) {
        this.fBase8 = fBase8;
    }

    public int getFBase9() {
        return fBase9;
    }

    public void setFBase9(int fBase9) {
        this.fBase9 = fBase9;
    }

    public String getFnote() {
        return fnote;
    }

    public void setFnote(String fnote) {
        this.fnote = fnote;
    }

    public int getFBase10() {
        return fBase10;
    }

    public void setFBase10(int fBase10) {
        this.fBase10 = fBase10;
    }

    public BigDecimal getFQty6() {
        return fQty6;
    }

    public void setFQty6(BigDecimal fQty6) {
        this.fQty6 = fQty6;
    }

    public String getFnote3() {
        return fnote3;
    }

    public void setFnote3(String fnote3) {
        this.fnote3 = fnote3;
    }

    public int getFInteger() {
        return fInteger;
    }

    public void setFInteger(int fInteger) {
        this.fInteger = fInteger;
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
        if (!(object instanceof TBOS200000013Entry2)) {
            return false;
        }
        TBOS200000013Entry2 other = (TBOS200000013Entry2) object;
        if ((this.fEntryID == null && other.fEntryID != null) || (this.fEntryID != null && !this.fEntryID.equals(other.fEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.mavenproject2.TBOS200000013Entry2[ fEntryID=" + fEntryID + " ]";
    }

}
