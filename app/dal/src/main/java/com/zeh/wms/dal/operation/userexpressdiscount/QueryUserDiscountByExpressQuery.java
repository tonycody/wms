
/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.zeh.wms.dal.operation.userexpressdiscount;

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
 * database table: user_express_discount
 * database table comments: UserExpressDiscount
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class QueryUserDiscountByExpressQuery  implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** 前端用户主键 */
	private Long userId;
	/** 快递公司code */
	private String expressCode;
	
	public QueryUserDiscountByExpressQuery() {
	}
	
	public QueryUserDiscountByExpressQuery(Long userId ,String expressCode ) {
		this.userId = userId;
		this.expressCode = expressCode;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getExpressCode() {
		return expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
