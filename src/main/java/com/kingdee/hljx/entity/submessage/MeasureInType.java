/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingdee.hljx.entity.submessage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

/**
 * 过磅类型
 *
 * @author moon
 */
@Entity
@Table(name = "t_SubMessage")
@DiscriminatorValue("10006")
public class MeasureInType extends TSubMessage {
}
