/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.measure;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author moon
 */
@Entity
@Table(name = "t_MeasureUnit")
@XmlRootElement
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = "TMeasureUnit.findAll", query = "SELECT t FROM TMeasureUnit t")
        , @NamedQuery(name = "TMeasureUnit.findByFMeasureUnitID", query = "SELECT t FROM TMeasureUnit t WHERE t.fMeasureUnitID = :fMeasureUnitID")
//    , @NamedQuery(name = "TMeasureUnit.findByFUnitGroup", query = "SELECT t FROM TMeasureUnit t WHERE t.fUnitGroup = :fUnitGroup")
        , @NamedQuery(name = "TMeasureUnit.findByFNumber", query = "SELECT t FROM TMeasureUnit t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TMeasureUnit.findByFAuxClass", query = "SELECT t FROM TMeasureUnit t WHERE t.fAuxClass = :fAuxClass")
        , @NamedQuery(name = "TMeasureUnit.findByFName", query = "SELECT t FROM TMeasureUnit t WHERE t.fName = :fName")
        , @NamedQuery(name = "TMeasureUnit.findByFConversation", query = "SELECT t FROM TMeasureUnit t WHERE t.fConversation = :fConversation")
        , @NamedQuery(name = "TMeasureUnit.findByFCoefficient", query = "SELECT t FROM TMeasureUnit t WHERE t.fCoefficient = :fCoefficient")
        , @NamedQuery(name = "TMeasureUnit.findByFPrecision", query = "SELECT t FROM TMeasureUnit t WHERE t.fPrecision = :fPrecision")
        , @NamedQuery(name = "TMeasureUnit.findByFBrNo", query = "SELECT t FROM TMeasureUnit t WHERE t.fBrNo = :fBrNo")
        , @NamedQuery(name = "TMeasureUnit.findByFItemID", query = "SELECT t FROM TMeasureUnit t WHERE t.fItemID = :fItemID")
        , @NamedQuery(name = "TMeasureUnit.findByFParentID", query = "SELECT t FROM TMeasureUnit t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TMeasureUnit.findByFDeleted", query = "SELECT t FROM TMeasureUnit t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TMeasureUnit.findByFShortNumber", query = "SELECT t FROM TMeasureUnit t WHERE t.fShortNumber = :fShortNumber")
        , @NamedQuery(name = "TMeasureUnit.findByFOperDate", query = "SELECT t FROM TMeasureUnit t WHERE t.fOperDate = :fOperDate")
        , @NamedQuery(name = "TMeasureUnit.findByFScale", query = "SELECT t FROM TMeasureUnit t WHERE t.fScale = :fScale")
        , @NamedQuery(name = "TMeasureUnit.findByFStandard", query = "SELECT t FROM TMeasureUnit t WHERE t.fStandard = :fStandard")
        , @NamedQuery(name = "TMeasureUnit.findByFControl", query = "SELECT t FROM TMeasureUnit t WHERE t.fControl = :fControl")
        , @NamedQuery(name = "TMeasureUnit.findByFSystemType", query = "SELECT t FROM TMeasureUnit t WHERE t.fSystemType = :fSystemType")
        , @NamedQuery(name = "TMeasureUnit.findByUuid", query = "SELECT t FROM TMeasureUnit t WHERE t.uuid = :uuid")
        , @NamedQuery(name = "TMeasureUnit.findByFNameEN", query = "SELECT t FROM TMeasureUnit t WHERE t.fNameEN = :fNameEN")
        , @NamedQuery(name = "TMeasureUnit.findByFNameEnPlu", query = "SELECT t FROM TMeasureUnit t WHERE t.fNameEnPlu = :fNameEnPlu")})
public class TMeasureUnit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FMeasureUnitID")
    private Integer fMeasureUnitID;

    @JoinColumn(name = "FUnitGroupID", referencedColumnName = "FUnitGroupID")
    @ManyToOne(optional = true)
    private TUnitGroup fUnitGroup;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FNumber")
    private String fNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FAuxClass")
    private String fAuxClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "FName")
    private String fName;
    @Column(name = "FConversation")
    private Integer fConversation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCoefficient")
    private BigDecimal fCoefficient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FPrecision")
    private int fPrecision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FBrNo")
    private String fBrNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FItemID")
    private int fItemID;
    @Column(name = "FParentID")
    private Integer fParentID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private short fDeleted;
    @Size(max = 30)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Size(max = 10)
    @Column(name = "FOperDate")
    private String fOperDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FScale")
    private BigDecimal fScale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FStandard")
    private short fStandard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FControl")
    private short fControl;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FSystemType")
    private int fSystemType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UUID")
    private String uuid;
    @Size(max = 255)
    @Column(name = "FNameEN")
    private String fNameEN;
    @Size(max = 255)
    @Column(name = "FNameEnPlu")
    private String fNameEnPlu;


    public TMeasureUnit(Integer fMeasureUnitID) {
        this.fMeasureUnitID = fMeasureUnitID;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fMeasureUnitID != null ? fMeasureUnitID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMeasureUnit)) {
            return false;
        }
        TMeasureUnit other = (TMeasureUnit) object;
        if ((this.fMeasureUnitID == null && other.fMeasureUnitID != null) || (this.fMeasureUnitID != null && !this.fMeasureUnitID.equals(other.fMeasureUnitID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.org.malus.erp.k3.entity.TMeasureUnit[ fMeasureUnitID=" + fMeasureUnitID + " ]";
    }

}
