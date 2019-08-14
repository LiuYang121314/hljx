package com.kingdee.hljx.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_ad_kdAccount_gl")
@Data
public class TAdKdAccountGl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    private int fAcctID;
    private String fAcctNumber;
    private String fAcctName;
    private String fDBName;
    @NotNull
    private int fDBType;
    private String fConnectString;
    private String fCreator;
    private Date fCreateTime;
    private Date fDupTime;
    private String fVersion;
    private int fNodeID;
    private String fServer;
    private Date fBackupTime;
    private String fSysPwd;
    private int fLevel;
    private Integer fIsPort;
    private Integer fSRMRelation;
}
