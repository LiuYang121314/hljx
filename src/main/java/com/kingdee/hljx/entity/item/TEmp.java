package com.kingdee.hljx.entity.item;

import com.kingdee.hljx.entity.submessage.Team;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 职员
 *
 * @author moon
 */
@Entity
@Table(name = "t_Emp")
@DiscriminatorValue("3")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TEmp.findAll", query = "SELECT t FROM TEmp t")
        , @NamedQuery(name = "TEmp.findByFAccountName", query = "SELECT t FROM TEmp t WHERE t.fAccountName = :fAccountName")
        , @NamedQuery(name = "TEmp.findByFAddress", query = "SELECT t FROM TEmp t WHERE t.fAddress = :fAddress")
        , @NamedQuery(name = "TEmp.findByFAllotPercent", query = "SELECT t FROM TEmp t WHERE t.fAllotPercent = :fAllotPercent")
        , @NamedQuery(name = "TEmp.findByFAllotWeight", query = "SELECT t FROM TEmp t WHERE t.fAllotWeight = :fAllotWeight")
        , @NamedQuery(name = "TEmp.findByFBankAccount", query = "SELECT t FROM TEmp t WHERE t.fBankAccount = :fBankAccount")
        , @NamedQuery(name = "TEmp.findByFBankID", query = "SELECT t FROM TEmp t WHERE t.fBankID = :fBankID")
        , @NamedQuery(name = "TEmp.findByFBirthday", query = "SELECT t FROM TEmp t WHERE t.fBirthday = :fBirthday")
        , @NamedQuery(name = "TEmp.findByFBrNO", query = "SELECT t FROM TEmp t WHERE t.fBrNO = :fBrNO")
        , @NamedQuery(name = "TEmp.findByFCityID", query = "SELECT t FROM TEmp t WHERE t.fCityID = :fCityID")
        , @NamedQuery(name = "TEmp.findByFCreditAmount", query = "SELECT t FROM TEmp t WHERE t.fCreditAmount = :fCreditAmount")
        , @NamedQuery(name = "TEmp.findByFCreditDays", query = "SELECT t FROM TEmp t WHERE t.fCreditDays = :fCreditDays")
        , @NamedQuery(name = "TEmp.findByFCreditLevel", query = "SELECT t FROM TEmp t WHERE t.fCreditLevel = :fCreditLevel")
        , @NamedQuery(name = "TEmp.findByFCreditPeriod", query = "SELECT t FROM TEmp t WHERE t.fCreditPeriod = :fCreditPeriod")
        , @NamedQuery(name = "TEmp.findByFDegree", query = "SELECT t FROM TEmp t WHERE t.fDegree = :fDegree")
        , @NamedQuery(name = "TEmp.findByFDeleted", query = "SELECT t FROM TEmp t WHERE t.fDeleted = :fDeleted")
        , @NamedQuery(name = "TEmp.findByFDepartmentID", query = "SELECT t FROM TEmp t WHERE t.fDepartmentID = :fDepartmentID")
        , @NamedQuery(name = "TEmp.findByFDuty", query = "SELECT t FROM TEmp t WHERE t.fDuty = :fDuty")
        , @NamedQuery(name = "TEmp.findByFEmail", query = "SELECT t FROM TEmp t WHERE t.fEmail = :fEmail")
        , @NamedQuery(name = "TEmp.findByFEmpGroup", query = "SELECT t FROM TEmp t WHERE t.fEmpGroup = :fEmpGroup")
        , @NamedQuery(name = "TEmp.findByFEmpGroupID", query = "SELECT t FROM TEmp t WHERE t.fEmpGroupID = :fEmpGroupID")
        , @NamedQuery(name = "TEmp.findByFGender", query = "SELECT t FROM TEmp t WHERE t.fGender = :fGender")
        , @NamedQuery(name = "TEmp.findByFHireDate", query = "SELECT t FROM TEmp t WHERE t.fHireDate = :fHireDate")
        , @NamedQuery(name = "TEmp.findByFid", query = "SELECT t FROM TEmp t WHERE t.fid = :fid")
        , @NamedQuery(name = "TEmp.findByFIsCreditMgr", query = "SELECT t FROM TEmp t WHERE t.fIsCreditMgr = :fIsCreditMgr")
        , @NamedQuery(name = "TEmp.findByFItemDepID", query = "SELECT t FROM TEmp t WHERE t.fItemDepID = :fItemDepID")
        , @NamedQuery(name = "TEmp.findByFItemID", query = "SELECT t FROM TEmp t WHERE t.fItemID = :fItemID")
        , @NamedQuery(name = "TEmp.findByFJobTypeID", query = "SELECT t FROM TEmp t WHERE t.fJobTypeID = :fJobTypeID")
        , @NamedQuery(name = "TEmp.findByFLeaveDate", query = "SELECT t FROM TEmp t WHERE t.fLeaveDate = :fLeaveDate")
        , @NamedQuery(name = "TEmp.findByFMFGCardNo", query = "SELECT t FROM TEmp t WHERE t.fMFGCardNo = :fMFGCardNo")
        , @NamedQuery(name = "TEmp.findByFMobilePhone", query = "SELECT t FROM TEmp t WHERE t.fMobilePhone = :fMobilePhone")
        , @NamedQuery(name = "TEmp.findByFName", query = "SELECT t FROM TEmp t WHERE t.fName = :fName")
        , @NamedQuery(name = "TEmp.findByFNote", query = "SELECT t FROM TEmp t WHERE t.fNote = :fNote")
        , @NamedQuery(name = "TEmp.findByFNumber", query = "SELECT t FROM TEmp t WHERE t.fNumber = :fNumber")
        , @NamedQuery(name = "TEmp.findByFOperationGroup", query = "SELECT t FROM TEmp t WHERE t.fOperationGroup = :fOperationGroup")
        , @NamedQuery(name = "TEmp.findByFOtherAPAcctID", query = "SELECT t FROM TEmp t WHERE t.fOtherAPAcctID = :fOtherAPAcctID")
        , @NamedQuery(name = "TEmp.findByFOtherARAcctID", query = "SELECT t FROM TEmp t WHERE t.fOtherARAcctID = :fOtherARAcctID")
        , @NamedQuery(name = "TEmp.findByFParentID", query = "SELECT t FROM TEmp t WHERE t.fParentID = :fParentID")
        , @NamedQuery(name = "TEmp.findByFPersonalBank", query = "SELECT t FROM TEmp t WHERE t.fPersonalBank = :fPersonalBank")
        , @NamedQuery(name = "TEmp.findByFPhone", query = "SELECT t FROM TEmp t WHERE t.fPhone = :fPhone")
        , @NamedQuery(name = "TEmp.findByFPreAPAcctID", query = "SELECT t FROM TEmp t WHERE t.fPreAPAcctID = :fPreAPAcctID")
        , @NamedQuery(name = "TEmp.findByFPreARAcctID", query = "SELECT t FROM TEmp t WHERE t.fPreARAcctID = :fPreARAcctID")
        , @NamedQuery(name = "TEmp.findByFProfessionalGroup", query = "SELECT t FROM TEmp t WHERE t.fProfessionalGroup = :fProfessionalGroup")
        , @NamedQuery(name = "TEmp.findByFProvinceID", query = "SELECT t FROM TEmp t WHERE t.fProvinceID = :fProvinceID")
        , @NamedQuery(name = "TEmp.findByFShortNumber", query = "SELECT t FROM TEmp t WHERE t.fShortNumber = :fShortNumber")
})
public class TEmp extends TItem {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Id
    @Column(name = "FItemID")
    private int fItemID;
    @Size(max = 100)
    @Column(name = "FAccountName")
    private String fAccountName;
    @Size(max = 255)
    @Column(name = "FAddress")
    private String fAddress;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FAllotPercent")
    private BigDecimal fAllotPercent;
    @Column(name = "FAllotWeight")
    private BigDecimal fAllotWeight;
    @Size(max = 100)
    @Column(name = "FBankAccount")
    private String fBankAccount;
    @Column(name = "FBankID")
    private Integer fBankID;
    @Column(name = "FBirthday")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date fBirthday;
    @Size(max = 10)
    @Column(name = "FBrNO")
    private String fBrNO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FCityID")
    private int fCityID;
    @Column(name = "FCreditAmount")
    private BigDecimal fCreditAmount;
    @Column(name = "FCreditDays")
    private Integer fCreditDays;
    @Column(name = "FCreditLevel")
    private Integer fCreditLevel;
    @Column(name = "FCreditPeriod")
    private Integer fCreditPeriod;
    @Column(name = "FDegree")
    private Integer fDegree;
    @Column(name = "FDeleted")
    private short fDeleted;
    @JoinColumn(name = "FDepartmentID", referencedColumnName = "FItemID")
    @ManyToOne
    private TDepartment fDepartmentID;
    @Column(name = "FDuty")
    private Integer fDuty;
    @Size(max = 50)
    @Column(name = "FEmail")
    private String fEmail;
    @Column(name = "FEmpGroup")
    private Integer fEmpGroup;
    @Column(name = "FEmpGroupID")
    private Integer fEmpGroupID;
    @Column(name = "FGender")
    private Integer fGender;
    @Column(name = "FHireDate")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date fHireDate;
    @Size(max = 50)
    @Column(name = "FID")
    private String fid;
    @Column(name = "FIsCreditMgr")
    private Boolean fIsCreditMgr;
    @Column(name = "FItemDepID")
    private Integer fItemDepID;

    @Column(name = "FJobTypeID")
    private Integer fJobTypeID;
    @Column(name = "FLeaveDate")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date fLeaveDate;
    @Size(max = 100)
    @Column(name = "FMFGCardNo")
    private String fMFGCardNo;
    @Size(max = 50)
    @Column(name = "FMobilePhone")
    private String fMobilePhone;
    //    @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FName")
    private String fName;
    @Size(max = 255)
    @Column(name = "FNote")
    private String fNote;
    @Size(max = 255)
    @Column(name = "FNumber")
    private String fNumber;
    @Column(name = "FOperationGroup")
    private Integer fOperationGroup;
    @Column(name = "FOtherAPAcctID")
    private Integer fOtherAPAcctID;
    @Column(name = "FOtherARAcctID")
    private Integer fOtherARAcctID;
    @Column(name = "FParentID")
    private Integer fParentID;
    @Size(max = 100)
    @Column(name = "FPersonalBank")
    private String fPersonalBank;
    @Size(max = 40)
    @Column(name = "FPhone")
    private String fPhone;
    @Column(name = "FPreAPAcctID")
    private Integer fPreAPAcctID;
    @Column(name = "FPreARAcctID")
    private Integer fPreARAcctID;

    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "FProfessionalGroup", referencedColumnName = "FInterID")//
    @ManyToOne
    private Team fProfessionalGroup;

    @Basic(optional = false)
    @NotNull
    @Column(name = "FProvinceID")
    private int fProvinceID;
    @Size(max = 80)
    @Column(name = "FShortNumber")
    private String fShortNumber;
    @Size(max = 99)
    @Column(name = "F_102")
    private String f102;

    public TEmp() {
    }

    public String getFAccountName() {
        return fAccountName;
    }

    public void setFAccountName(String fAccountName) {
        this.fAccountName = fAccountName;
    }

    public String getFAddress() {
        return fAddress;
    }

    public void setFAddress(String fAddress) {
        this.fAddress = fAddress;
    }

    public BigDecimal getFAllotPercent() {
        return fAllotPercent;
    }

    public void setFAllotPercent(BigDecimal fAllotPercent) {
        this.fAllotPercent = fAllotPercent;
    }

    public BigDecimal getFAllotWeight() {
        return fAllotWeight;
    }

    public void setFAllotWeight(BigDecimal fAllotWeight) {
        this.fAllotWeight = fAllotWeight;
    }

    public String getFBankAccount() {
        return fBankAccount;
    }

    public void setFBankAccount(String fBankAccount) {
        this.fBankAccount = fBankAccount;
    }

    public Integer getFBankID() {
        return fBankID;
    }

    public void setFBankID(Integer fBankID) {
        this.fBankID = fBankID;
    }

    public Date getFBirthday() {
        return fBirthday;
    }

    public void setFBirthday(Date fBirthday) {
        this.fBirthday = fBirthday;
    }

    public String getFBrNO() {
        return fBrNO;
    }

    public void setFBrNO(String fBrNO) {
        this.fBrNO = fBrNO;
    }

    public int getFCityID() {
        return fCityID;
    }

    public void setFCityID(int fCityID) {
        this.fCityID = fCityID;
    }

    public BigDecimal getFCreditAmount() {
        return fCreditAmount;
    }

    public void setFCreditAmount(BigDecimal fCreditAmount) {
        this.fCreditAmount = fCreditAmount;
    }

    public Integer getFCreditDays() {
        return fCreditDays;
    }

    public void setFCreditDays(Integer fCreditDays) {
        this.fCreditDays = fCreditDays;
    }

    public Integer getFCreditLevel() {
        return fCreditLevel;
    }

    public void setFCreditLevel(Integer fCreditLevel) {
        this.fCreditLevel = fCreditLevel;
    }

    public Integer getFCreditPeriod() {
        return fCreditPeriod;
    }

    public void setFCreditPeriod(Integer fCreditPeriod) {
        this.fCreditPeriod = fCreditPeriod;
    }

    public Integer getFDegree() {
        return fDegree;
    }

    public void setFDegree(Integer fDegree) {
        this.fDegree = fDegree;
    }

    public Short getFDeleted() {
        return fDeleted;
    }

    public void setFDeleted(Short fDeleted) {
        this.fDeleted = fDeleted;
    }

//    public TDepartment getFDepartmentID() {
//        return fDepartmentID;
//    }
//
//    public void setFDepartmentID(TDepartment fDepartmentID) {
//        this.fDepartmentID = fDepartmentID;
//    }

    public Integer getFDuty() {
        return fDuty;
    }

    public void setFDuty(Integer fDuty) {
        this.fDuty = fDuty;
    }

    public String getFEmail() {
        return fEmail;
    }

    public void setFEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    public Integer getFEmpGroup() {
        return fEmpGroup;
    }

    public void setFEmpGroup(Integer fEmpGroup) {
        this.fEmpGroup = fEmpGroup;
    }

    public Integer getFEmpGroupID() {
        return fEmpGroupID;
    }

    public void setFEmpGroupID(Integer fEmpGroupID) {
        this.fEmpGroupID = fEmpGroupID;
    }

    public Integer getFGender() {
        return fGender;
    }

    public void setFGender(Integer fGender) {
        this.fGender = fGender;
    }

    public Date getFHireDate() {
        return fHireDate;
    }

    public void setFHireDate(Date fHireDate) {
        this.fHireDate = fHireDate;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public Boolean getFIsCreditMgr() {
        return fIsCreditMgr;
    }

    public void setFIsCreditMgr(Boolean fIsCreditMgr) {
        this.fIsCreditMgr = fIsCreditMgr;
    }

    public Integer getFItemDepID() {
        return fItemDepID;
    }

    public void setFItemDepID(Integer fItemDepID) {
        this.fItemDepID = fItemDepID;
    }

    public int getFItemID() {
        return fItemID;
    }

    public void setFItemID(int fItemID) {
        this.fItemID = fItemID;
    }

    public Integer getFJobTypeID() {
        return fJobTypeID;
    }

    public void setFJobTypeID(Integer fJobTypeID) {
        this.fJobTypeID = fJobTypeID;
    }

    public Date getFLeaveDate() {
        return fLeaveDate;
    }

    public void setFLeaveDate(Date fLeaveDate) {
        this.fLeaveDate = fLeaveDate;
    }

    public String getFMFGCardNo() {
        return fMFGCardNo;
    }

    public void setFMFGCardNo(String fMFGCardNo) {
        this.fMFGCardNo = fMFGCardNo;
    }

    public String getFMobilePhone() {
        return fMobilePhone;
    }

    public void setFMobilePhone(String fMobilePhone) {
        this.fMobilePhone = fMobilePhone;
    }

//    public byte[] getFModifyTime() {
//        return fModifyTime;
//    }
//
//    public void setFModifyTime(byte[] fModifyTime) {
//        this.fModifyTime = fModifyTime;
//    }
//
//    public String getFName() {
//        return fName;
//    }
//
//    public void setFName(String fName) {
//        this.fName = fName;
//    }

    public String getFNote() {
        return fNote;
    }

    public void setFNote(String fNote) {
        this.fNote = fNote;
    }

    public String getFNumber() {
        return fNumber;
    }

    public void setFNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public Integer getFOperationGroup() {
        return fOperationGroup;
    }

    public void setFOperationGroup(Integer fOperationGroup) {
        this.fOperationGroup = fOperationGroup;
    }

    public Integer getFOtherAPAcctID() {
        return fOtherAPAcctID;
    }

    public void setFOtherAPAcctID(Integer fOtherAPAcctID) {
        this.fOtherAPAcctID = fOtherAPAcctID;
    }

    public Integer getFOtherARAcctID() {
        return fOtherARAcctID;
    }

    public void setFOtherARAcctID(Integer fOtherARAcctID) {
        this.fOtherARAcctID = fOtherARAcctID;
    }

    public Integer getFParentID() {
        return fParentID;
    }

    public void setFParentID(Integer fParentID) {
        this.fParentID = fParentID;
    }

    public String getFPersonalBank() {
        return fPersonalBank;
    }

    public void setFPersonalBank(String fPersonalBank) {
        this.fPersonalBank = fPersonalBank;
    }

    public String getFPhone() {
        return fPhone;
    }

    public void setFPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    public Integer getFPreAPAcctID() {
        return fPreAPAcctID;
    }

    public void setFPreAPAcctID(Integer fPreAPAcctID) {
        this.fPreAPAcctID = fPreAPAcctID;
    }

    public Integer getFPreARAcctID() {
        return fPreARAcctID;
    }

    public void setFPreARAcctID(Integer fPreARAcctID) {
        this.fPreARAcctID = fPreARAcctID;
    }

//    public Team getFProfessionalGroup() {
//        return fProfessionalGroup;
//    }
//
//    public void setFProfessionalGroup(Team fProfessionalGroup) {
//        this.fProfessionalGroup = fProfessionalGroup;
//    }

    public int getFProvinceID() {
        return fProvinceID;
    }

    public void setFProvinceID(int fProvinceID) {
        this.fProvinceID = fProvinceID;
    }

    public String getFShortNumber() {
        return fShortNumber;
    }

    public void setFShortNumber(String fShortNumber) {
        this.fShortNumber = fShortNumber;
    }

    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
    }

}
