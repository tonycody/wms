/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.zeh.wms.dal.dataobject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


import java.io.*;
import java.net.*;
import java.util.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.zeh.jungle.dal.paginator.PageQuery;
import com.zeh.jungle.dal.paginator.PageList;
import com.zeh.jungle.dal.paginator.PageQueryUtils;
/**
 * ManufacturerDO
 * database table: manufacturer
 * database table comments: Manufacturer
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class ManufacturerDO implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/**
	 * 主键 		db_column: id 
	 */
	private long id;
	/**
	 * 厂商编号 		db_column: code 
	 */
	private String code;
	/**
	 * name 		db_column: name 
	 */
	private String name;
	/**
	 * 结算方式； real：实时线上结算 monthly：月结算 		db_column: settle_type 
	 */
	private String settleType;
	/**
	 * 快递公司类型，SF-顺丰，DEPPON-德邦 		db_column: express 
	 */
	private String express;
	/**
	 * gmtCreate 		db_column: gmt_create 
	 */
	private Date gmtCreate;
	/**
	 * gmtModified 		db_column: gmt_modified 
	 */
	private Date gmtModified;
	/**
	 * createBy 		db_column: create_by 
	 */
	private String createBy;
	/**
	 * modifyBy 		db_column: modify_by 
	 */
	private String modifyBy;

	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}
	
	public String getSettleType() {
		return this.settleType;
	}
	
	public void setExpress(String express) {
		this.express = express;
	}
	
	public String getExpress() {
		return this.express;
	}
	
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	
	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	
	public Date getGmtModified() {
		return this.gmtModified;
	}
	
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	public String getCreateBy() {
		return this.createBy;
	}
	
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	
	public String getModifyBy() {
		return this.modifyBy;
	}

	public String toString() {
		return new ToStringBuilder(this)
			.append("Id",getId())
			.append("Code",getCode())
			.append("Name",getName())
			.append("SettleType",getSettleType())
			.append("Express",getExpress())
			.append("GmtCreate",getGmtCreate())
			.append("GmtModified",getGmtModified())
			.append("CreateBy",getCreateBy())
			.append("ModifyBy",getModifyBy())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(obj instanceof ManufacturerDO == false) return false;
		ManufacturerDO other = (ManufacturerDO)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

