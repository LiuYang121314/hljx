/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.stock;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Table(name = "t_StockPlaceGroup")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TStockPlaceGroup.findAll", query = "SELECT t FROM TStockPlaceGroup t")
        , @NamedQuery(name = "TStockPlaceGroup.findByFSPGroupID", query = "SELECT t FROM TStockPlaceGroup t WHERE t.fSPGroupID = :fSPGroupID")
        , @NamedQuery(name = "TStockPlaceGroup.findByFNumber", query = "SELECT t FROM TStockPlaceGroup t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TStockPlaceGroup.findByFName", query = "SELECT t FROM TStockPlaceGroup t WHERE t.fName = :fName")
        , @NamedQuery(name = "TStockPlaceGroup.findByFDefaultSPID", query = "SELECT t FROM TStockPlaceGroup t WHERE t.fDefaultSPID = :fDefaultSPID")
        , @NamedQuery(name = "TStockPlaceGroup.findByFDeleted", query = "SELECT t FROM TStockPlaceGroup t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TStockPlaceGroup.findByUuid", query = "SELECT t FROM TStockPlaceGroup t WHERE t.uuid = :uuid")})
public class TStockPlaceGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FSPGroupID")
    private Integer fSPGroupID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName")
    private String fName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDefaultSPID")
    private int fDefaultSPID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private boolean fDeleted;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fSPGroup")
    private List<TStockPlace> tStockPlaceList;

    public TStockPlaceGroup(Integer fSPGroupID) {
        this.fSPGroupID = fSPGroupID;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fSPGroupID != null ? fSPGroupID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TStockPlaceGroup)) {
            return false;
        }
        TStockPlaceGroup other = (TStockPlaceGroup) object;
        if ((this.fSPGroupID == null && other.fSPGroupID != null) || (this.fSPGroupID != null && !this.fSPGroupID.equals(other.fSPGroupID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.TStockPlaceGroup[ fSPGroupID=" + fSPGroupID + " ]";
    }

    public Integer getfSPGroupID() {
        return fSPGroupID;
    }
}
