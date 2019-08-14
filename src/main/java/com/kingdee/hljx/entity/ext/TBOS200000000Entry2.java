/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.ext;

import org.json.JSONObject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 电子秤
 *
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000000Entry2")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TBOS200000000Entry2.findAll", query = "SELECT t FROM TBOS200000000Entry2 t")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFEntryID", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fEntryID = :fEntryID")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFClassTypeID", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fClassTypeID = :fClassTypeID")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFid", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fid = :fid")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFIndex", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fIndex = :fIndex")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFNumber", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFName", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fName = :fName")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFText", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fText = :fText")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFBase", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fBase = :fBase")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFInteger", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fInteger = :fInteger")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFInteger1", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fInteger1 = :fInteger1")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFInteger2", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fInteger2 = :fInteger2")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFComboBox", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fComboBox = :fComboBox")
        , @NamedQuery(name = "TBOS200000000Entry2.findByFComboBox1", query = "SELECT t FROM TBOS200000000Entry2 t WHERE t.fComboBox1 = :fComboBox1")})
public class TBOS200000000Entry2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FEntryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FText")
    private String fText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FBase")
    private int fBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FInteger")
    private int fInteger;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FInteger1")
    private int fInteger1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FInteger2")
    private int fInteger2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FComboBox")
    private String fComboBox;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FComboBox1")
    private String fComboBox1;

    public TBOS200000000Entry2() {
    }

    public TBOS200000000Entry2(Integer fEntryID) {
        this.fEntryID = fEntryID;
    }

    public TBOS200000000Entry2(Integer fEntryID, int fClassTypeID, int fid, int fIndex, String fNumber, String fName, String fText, int fBase, int fInteger, int fInteger1, int fInteger2, String fComboBox, String fComboBox1) {
        this.fEntryID = fEntryID;
        this.fClassTypeID = fClassTypeID;
        this.fid = fid;
        this.fIndex = fIndex;
        this.fNumber = fNumber;
        this.fName = fName;
        this.fText = fText;
        this.fBase = fBase;
        this.fInteger = fInteger;
        this.fInteger1 = fInteger1;
        this.fInteger2 = fInteger2;
        this.fComboBox = fComboBox;
        this.fComboBox1 = fComboBox1;
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

    public String getFText() {
        return fText;
    }

    public void setFText(String fText) {
        this.fText = fText;
    }

    public int getFBase() {
        return fBase;
    }

    public void setFBase(int fBase) {
        this.fBase = fBase;
    }

    public int getFInteger() {
        return fInteger;
    }

    public void setFInteger(int fInteger) {
        this.fInteger = fInteger;
    }

    public int getFInteger1() {
        return fInteger1;
    }

    public void setFInteger1(int fInteger1) {
        this.fInteger1 = fInteger1;
    }

    public int getFInteger2() {
        return fInteger2;
    }

    public void setFInteger2(int fInteger2) {
        this.fInteger2 = fInteger2;
    }

    public String getFComboBox() {
        return fComboBox;
    }

    public void setFComboBox(String fComboBox) {
        this.fComboBox = fComboBox;
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
        hash += (fEntryID != null ? fEntryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBOS200000000Entry2)) {
            return false;
        }
        TBOS200000000Entry2 other = (TBOS200000000Entry2) object;
        if ((this.fEntryID == null && other.fEntryID != null) || (this.fEntryID != null && !this.fEntryID.equals(other.fEntryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.ext.TBOS200000000Entry2[ fEntryID=" + fEntryID + " ]";
    }

    public String getJSON() {
        JSONObject json = new JSONObject();
        json.put("IP", this.fText);
        json.put("Port", this.fInteger);
        return json.toString();
    }

}
