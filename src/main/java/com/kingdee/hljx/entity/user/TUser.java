/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.user;

import com.kingdee.hljx.entity.item.TEmp;
import lombok.Data;
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
import java.util.Date;

/**
 * @author moon
 */
@Entity
@Table(name = "t_User")
@Getter
@Setter
@NoArgsConstructor
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TUser.findAll", query = "SELECT t FROM TUser t")
        , @NamedQuery(name = "TUser.findByFUserID", query = "SELECT t FROM TUser t WHERE t.fUserID = :fUserID")
        , @NamedQuery(name = "TUser.findByFName", query = "SELECT t FROM TUser t WHERE t.fName = :fName")
        , @NamedQuery(name = "TUser.findByFsid", query = "SELECT t FROM TUser t WHERE t.fsid = :fsid")
        , @NamedQuery(name = "TUser.findById", query = "SELECT t FROM TUser t WHERE t.id = :id")
        , @NamedQuery(name = "TUser.findByFPrimaryGroup", query = "SELECT t FROM TUser t WHERE t.fPrimaryGroup = :fPrimaryGroup")
        , @NamedQuery(name = "TUser.findByFDescription", query = "SELECT t FROM TUser t WHERE t.fDescription = :fDescription")
        , @NamedQuery(name = "TUser.findByFPortUser", query = "SELECT t FROM TUser t WHERE t.fPortUser = :fPortUser")
        , @NamedQuery(name = "TUser.findByFForbidden", query = "SELECT t FROM TUser t WHERE t.fForbidden = :fForbidden")
        , @NamedQuery(name = "TUser.findByFEmp", query = "SELECT t FROM TUser t WHERE t.fEmp = :fEmp")
        , @NamedQuery(name = "TUser.findByFDataVokeType", query = "SELECT t FROM TUser t WHERE t.fDataVokeType = :fDataVokeType")
        , @NamedQuery(name = "TUser.findByFIsNeedOffline", query = "SELECT t FROM TUser t WHERE t.fIsNeedOffline = :fIsNeedOffline")
        , @NamedQuery(name = "TUser.findByFRightChanged", query = "SELECT t FROM TUser t WHERE t.fRightChanged = :fRightChanged")
        , @NamedQuery(name = "TUser.findByFOfflineRefeshEachTime", query = "SELECT t FROM TUser t WHERE t.fOfflineRefeshEachTime = :fOfflineRefeshEachTime")
        , @NamedQuery(name = "TUser.findByFSafeMode", query = "SELECT t FROM TUser t WHERE t.fSafeMode = :fSafeMode")
        , @NamedQuery(name = "TUser.findByFSupplierID", query = "SELECT t FROM TUser t WHERE t.fSupplierID = :fSupplierID")
        , @NamedQuery(name = "TUser.findByFHRUser", query = "SELECT t FROM TUser t WHERE t.fHRUser = :fHRUser")
        , @NamedQuery(name = "TUser.findByFSSOUsername", query = "SELECT t FROM TUser t WHERE t.fSSOUsername = :fSSOUsername")
        , @NamedQuery(name = "TUser.findByFSCPwd", query = "SELECT t FROM TUser t WHERE t.fSCPwd = :fSCPwd")
        , @NamedQuery(name = "TUser.findByUuid", query = "SELECT t FROM TUser t WHERE t.uuid = :uuid")
        , @NamedQuery(name = "TUser.findByFAccessUUID", query = "SELECT t FROM TUser t WHERE t.fAccessUUID = :fAccessUUID")
        , @NamedQuery(name = "TUser.findByFUInValidDate", query = "SELECT t FROM TUser t WHERE t.fUInValidDate = :fUInValidDate")
        , @NamedQuery(name = "TUser.findByFPwCreateDate", query = "SELECT t FROM TUser t WHERE t.fPwCreateDate = :fPwCreateDate")
        , @NamedQuery(name = "TUser.findByFPwValidDay", query = "SELECT t FROM TUser t WHERE t.fPwValidDay = :fPwValidDay")
        , @NamedQuery(name = "TUser.findByFAuthRight", query = "SELECT t FROM TUser t WHERE t.fAuthRight = :fAuthRight")
        , @NamedQuery(name = "TUser.findByFUserTypeID", query = "SELECT t FROM TUser t WHERE t.fUserTypeID = :fUserTypeID")
        , @NamedQuery(name = "TUser.findByFCustomerID", query = "SELECT t FROM TUser t WHERE t.fCustomerID = :fCustomerID")
        , @NamedQuery(name = "TUser.findByFIMUserName", query = "SELECT t FROM TUser t WHERE t.fIMUserName = :fIMUserName")
        , @NamedQuery(name = "TUser.findByFCreateTime", query = "SELECT t FROM TUser t WHERE t.fCreateTime = :fCreateTime")
        , @NamedQuery(name = "TUser.findByFSupUnit", query = "SELECT t FROM TUser t WHERE t.fSupUnit = :fSupUnit")
})

public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    private int fUserID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String fName;
    @Size(max = 255)
    private String fsid;
    //    @Lob
    private byte[] passwordHashValue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    private String id;
    @Basic(optional = false)
    @NotNull
    private short fPrimaryGroup;
    @Size(max = 255)
    private String fDescription;
    @Size(max = 200)
    @Column(name = "FPortUser")
    private String fPortUser;
    @Column(name = "FForbidden")
    private Boolean fForbidden;
    //    @Lob
    @Column(name = "FRight")
    private byte[] fRight;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(optional = true, targetEntity = TEmp.class)
    @JoinColumn(name = "FEmpID", referencedColumnName = "FItemID")
    private TEmp fEmp;

    @Column(name = "FDataVokeType")
    private Integer fDataVokeType;
    @Column(name = "FIsNeedOffline")
    private Boolean fIsNeedOffline;
    @Column(name = "FRightChanged")
    private Boolean fRightChanged;
    @Column(name = "FOfflineRefeshEachTime")
    private Boolean fOfflineRefeshEachTime;
    @Column(name = "FSafeMode")
    private Integer fSafeMode;
    @Size(max = 255)
    @Column(name = "FSupplierID")
    private String fSupplierID;
    @Column(name = "FHRUser")
    private Integer fHRUser;
    @Size(max = 255)
    @Column(name = "FSSOUsername")
    private String fSSOUsername;
    @Size(max = 32)
    @Column(name = "FSCPwd")
    private String fSCPwd;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @Column(name = "FAccessUUID")
    private Integer fAccessUUID;
    @Column(name = "FUInValidDate")
//    @Temporal(TemporalType.TIMESTAMP)
    private byte[] fUInValidDate;
    @Column(name = "FPwCreateDate")
//    @Temporal(TemporalType.TIMESTAMP)
    private byte[] fPwCreateDate;
    @Column(name = "FPwValidDay")
    private Integer fPwValidDay;
    @Column(name = "FAuthRight")
    private Integer fAuthRight;

    @OneToOne
//    @JoinTable(name = "t_UserType")
    @JoinColumn(name = "fUserTypeID", referencedColumnName = "FUserID")
    private TUserType fUserTypeID;

    //    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Column(name = "FCustomerID")
    private Integer fCustomerID;
    @Size(max = 100)
    @Column(name = "FIMUserName")
    private String fIMUserName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCreateTime")
//    @Temporal(TemporalType.TIMESTAMP)
    private byte[] fCreateTime;
    @Size(max = 255)
    @Column(name = "FSupUnit")
    private String fSupUnit;

    public byte[] getPasswordHashValue() {
        return passwordHashValue;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "fUserID=" + fUserID +
                ", fName='" + fName + '\'' +
                ", fsid='" + fsid + '\'' +
                ", passwordHashValue=" + Arrays.toString(passwordHashValue) +
                ", id='" + id + '\'' +
                ", fPrimaryGroup=" + fPrimaryGroup +
                ", fDescription='" + fDescription + '\'' +
                ", fPortUser='" + fPortUser + '\'' +
                ", fForbidden=" + fForbidden +
                ", fRight=" + Arrays.toString(fRight) +
                ", fEmp=" + fEmp +
                ", fDataVokeType=" + fDataVokeType +
                ", fIsNeedOffline=" + fIsNeedOffline +
                ", fRightChanged=" + fRightChanged +
                ", fOfflineRefeshEachTime=" + fOfflineRefeshEachTime +
                ", fSafeMode=" + fSafeMode +
                ", fSupplierID='" + fSupplierID + '\'' +
                ", fHRUser=" + fHRUser +
                ", fSSOUsername='" + fSSOUsername + '\'' +
                ", fSCPwd='" + fSCPwd + '\'' +
                ", uuid='" + uuid + '\'' +
                ", fAccessUUID=" + fAccessUUID +
                ", fUInValidDate=" + Arrays.toString(fUInValidDate) +
                ", fPwCreateDate=" + Arrays.toString(fPwCreateDate) +
                ", fPwValidDay=" + fPwValidDay +
                ", fAuthRight=" + fAuthRight +
                ", fUserTypeID=" + fUserTypeID +
                ", fModifyTime=" + Arrays.toString(fModifyTime) +
                ", fCustomerID=" + fCustomerID +
                ", fIMUserName='" + fIMUserName + '\'' +
                ", fCreateTime=" + Arrays.toString(fCreateTime) +
                ", fSupUnit='" + fSupUnit + '\'' +
                '}';
    }
}
