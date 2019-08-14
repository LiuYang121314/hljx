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
import java.io.Serializable;

/**
 * @author moon
 */
@Entity
@Table(name = "t_StockPlace")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TStockPlace.findAll", query = "SELECT t FROM TStockPlace t")
        , @NamedQuery(name = "TStockPlace.findByFspid", query = "SELECT t FROM TStockPlace t WHERE t.fspid = :fspid")
        , @NamedQuery(name = "TStockPlace.findByFNumber", query = "SELECT t FROM TStockPlace t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TStockPlace.findByFName", query = "SELECT t FROM TStockPlace t WHERE t.fName = :fName")
        , @NamedQuery(name = "TStockPlace.findByFFullName", query = "SELECT t FROM TStockPlace t WHERE t.fFullName = :fFullName")
        , @NamedQuery(name = "TStockPlace.findByFLevel", query = "SELECT t FROM TStockPlace t WHERE t.fLevel = :fLevel")
        , @NamedQuery(name = "TStockPlace.findByFDetail", query = "SELECT t FROM TStockPlace t WHERE t.fDetail = :fDetail")
        , @NamedQuery(name = "TStockPlace.findByFParentID", query = "SELECT t FROM TStockPlace t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TStockPlace.findByFFullNumber", query = "SELECT t FROM TStockPlace t WHERE t.fFullNumber = :fFullNumber")
        , @NamedQuery(name = "TStockPlace.findByFShortNumber", query = "SELECT t FROM TStockPlace t WHERE t.fShortNumber = :fShortNumber")
        , @NamedQuery(name = "TStockPlace.findByFDescription", query = "SELECT t FROM TStockPlace t WHERE t.fDescription = :fDescription")
        , @NamedQuery(name = "TStockPlace.findByFDeleted", query = "SELECT t FROM TStockPlace t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TStockPlace.findByFSystemType", query = "SELECT t FROM TStockPlace t WHERE t.fSystemType = :fSystemType")
        , @NamedQuery(name = "TStockPlace.findByUuid", query = "SELECT t FROM TStockPlace t WHERE t.uuid = :uuid")
        , @NamedQuery(name = "TStockPlace.findByFClassTypeID", query = "SELECT t FROM TStockPlace t WHERE t.fClassTypeID = :fClassTypeID")})
public class TStockPlace implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FSPID")
    private Integer fspid;
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
    @Size(max = 255)
    @Column(name = "FFullName")
    private String fFullName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FLevel")
    private int fLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDetail")
    private boolean fDetail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FParentID")
    private int fParentID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FFullNumber")
    private String fFullNumber;
    @Size(max = 80)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Size(max = 255)
    @Column(name = "FDescription")
    private String fDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private short fDeleted;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Column(name = "FSystemType")
    private Integer fSystemType;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FClassTypeID")
    private int fClassTypeID;
    @JoinColumn(name = "FSPGroupID", referencedColumnName = "FSPGroupID")
    @ManyToOne(optional = false)
    private TStockPlaceGroup fSPGroup;

    public TStockPlace(Integer fspid) {
        this.fspid = fspid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fspid != null ? fspid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TStockPlace)) {
            return false;
        }
        TStockPlace other = (TStockPlace) object;
        if ((this.fspid == null && other.fspid != null) || (this.fspid != null && !this.fspid.equals(other.fspid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.TStockPlace[ fspid=" + fspid + " ]";
    }

    public Integer getFspid() {
        return fspid;
    }

    public String getfName() {
        return fName;
    }

    public TStockPlaceGroup getfSPGroup() {
        return fSPGroup;
    }
}
