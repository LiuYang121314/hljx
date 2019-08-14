/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.ext;

import com.kingdee.hljx.entity.item.TEmp;
import com.kingdee.hljx.entity.item.TItem;
import com.kingdee.hljx.entity.item.TWorkCenter;
import com.kingdee.hljx.entity.submessage.Team;
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
 * 核算项目-班组
 *
 * @author moon
 */
@Entity
@Table(name = "t_Item_3001")
@DiscriminatorValue("3001")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@NamedQueries({
//    @NamedQuery(name = "TItem3001.findAll", query = "SELECT t FROM TItem3001 t")
//    , @NamedQuery(name = "TItem3001.findByFItemID", query = "SELECT t FROM TItem3001 t WHERE t.fItemID = :fItemID")
//    , @NamedQuery(name = "TItem3001.findByF101", query = "SELECT t FROM TItem3001 t WHERE t.f101 = :f101")
//    , @NamedQuery(name = "TItem3001.findByF102", query = "SELECT t FROM TItem3001 t WHERE t.f102 = :f102")
//    , @NamedQuery(name = "TItem3001.findByFNumber", query = "SELECT t FROM TItem3001 t WHERE t.fNumber = :fNumber")
//    , @NamedQuery(name = "TItem3001.findByFName", query = "SELECT t FROM TItem3001 t WHERE t.fName = :fName")
})
public class TItem3001 /*extends TItem*/ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FItemID")
    private Integer fItemID;
    //    @JoinColumn(name = "F_101")//,referencedColumnName = "FInterID"
//    @ManyToOne
//    private Team f101;
    @Column(name = "F_101")
    private int f101;
    //    -------------------------------------------------------------------
//    @JoinColumn(name = "F_102")//,referencedColumnName = "FItemID"
//    @ManyToOne
//    @Column(name="F_102")
//    private TEmp f102;
//    @JoinColumn(name = "F_103")//,referencedColumnName = "FItemID"
//    @ManyToOne
//    private TWorkCenter f103;
    @Column(name = "F_103")
    private int f103;
    //    ----------------------------------------------------------------------
    @Basic(optional = false)
    @NotNull
    //   @Lob
    @Column(name = "FModifyTime")
    private byte[] fModifyTime;
    @Size(max = 80)
    @Column(name = "FNumber")
    private String fNumber;
    @Size(max = 255)
    @Column(name = "FName")
    private String fName;
    @Size(max = 255)
    @Column(name = "F_104")
    private String f104;

    public int getF103() {
        return f103;
    }

    public void setF103(int f103) {
        this.f103 = f103;
    }
}
