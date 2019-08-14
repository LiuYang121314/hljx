/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.ext;


import com.kingdee.hljx.entity.item.TICItem;
import com.kingdee.hljx.entity.measure.TMeasureUnit;
import com.kingdee.hljx.entity.stock.TStock;
import com.kingdee.hljx.entity.stock.TStockPlace;
import com.kingdee.hljx.entity.submessage.MeasureInType;
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
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * 入库过磅单
 *
 * @author moon
 */
@Entity
@Table(name = "t_BOS200000001")
@Getter
@Setter
@NoArgsConstructor
@XmlRootElement
@NamedQueries({
//    @NamedQuery(name = "TBOS200000001.findAll", query = "SELECT t FROM TBOS200000001 t")
//    , @NamedQuery(name = "TBOS200000001.findByFid", query = "SELECT t FROM TBOS200000001 t WHERE t.fid = :fid")
//    , @NamedQuery(name = "TBOS200000001.findByFClassTypeID", query = "SELECT t FROM TBOS200000001 t WHERE t.fClassTypeID = :fClassTypeID")
//    , @NamedQuery(name = "TBOS200000001.findByFBillNo", query = "SELECT t FROM TBOS200000001 t WHERE t.fBillNo = :fBillNo")
//    , @NamedQuery(name = "TBOS200000001.findByFDate", query = "SELECT t FROM TBOS200000001 t WHERE t.fDate = :fDate")
//    , @NamedQuery(name = "TBOS200000001.findByFTime", query = "SELECT t FROM TBOS200000001 t WHERE t.fTime = :fTime")
//    , @NamedQuery(name = "TBOS200000001.findByFBase", query = "SELECT t FROM TBOS200000001 t WHERE t.fBase = :fBase")
//    , @NamedQuery(name = "TBOS200000001.findByFBase1", query = "SELECT t FROM TBOS200000001 t WHERE t.fBase1 = :fBase1")
//    , @NamedQuery(name = "TBOS200000001.findByFQty", query = "SELECT t FROM TBOS200000001 t WHERE t.fQty = :fQty")
//    , @NamedQuery(name = "TBOS200000001.findByFBase2", query = "SELECT t FROM TBOS200000001 t WHERE t.fBase2 = :fBase2")
//    , @NamedQuery(name = "TBOS200000001.findByFQty1", query = "SELECT t FROM TBOS200000001 t WHERE t.fQty1 = :fQty1")
//    , @NamedQuery(name = "TBOS200000001.findByFBase3", query = "SELECT t FROM TBOS200000001 t WHERE t.fBase3 = :fBase3")
//    , @NamedQuery(name = "TBOS200000001.findByFBase4", query = "SELECT t FROM TBOS200000001 t WHERE t.fBase4 = :fBase4")
//    , @NamedQuery(name = "TBOS200000001.findByFBiller", query = "SELECT t FROM TBOS200000001 t WHERE t.fBiller = :fBiller")
//    , @NamedQuery(name = "TBOS200000001.findByFUser", query = "SELECT t FROM TBOS200000001 t WHERE t.fUser = :fUser")
//    , @NamedQuery(name = "TBOS200000001.findByFBase5", query = "SELECT t FROM TBOS200000001 t WHERE t.fBase5 = :fBase5")
//    , @NamedQuery(name = "TBOS200000001.findByFQty2", query = "SELECT t FROM TBOS200000001 t WHERE t.fQty2 = :fQty2")
//    , @NamedQuery(name = "TBOS200000001.findByFBatchNo", query = "SELECT t FROM TBOS200000001 t WHERE t.fBatchNo = :fBatchNo")
//    , @NamedQuery(name = "TBOS200000001.findByFidSrc", query = "SELECT t FROM TBOS200000001 t WHERE t.fidSrc = :fidSrc")
//    , @NamedQuery(name = "TBOS200000001.findByFEntryIDSRC", query = "SELECT t FROM TBOS200000001 t WHERE t.fEntryIDSRC = :fEntryIDSRC")
//    , @NamedQuery(name = "TBOS200000001.findByFBillNoSRC", query = "SELECT t FROM TBOS200000001 t WHERE t.fBillNoSRC = :fBillNoSRC")
//    , @NamedQuery(name = "TBOS200000001.findByFClassIDSRC", query = "SELECT t FROM TBOS200000001 t WHERE t.fClassIDSRC = :fClassIDSRC")
//    , @NamedQuery(name = "TBOS200000001.findByFText", query = "SELECT t FROM TBOS200000001 t WHERE t.fText = :fText")
//    , @NamedQuery(name = "TBOS200000001.findByFInteger", query = "SELECT t FROM TBOS200000001 t WHERE t.fInteger = :fInteger")
//    , @NamedQuery(name = "TBOS200000001.findByFQty3", query = "SELECT t FROM TBOS200000001 t WHERE t.fQty3 = :fQty3")
//    , @NamedQuery(name = "TBOS200000001.findByFInteger1", query = "SELECT t FROM TBOS200000001 t WHERE t.fInteger1 = :fInteger1")
//    , @NamedQuery(name = "TBOS200000001.findByFInteger2", query = "SELECT t FROM TBOS200000001 t WHERE t.fInteger2 = :fInteger2")
//    , @NamedQuery(name = "TBOS200000001.findByFConnectFlag", query = "SELECT t FROM TBOS200000001 t WHERE t.fConnectFlag = :fConnectFlag")
})
public class TBOS200000001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
//    @NotNull
    @Column(name = "FID")
    private Integer fid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FClassTypeID")
    private final int fClassTypeID = 200000001;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FBillNo")
    private String fBillNo;
    @Column(name = "fDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fDate;
    @Column(name = "FTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fTime;
    //    @NotFound(action = NotFoundAction.IGNORE)
//    @JoinColumn(name = "FBase",referencedColumnName="FItemID")
//    @ManyToOne
//    private TICItem fBase;
    @Column(name = "FBase")
    private int fBase;

    //    @NotFound(action = NotFoundAction.IGNORE)
//    @JoinColumn(name = "FBase1",referencedColumnName="FItemID")
//    @ManyToOne
//    private TMeasureUnit fBase1;
    @Column(name = "FBase1")
    private int fBase1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FQty")
    private BigDecimal fQty = BigDecimal.ZERO;
    @Column(name = "FBase2")
    private Integer fBase2 = 0;
    @Column(name = "FQty1")
    private BigDecimal fQty1 = BigDecimal.ZERO;
    @Column(name = "FBase3")
    private Integer fBase3 = 0;
    //    @NotFound(action = NotFoundAction.IGNORE)
//    @JoinColumn(name = "FBase4",referencedColumnName="FItemID")
//    @ManyToOne
//    private TItem3001 fBase4;
    @Column(name = "FBase4")
    private int fBase4;
    @Column(name = "FBiller")
    private Integer fBiller;
    @Column(name = "FUser")
    private Integer fUser;
    //    @Lob
    @Column(name = "FPicture")
    private byte[] fPicture;
    @Column(name = "FBase5")
    private Integer fBase5;
    @Column(name = "FBase6")
    private Integer fBase6 = 0;
    //    @NotFound(action = NotFoundAction.IGNORE)
//    @JoinColumn(name = "FBase7",referencedColumnName="FInterID")
//    @ManyToOne()
//    private MeasureInType measureInType;
    @Column(name = "FBase7")
    private int fBase7;
    //    @NotFound(action = NotFoundAction.IGNORE)
//    @JoinColumn(name = "FBase8",referencedColumnName="FItemID")
//    @ManyToOne
//    private TStock fBase8;
    @Column(name = "FBase8")
    private int fBase8;
    //    @NotFound(action = NotFoundAction.IGNORE)
//    @JoinColumn(name = "FBase9",referencedColumnName="FSPID")
//    @ManyToOne
//    private TStockPlace fBase9;
    @Column(name = "FBase9")
    private int fBase9;
    @Column(name = "FQty2")
    private BigDecimal fQty2 = BigDecimal.ZERO;
    @Size(max = 255)
    @Column(name = "FBatchNo")
    private String fBatchNo = "";
    @Column(name = "FID_SRC")
    private Integer fidSrc;
    @Column(name = "FEntryID_SRC")
    private Integer fEntryIDSRC;
    @Size(max = 255)
    @Column(name = "FBillNo_SRC")
    private String fBillNoSRC;
    @Column(name = "FClassID_SRC")
    private Integer fClassIDSRC;
    @Size(max = 500)
    @Column(name = "FText")
    private String fText;
    @Column(name = "FInteger")
    private Integer fInteger = 0;
    @Column(name = "FQty3")
    private BigDecimal fQty3 = BigDecimal.ZERO;
    @Column(name = "FInteger1")
    private Integer fInteger1 = 0;
    @Column(name = "FInteger2")
    private Integer fInteger2 = 0;
    @Column(name = "FConnectFlag")
    private Short fConnectFlag = 0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FDecimal5")
    private BigDecimal fDecimal5 = BigDecimal.ZERO;


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TBOS200000001)) {
            return false;
        }
        TBOS200000001 other = (TBOS200000001) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    public Integer getFBase6() {
        return fBase6;
    }

    public void setFBase6(Integer fBase6) {
        this.fBase6 = fBase6;
    }

//    public MeasureInType getMeasureInType() {
//        return measureInType;
//    }
//
//    public void setMeasureInType(MeasureInType measureInType) {
//        this.measureInType = measureInType;
//    }

    public int getfBase7() {
        return fBase7;
    }

    public void setfBase7(int fBase7) {
        this.fBase7 = fBase7;
    }

//    public TStock getFBase8() {
//        return fBase8;
//    }
//
//    public void setFBase8(TStock fBase8) {
//        this.fBase8 = fBase8;
//    }

//    public TStockPlace getFBase9() {
////        return fBase9;
////    }
////
////    public void setFBase9(TStockPlace fBase9) {
////        this.fBase9 = fBase9;
////    }

    public int getfBase9() {
        return fBase9;
    }

    public void setfBase9(int fBase9) {
        this.fBase9 = fBase9;
    }

    //    @GeneratedValue(strategy = GenerationType.TABLE)
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public int getfClassTypeID() {
        return fClassTypeID;
    }

    public String getfBillNo() {
        return fBillNo;
    }

    public void setfBillNo(String fBillNo) {
        this.fBillNo = fBillNo;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public Date getfTime() {
        return fTime;
    }

    public void setfTime(Date fTime) {
        this.fTime = fTime;
    }

//    public TICItem getfBase() {
//        return fBase;
//    }
//
//    public void setfBase(TICItem fBase) {
//        this.fBase = fBase;
//    }


    public int getfBase() {
        return fBase;
    }

    public void setfBase(int fBase) {
        this.fBase = fBase;
    }
//
//    public TMeasureUnit getfBase1() {
//        return fBase1;
//    }
//
//    public void setfBase1(TMeasureUnit fBase1) {
//        this.fBase1 = fBase1;
//    }

    public int getfBase1() {
        return fBase1;
    }

    public void setfBase1(int fBase1) {
        this.fBase1 = fBase1;
    }

    public BigDecimal getfQty() {
        return fQty;
    }

    public void setfQty(BigDecimal fQty) {
        this.fQty = fQty;
    }

    public Integer getfBase2() {
        return fBase2;
    }

    public void setfBase2(Integer fBase2) {
        this.fBase2 = fBase2;
    }

    public BigDecimal getfQty1() {
        return fQty1;
    }

    public void setfQty1(BigDecimal fQty1) {
        this.fQty1 = fQty1;
    }

    public Integer getfBase3() {
        return fBase3;
    }

    public void setfBase3(Integer fBase3) {
        this.fBase3 = fBase3;
    }

//    public TItem3001 getfBase4() {
//        return fBase4;
//    }

//    public void setfBase4(TItem3001 fBase4) {
//        this.fBase4 = fBase4;
//    }

    public int getfBase4() {
        return fBase4;
    }

    public void setfBase4(int fBase4) {
        this.fBase4 = fBase4;
    }

    public Integer getfBiller() {
        return fBiller;
    }

    public void setfBiller(Integer fBiller) {
        this.fBiller = fBiller;
    }

    public Integer getfUser() {
        return fUser;
    }

    public void setfUser(Integer fUser) {
        this.fUser = fUser;
    }

    public byte[] getfPicture() {
        return fPicture;
    }

    public void setfPicture(byte[] fPicture) {
        this.fPicture = fPicture;
    }

    public Integer getfBase5() {
        return fBase5;
    }

    public void setfBase5(Integer fBase5) {
        this.fBase5 = fBase5;
    }

    public Integer getfBase6() {
        return fBase6;
    }

    public void setfBase6(Integer fBase6) {
        this.fBase6 = fBase6;
    }
//
//    public TStockPlace getfBase9() {
//        return fBase9;
//    }
//
//    public void setfBase9(TStockPlace fBase9) {
//        this.fBase9 = fBase9;
//    }

    public BigDecimal getfQty2() {
        return fQty2;
    }

    public void setfQty2(BigDecimal fQty2) {
        this.fQty2 = fQty2;
    }

    public String getfBatchNo() {
        return fBatchNo;
    }

    public void setfBatchNo(String fBatchNo) {
        this.fBatchNo = fBatchNo;
    }

    public Integer getFidSrc() {
        return fidSrc;
    }

    public void setFidSrc(Integer fidSrc) {
        this.fidSrc = fidSrc;
    }

    public Integer getfEntryIDSRC() {
        return fEntryIDSRC;
    }

    public void setfEntryIDSRC(Integer fEntryIDSRC) {
        this.fEntryIDSRC = fEntryIDSRC;
    }

    public String getfBillNoSRC() {
        return fBillNoSRC;
    }

    public void setfBillNoSRC(String fBillNoSRC) {
        this.fBillNoSRC = fBillNoSRC;
    }

    public Integer getfClassIDSRC() {
        return fClassIDSRC;
    }

    public void setfClassIDSRC(Integer fClassIDSRC) {
        this.fClassIDSRC = fClassIDSRC;
    }

    public String getfText() {
        return fText;
    }

    public void setfText(String fText) {
        this.fText = fText;
    }

    public Integer getfInteger() {
        return fInteger;
    }

    public void setfInteger(Integer fInteger) {
        this.fInteger = fInteger;
    }

    public BigDecimal getfQty3() {
        return fQty3;
    }

    public void setfQty3(BigDecimal fQty3) {
        this.fQty3 = fQty3;
    }

    public Integer getfInteger1() {
        return fInteger1;
    }

    public void setfInteger1(Integer fInteger1) {
        this.fInteger1 = fInteger1;
    }

    public Integer getfInteger2() {
        return fInteger2;
    }

    public void setfInteger2(Integer fInteger2) {
        this.fInteger2 = fInteger2;
    }

    public Short getfConnectFlag() {
        return fConnectFlag;
    }

    public void setfConnectFlag(Short fConnectFlag) {
        this.fConnectFlag = fConnectFlag;
    }

    public BigDecimal getfDecimal5() {
        return fDecimal5;
    }

    public void setfDecimal5(BigDecimal fDecimal5) {
        this.fDecimal5 = fDecimal5;
    }

    public int getfBase8() {
        return fBase8;
    }

    public void setfBase8(int fBase8) {
        this.fBase8 = fBase8;
    }

    @Override
    public String toString() {
        return "{" +
                "fid=" + fid +
                ", fClassTypeID=" + fClassTypeID +
                ", fBillNo='" + fBillNo + '\'' +
                ", fDate=" + fDate +
                ", fTime=" + fTime +
                ", fBase=" + fBase +
                ", fBase1=" + fBase1 +
                ", fQty=" + fQty +
                ", fBase2=" + fBase2 +
                ", fQty1=" + fQty1 +
                ", fBase3=" + fBase3 +
                ", fBase4=" + fBase4 +
                ", fBiller=" + fBiller +
                ", fUser=" + fUser +
                ", fPicture=" + Arrays.toString(fPicture) +
                ", fBase5=" + fBase5 +
                ", fBase6=" + fBase6 +
                ", fBase7=" + fBase7 +
                ", fBase8=" + fBase8 +
                ", fBase9=" + fBase9 +
                ", fQty2=" + fQty2 +
                ", fBatchNo='" + fBatchNo + '\'' +
                ", fidSrc=" + fidSrc +
                ", fEntryIDSRC=" + fEntryIDSRC +
                ", fBillNoSRC='" + fBillNoSRC + '\'' +
                ", fClassIDSRC=" + fClassIDSRC +
                ", fText='" + fText + '\'' +
                ", fInteger=" + fInteger +
                ", fQty3=" + fQty3 +
                ", fInteger1=" + fInteger1 +
                ", fInteger2=" + fInteger2 +
                ", fConnectFlag=" + fConnectFlag +
                ", fDecimal5=" + fDecimal5 +
                '}';
    }
}
