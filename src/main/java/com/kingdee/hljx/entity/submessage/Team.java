package com.kingdee.hljx.entity.submessage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author moon
 */
@Entity
@Table(name = "t_SubMessage")
@DiscriminatorValue("62")
public class Team extends TSubMessage {
}