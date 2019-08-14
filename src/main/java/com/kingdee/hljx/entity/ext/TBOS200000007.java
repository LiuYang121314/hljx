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

/**
 * 包装方式
 *
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000007")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000007.findAll", query = "SELECT t FROM TBOS200000007 t")
        , @NamedQuery(name = "TBOS200000007.findByFid", query = "SELECT t FROM TBOS200000007 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000007.findByFName", query = "SELECT t FROM TBOS200000007 t WHERE t.fName = :fName")
        , @NamedQuery(name = "TBOS200000007.findByFNumber", query = "SELECT t FROM TBOS200000007 t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TBOS200000007.findByFParentID", query = "SELECT t FROM TBOS200000007 t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TBOS200000007.findByFLogic", query = "SELECT t FROM TBOS200000007 t WHERE t.fLogic = :fLogic")
        , @NamedQuery(name = "TBOS200000007.findByFDetail", query = "SELECT t FROM TBOS200000007 t WHERE t.fDetail = :fDetail")
        , @NamedQuery(name = "TBOS200000007.findByFDiscontinued", query = "SELECT t FROM TBOS200000007 t WHERE t.fDiscontinued = :fDiscontinued")
        , @NamedQuery(name = "TBOS200000007.findByFLevels", query = "SELECT t FROM TBOS200000007 t WHERE t.fLevels = :fLevels")
        , @NamedQuery(name = "TBOS200000007.findByFFullNumber", query = "SELECT t FROM TBOS200000007 t WHERE t.fFullNumber = :fFullNumber")
        , @NamedQuery(name = "TBOS200000007.findByFClassTypeID", query = "SELECT t FROM TBOS200000007 t WHERE t.fClassTypeID = :fClassTypeID")})
public class TBOS200000007 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FParentID")
    private int fParentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLogic")
    private int fLogic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDetail")
    private boolean fDetail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDiscontinued")
    private boolean fDiscontinued;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLevels")
    private int fLevels;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FFullNumber")
    private String fFullNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 48)
    @Column(name = "FClassTypeID")
    private String fClassTypeID;

    public TBOS200000007() {
    }

    public TBOS200000007(Integer fid) {
        this.fid = fid;
    }

    public TBOS200000007(Integer fid, String fName, String fNumber, int fParentID, int fLogic, boolean fDetail, boolean fDiscontinued, int fLevels, String fFullNumber, String fClassTypeID) {
        this.fid = fid;
        this.fName = fName;
        this.fNumber = fNumber;
        this.fParentID = fParentID;
        this.fLogic = fLogic;
        this.fDetail = fDetail;
        this.fDiscontinued = fDiscontinued;
        this.fLevels = fLevels;
        this.fFullNumber = fFullNumber;
        this.fClassTypeID = fClassTypeID;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getFNumber() {
        return fNumber;
    }

    public void setFNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public int getFParentID() {
        return fParentID;
    }

    public void setFParentID(int fParentID) {
        this.fParentID = fParentID;
    }

    public int getFLogic() {
        return fLogic;
    }

    public void setFLogic(int fLogic) {
        this.fLogic = fLogic;
    }

    public boolean getFDetail() {
        return fDetail;
    }

    public void setFDetail(boolean fDetail) {
        this.fDetail = fDetail;
    }

    public boolean getFDiscontinued() {
        return fDiscontinued;
    }

    public void setFDiscontinued(boolean fDiscontinued) {
        this.fDiscontinued = fDiscontinued;
    }

    public int getFLevels() {
        return fLevels;
    }

    public void setFLevels(int fLevels) {
        this.fLevels = fLevels;
    }

    public String getFFullNumber() {
        return fFullNumber;
    }

    public void setFFullNumber(String fFullNumber) {
        this.fFullNumber = fFullNumber;
    }

    public String getFClassTypeID() {
        return fClassTypeID;
    }

    public void setFClassTypeID(String fClassTypeID) {
        this.fClassTypeID = fClassTypeID;
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
        if (!(object instanceof TBOS200000007)) {
            return false;
        }
        TBOS200000007 other = (TBOS200000007) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.ext.TBOS200000007[ fid=" + fid + " ]";
    }

}
