/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author moon
 */
@Entity
@Table(name = "t_UserType")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TUserType.findAll", query = "SELECT t FROM TUserType t")
        , @NamedQuery(name = "TUserType.findByFUserID", query = "SELECT t FROM TUserType t WHERE t.fUserID = :fUserID")
        , @NamedQuery(name = "TUserType.findByFName", query = "SELECT t FROM TUserType t WHERE t.fName = :fName")
        , @NamedQuery(name = "TUserType.findByFNameCHT", query = "SELECT t FROM TUserType t WHERE t.fNameCHT = :fNameCHT")
        , @NamedQuery(name = "TUserType.findByFNameEN", query = "SELECT t FROM TUserType t WHERE t.fNameEN = :fNameEN")
        , @NamedQuery(name = "TUserType.findByFParentID", query = "SELECT t FROM TUserType t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TUserType.findByFLevel", query = "SELECT t FROM TUserType t WHERE t.fLevel = :fLevel")
        , @NamedQuery(name = "TUserType.findByFNumber", query = "SELECT t FROM TUserType t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TUserType.findByFState", query = "SELECT t FROM TUserType t WHERE t.fState = :fState")
})
public class TUserType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUserID")
    private Integer fUserID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName")
    private String fName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName_CHT")
    private String fNameCHT;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName_EN")
    private String fNameEN;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FParentID")
    private int fParentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLevel")
    private short fLevel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FState")
    private int fState;

    public TUserType() {
    }

    public TUserType(Integer fUserID) {
        this.fUserID = fUserID;
    }

    public TUserType(Integer fUserID, String fName, String fNameCHT, String fNameEN, int fParentID, short fLevel, String fNumber, int fState) {
        this.fUserID = fUserID;
        this.fName = fName;
        this.fNameCHT = fNameCHT;
        this.fNameEN = fNameEN;
        this.fParentID = fParentID;
        this.fLevel = fLevel;
        this.fNumber = fNumber;
        this.fState = fState;
    }

    public Integer getFUserID() {
        return fUserID;
    }

    public void setFUserID(Integer fUserID) {
        this.fUserID = fUserID;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getFNameCHT() {
        return fNameCHT;
    }

    public void setFNameCHT(String fNameCHT) {
        this.fNameCHT = fNameCHT;
    }

    public String getFNameEN() {
        return fNameEN;
    }

    public void setFNameEN(String fNameEN) {
        this.fNameEN = fNameEN;
    }

    public int getFParentID() {
        return fParentID;
    }

    public void setFParentID(int fParentID) {
        this.fParentID = fParentID;
    }

    public short getFLevel() {
        return fLevel;
    }

    public void setFLevel(short fLevel) {
        this.fLevel = fLevel;
    }

    public String getFNumber() {
        return fNumber;
    }

    public void setFNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public int getFState() {
        return fState;
    }

    public void setFState(int fState) {
        this.fState = fState;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fUserID != null ? fUserID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUserType)) {
            return false;
        }
        TUserType other = (TUserType) object;
        if ((this.fUserID == null && other.fUserID != null) || (this.fUserID != null && !this.fUserID.equals(other.fUserID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TUserType{" +
                "fUserID=" + fUserID +
                ", fName='" + fName + '\'' +
                ", fNameCHT='" + fNameCHT + '\'' +
                ", fNameEN='" + fNameEN + '\'' +
                ", fParentID=" + fParentID +
                ", fLevel=" + fLevel +
                ", fNumber='" + fNumber + '\'' +
                ", fState=" + fState +
                '}';
    }
}
