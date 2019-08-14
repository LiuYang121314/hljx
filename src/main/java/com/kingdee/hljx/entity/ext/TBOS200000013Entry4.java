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
import java.util.Date;

/**
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000013Entry4")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000013Entry4.findAll", query = "SELECT t FROM TBOS200000013Entry4 t")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFEntryID", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fEntryID = :fEntryID")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFid", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFIndex", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fIndex = :fIndex")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFText1", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fText1 = :fText1")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFBase5", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fBase5 = :fBase5")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFBase6", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fBase6 = :fBase6")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFTime", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fTime = :fTime")
        , @NamedQuery(name = "TBOS200000013Entry4.findByFTime1", query = "SELECT t FROM TBOS200000013Entry4 t WHERE t.fTime1 = :fTime1")})
public class TBOS200000013Entry4 implements Serializable {

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
    @Size(min = 1, max = 50)
    @Column(name = "FText1")
    private String fText1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase5")
    private int fBase5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase6")
    private int fBase6;
    @Column(name = "FTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fTime;
    @Column(name = "FTime1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fTime1;

    public TBOS200000013Entry4() {
    }

    public TBOS200000013Entry4(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public TBOS200000013Entry4(Integer fEntryID, int fid, int fIndex, String fText1, int fBase5, int fBase6) {
        this.fEntryID = fEntryID;
        this.fid = fid;
        this.fIndex = fIndex;
        this.fText1 = fText1;
        this.fBase5 = fBase5;
        this.fBase6 = fBase6;
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

    public String getFText1() {
        return fText1;
    }

    public void setFText1(String fText1) {
        this.fText1 = fText1;
    }

    public int getFBase5() {
        return fBase5;
    }

    public void setFBase5(int fBase5) {
        this.fBase5 = fBase5;
    }

    public int getFBase6() {
        return fBase6;
    }

    public void setFBase6(int fBase6) {
        this.fBase6 = fBase6;
    }

    public Date getFTime() {
        return fTime;
    }

    public void setFTime(Date fTime) {
        this.fTime = fTime;
    }

    public Date getFTime1() {
        return fTime1;
    }

    public void setFTime1(Date fTime1) {
        this.fTime1 = fTime1;
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
        if (!(object instanceof TBOS200000013Entry4)) {
            return false;
        }
        TBOS200000013Entry4 other = (TBOS200000013Entry4) object;
        if ((this.fEntryID == null && other.fEntryID != null) || (this.fEntryID != null && !this.fEntryID.equals(other.fEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.mavenproject2.TBOS200000013Entry4[ fEntryID=" + fEntryID + " ]";
    }

}
