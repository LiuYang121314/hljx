/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.measure;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 * @author moon
 */
@Entity
@Table(name = "t_UnitGroup")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TUnitGroup.findAll", query = "SELECT t FROM TUnitGroup t")
        , @NamedQuery(name = "TUnitGroup.findByFUnitGroupID", query = "SELECT t FROM TUnitGroup t WHERE t.fUnitGroupID = :fUnitGroupID")
        , @NamedQuery(name = "TUnitGroup.findByFName", query = "SELECT t FROM TUnitGroup t WHERE t.fName = :fName")
        , @NamedQuery(name = "TUnitGroup.findByFDefaultUnitID", query = "SELECT t FROM TUnitGroup t WHERE t.fDefaultUnitID = :fDefaultUnitID")
        , @NamedQuery(name = "TUnitGroup.findByUuid", query = "SELECT t FROM TUnitGroup t WHERE t.uuid = :uuid")})
public class TUnitGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FUnitGroupID")
    private Integer fUnitGroupID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName")
    private String fName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDefaultUnitID")
    private int fDefaultUnitID;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fUnitGroup")
    private List<TMeasureUnit> tMeasureUnitList;

    public TUnitGroup() {
    }

    public TUnitGroup(Integer fUnitGroupID) {
        this.fUnitGroupID = fUnitGroupID;
    }

    public TUnitGroup(Integer fUnitGroupID, String fName, int fDefaultUnitID, byte[] fModifyTime, String uuid) {
        this.fUnitGroupID = fUnitGroupID;
        this.fName = fName;
        this.fDefaultUnitID = fDefaultUnitID;
        this.fModifyTime = fModifyTime;
        this.uuid = uuid;
    }

    public Integer getFUnitGroupID() {
        return fUnitGroupID;
    }

    public void setFUnitGroupID(Integer fUnitGroupID) {
        this.fUnitGroupID = fUnitGroupID;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public int getFDefaultUnitID() {
        return fDefaultUnitID;
    }

    public void setFDefaultUnitID(int fDefaultUnitID) {
        this.fDefaultUnitID = fDefaultUnitID;
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

    @XmlTransient
    public List<TMeasureUnit> getTMeasureUnitList() {
        return tMeasureUnitList;
    }

    public void setTMeasureUnitList(List<TMeasureUnit> tMeasureUnitList) {
        this.tMeasureUnitList = tMeasureUnitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fUnitGroupID != null ? fUnitGroupID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUnitGroup)) {
            return false;
        }
        TUnitGroup other = (TUnitGroup) object;
        if ((this.fUnitGroupID == null && other.fUnitGroupID != null) || (this.fUnitGroupID != null && !this.fUnitGroupID.equals(other.fUnitGroupID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.TUnitGroup[ fUnitGroupID=" + fUnitGroupID + " ]";
    }

}
