
/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.zeh.wms.dal.operation.freight;

import com.zeh.jungle.dal.paginator.PageQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
/**
 * database table: freight
 * database table comments: Freight
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
	
	/** 省编码 */
	private Long provinceCode;
	/** 快递公司类型,SF-顺丰，DEPPON-德邦  */
	private String expressCode;
	/** 启用状态，0-未启用，1-已启用 */
	private Integer enabled;
	
	public QueryByPageQuery() {
	}
	
	public QueryByPageQuery(Long provinceCode ,String expressCode ,Integer enabled ) {
		this.provinceCode = provinceCode;
		this.expressCode = expressCode;
		this.enabled = enabled;
	}
	
	public Long getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getExpressCode() {
		return expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
