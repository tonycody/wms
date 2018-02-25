
/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.zeh.wms.dal.operation.qrcodebatch;

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
 * database table: qrcode_batch
 * database table comments: QrcodeBatch
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class QueryByPageQuery  extends PageQuery implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** batchSerial */
	private String batchSerial;
	/** 商品ID */
	private Long commodityId;
	/** 批次状态； 0-未使用，1-已使用 */
	private Integer state;
	
	public QueryByPageQuery() {
	}
	
	public QueryByPageQuery(String batchSerial ,Long commodityId ,Integer state ) {
		this.batchSerial = batchSerial;
		this.commodityId = commodityId;
		this.state = state;
	}
	
	public String getBatchSerial() {
		return batchSerial;
	}
	public void setBatchSerial(String batchSerial) {
		this.batchSerial = batchSerial;
	}
	public Long getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
