/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.submessage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author moon
 */
@Entity
//@Inheritance注解只能作用于继承结构的超类上
@Table(name = "t_SubMessage")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "FTypeID", discriminatorType = DiscriminatorType.INTEGER)
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TSubMessage.findAll", query = "SELECT t FROM TSubMessage t")
        , @NamedQuery(name = "TSubMessage.findByFBrNo", query = "SELECT t FROM TSubMessage t WHERE t.fBrNo = :fBrNo")
        , @NamedQuery(name = "TSubMessage.findByFInterID", query = "SELECT t FROM TSubMessage t WHERE t.fInterID = :fInterID")
        , @NamedQuery(name = "TSubMessage.findByFid", query = "SELECT t FROM TSubMessage t WHERE t.fid = :fid")
        , @NamedQuery(name = "TSubMessage.findByFParentID", query = "SELECT t FROM TSubMessage t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TSubMessage.findByFName", query = "SELECT t FROM TSubMessage t WHERE t.fName = :fName")
        , @NamedQuery(name = "TSubMessage.findByFTypeID", query = "SELECT t FROM TSubMessage t WHERE t.fTypeID = :fTypeID")
        , @NamedQuery(name = "TSubMessage.findByFDetail", query = "SELECT t FROM TSubMessage t WHERE t.fDetail = :fDetail")
        , @NamedQuery(name = "TSubMessage.findByFDeleted", query = "SELECT t FROM TSubMessage t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TSubMessage.findByFSystemType", query = "SELECT t FROM TSubMessage t WHERE t.fSystemType = :fSystemType")
        , @NamedQuery(name = "TSubMessage.findByFSpec", query = "SELECT t FROM TSubMessage t WHERE t.fSpec = :fSpec")
        , @NamedQuery(name = "TSubMessage.findByUuid", query = "SELECT t FROM TSubMessage t WHERE t.uuid = :uuid")
})
public class TSubMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FInterID")
    private Integer fInterID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FBrNo")
    private String fBrNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FParentID")
    private int fParentID;
    @Size(max = 30)
    @Column(name = "FID")
    private String fid;
    @Size(max = 255)
    @Column(name = "FName")
    private String fName;


    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(optional = true, targetEntity = TSubMesType.class)
    @JoinColumn(name = "FTypeID", referencedColumnName = "FTypeID", insertable = false, updatable = false)
    private TSubMesType fTypeID;

    @Basic(optional = false)
    @NotNull
    @Column(name = "FDetail")
    private short fDetail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDeleted")
    private short fDeleted;
    @Basic(optional = false)
    @NotNull
//    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FSystemType")
    private int fSystemType;
    @Size(max = 255)
    @Column(name = "FSpec")
    private String fSpec;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "UUID")
    private String uuid;

    public void setfInterID(Integer fInterID) {
        this.fInterID = fInterID;
    }

    public void setfBrNo(String fBrNo) {
        this.fBrNo = fBrNo;
    }

    public void setfParentID(int fParentID) {
        this.fParentID = fParentID;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setfDetail(short fDetail) {
        this.fDetail = fDetail;
    }

    public void setfDeleted(short fDeleted) {
        this.fDeleted = fDeleted;
    }

    public void setfModifyTime(byte[] fModifyTime) {
        this.fModifyTime = fModifyTime;
    }

    public void setfSystemType(int fSystemType) {
        this.fSystemType = fSystemType;
    }

    public void setfSpec(String fSpec) {
        this.fSpec = fSpec;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    public Integer getfInterID() {
        return fInterID;
    }

    public String getfBrNo() {
        return fBrNo;
    }

    public int getfParentID() {
        return fParentID;
    }

    public String getFid() {
        return fid;
    }

    public String getfName() {
        return fName;
    }

    public short getfDetail() {
        return fDetail;
    }

    public short getfDeleted() {
        return fDeleted;
    }

    public byte[] getfModifyTime() {
        return fModifyTime;
    }

    public int getfSystemType() {
        return fSystemType;
    }

    public String getfSpec() {
        return fSpec;
    }


    public String getUuid() {
        return uuid;
    }

    public String getFName() {
        return fName.replace("\n", "").replace("\r", "");
    }

    public void setFName(String fName) {
        this.fName = fName;
    }


    public TSubMessage() {
    }

    public TSubMessage(Integer fInterID) {
        this.fInterID = fInterID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fInterID != null ? fInterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TSubMessage)) {
            return false;
        }
        TSubMessage other = (TSubMessage) object;
        if ((this.fInterID == null && other.fInterID != null) || (this.fInterID != null && !this.fInterID.equals(other.fInterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TSubMessage{" +
                "fInterID=" + fInterID +
                ", fBrNo='" + fBrNo + '\'' +
                ", fParentID=" + fParentID +
                ", fid='" + fid + '\'' +
                ", fName='" + fName + '\'' +
                ", tSubMesType=" + fTypeID +
                ", fDetail=" + fDetail +
                ", fDeleted=" + fDeleted +
                ", fModifyTime=" + Arrays.toString(fModifyTime) +
                ", fSystemType=" + fSystemType +
                ", fSpec='" + fSpec + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
