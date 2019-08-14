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
 * 工艺流程卡
 *
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000013")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000013.findAll", query = "SELECT t FROM TBOS200000013 t")
        , @NamedQuery(name = "TBOS200000013.findByFid", query = "SELECT t FROM TBOS200000013 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000013.findByFClassTypeID", query = "SELECT t FROM TBOS200000013 t WHERE t.fClassTypeID = :fClassTypeID")
        , @NamedQuery(name = "TBOS200000013.findByFBillNo", query = "SELECT t FROM TBOS200000013 t WHERE t.fBillNo = :fBillNo")
        , @NamedQuery(name = "TBOS200000013.findByFMultiCheckStatus", query = "SELECT t FROM TBOS200000013 t WHERE t.fMultiCheckStatus = :fMultiCheckStatus")
        , @NamedQuery(name = "TBOS200000013.findByFDate", query = "SELECT t FROM TBOS200000013 t WHERE t.fDate = :fDate")
        , @NamedQuery(name = "TBOS200000013.findByFBiller", query = "SELECT t FROM TBOS200000013 t WHERE t.fBiller = :fBiller")
        , @NamedQuery(name = "TBOS200000013.findByFUser", query = "SELECT t FROM TBOS200000013 t WHERE t.fUser = :fUser")
        , @NamedQuery(name = "TBOS200000013.findByFDate2", query = "SELECT t FROM TBOS200000013 t WHERE t.fDate2 = :fDate2")
        , @NamedQuery(name = "TBOS200000013.findByFPrintCount", query = "SELECT t FROM TBOS200000013 t WHERE t.fPrintCount = :fPrintCount")
        , @NamedQuery(name = "TBOS200000013.findByFBase11", query = "SELECT t FROM TBOS200000013 t WHERE t.fBase11 = :fBase11")
        , @NamedQuery(name = "TBOS200000013.findByFidSrc", query = "SELECT t FROM TBOS200000013 t WHERE t.fidSrc = :fidSrc")
        , @NamedQuery(name = "TBOS200000013.findByFEntryIDSRC", query = "SELECT t FROM TBOS200000013 t WHERE t.fEntryIDSRC = :fEntryIDSRC")
        , @NamedQuery(name = "TBOS200000013.findByFBillNoSRC", query = "SELECT t FROM TBOS200000013 t WHERE t.fBillNoSRC = :fBillNoSRC")
        , @NamedQuery(name = "TBOS200000013.findByFClassIDSRC", query = "SELECT t FROM TBOS200000013 t WHERE t.fClassIDSRC = :fClassIDSRC")
        , @NamedQuery(name = "TBOS200000013.findByFComboBox", query = "SELECT t FROM TBOS200000013 t WHERE t.fComboBox = :fComboBox")
        , @NamedQuery(name = "TBOS200000013.findByFnote1", query = "SELECT t FROM TBOS200000013 t WHERE t.fnote1 = :fnote1")
        , @NamedQuery(name = "TBOS200000013.findByFnote2", query = "SELECT t FROM TBOS200000013 t WHERE t.fnote2 = :fnote2")
        , @NamedQuery(name = "TBOS200000013.findByFComboBox1", query = "SELECT t FROM TBOS200000013 t WHERE t.fComboBox1 = :fComboBox1")})
public class TBOS200000013 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FID")
    private Integer fid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FClassTypeID")
    private int fClassTypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FBillNo")
    private String fBillNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FMultiCheckStatus")
    private String fMultiCheckStatus;
    @Column(name = "FDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBiller")
    private int fBiller;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUser")
    private int fUser;
    @Column(name = "FDate2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDate2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FPrintCount")
    private int fPrintCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase11")
    private int fBase11;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FID_SRC")
    private int fidSrc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FEntryID_SRC")
    private int fEntryIDSRC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FBillNo_SRC")
    private String fBillNoSRC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FClassID_SRC")
    private int fClassIDSRC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FComboBox")
    private String fComboBox;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "FNOTE1")
    private String fnote1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "FNOTE2")
    private String fnote2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FComboBox1")
    private String fComboBox1;

    public TBOS200000013() {
    }

    public TBOS200000013(Integer fid) {
        this.fid = fid;
    }

    public TBOS200000013(Integer fid, int fClassTypeID, String fBillNo, String fMultiCheckStatus, int fBiller, int fUser, int fPrintCount, int fBase11, int fidSrc, int fEntryIDSRC, String fBillNoSRC, int fClassIDSRC, String fComboBox, String fnote1, String fnote2, String fComboBox1) {
        this.fid = fid;
        this.fClassTypeID = fClassTypeID;
        this.fBillNo = fBillNo;
        this.fMultiCheckStatus = fMultiCheckStatus;
        this.fBiller = fBiller;
        this.fUser = fUser;
        this.fPrintCount = fPrintCount;
        this.fBase11 = fBase11;
        this.fidSrc = fidSrc;
        this.fEntryIDSRC = fEntryIDSRC;
        this.fBillNoSRC = fBillNoSRC;
        this.fClassIDSRC = fClassIDSRC;
        this.fComboBox = fComboBox;
        this.fnote1 = fnote1;
        this.fnote2 = fnote2;
        this.fComboBox1 = fComboBox1;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public int getFClassTypeID() {
        return fClassTypeID;
    }

    public void setFClassTypeID(int fClassTypeID) {
        this.fClassTypeID = fClassTypeID;
    }

    public String getFBillNo() {
        return fBillNo;
    }

    public void setFBillNo(String fBillNo) {
        this.fBillNo = fBillNo;
    }

    public String getFMultiCheckStatus() {
        return fMultiCheckStatus;
    }

    public void setFMultiCheckStatus(String fMultiCheckStatus) {
        this.fMultiCheckStatus = fMultiCheckStatus;
    }

    public Date getFDate() {
        return fDate;
    }

    public void setFDate(Date fDate) {
        this.fDate = fDate;
    }

    public int getFBiller() {
        return fBiller;
    }

    public void setFBiller(int fBiller) {
        this.fBiller = fBiller;
    }

    public int getFUser() {
        return fUser;
    }

    public void setFUser(int fUser) {
        this.fUser = fUser;
    }

    public Date getFDate2() {
        return fDate2;
    }

    public void setFDate2(Date fDate2) {
        this.fDate2 = fDate2;
    }

    public int getFPrintCount() {
        return fPrintCount;
    }

    public void setFPrintCount(int fPrintCount) {
        this.fPrintCount = fPrintCount;
    }

    public int getFBase11() {
        return fBase11;
    }

    public void setFBase11(int fBase11) {
        this.fBase11 = fBase11;
    }

    public int getFidSrc() {
        return fidSrc;
    }

    public void setFidSrc(int fidSrc) {
        this.fidSrc = fidSrc;
    }

    public int getFEntryIDSRC() {
        return fEntryIDSRC;
    }

    public void setFEntryIDSRC(int fEntryIDSRC) {
        this.fEntryIDSRC = fEntryIDSRC;
    }

    public String getFBillNoSRC() {
        return fBillNoSRC;
    }

    public void setFBillNoSRC(String fBillNoSRC) {
        this.fBillNoSRC = fBillNoSRC;
    }

    public int getFClassIDSRC() {
        return fClassIDSRC;
    }

    public void setFClassIDSRC(int fClassIDSRC) {
        this.fClassIDSRC = fClassIDSRC;
    }

    public String getFComboBox() {
        return fComboBox;
    }

    public void setFComboBox(String fComboBox) {
        this.fComboBox = fComboBox;
    }

    public String getFnote1() {
        return fnote1;
    }

    public void setFnote1(String fnote1) {
        this.fnote1 = fnote1;
    }

    public String getFnote2() {
        return fnote2;
    }

    public void setFnote2(String fnote2) {
        this.fnote2 = fnote2;
    }

    public String getFComboBox1() {
        return fComboBox1;
    }

    public void setFComboBox1(String fComboBox1) {
        this.fComboBox1 = fComboBox1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBOS200000013)) {
            return false;
        }
        TBOS200000013 other = (TBOS200000013) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.mavenproject2.TBOS200000013[ fid=" + fid + " ]";
    }

}
