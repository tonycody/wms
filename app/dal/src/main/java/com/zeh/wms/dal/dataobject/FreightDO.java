/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.zeh.wms.dal.dataobject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;
/**
 * FreightDO
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
public class FreightDO implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/**
	 * 主键 		db_column: id 
	 */
	private long id;
	/**
	 * 省编码 		db_column: province_code 
	 */
	private long provinceCode;
	/**
	 * 快递公司类型,SF-顺丰，DEPPON-德邦  		db_column: express_code 
	 */
	private String expressCode;
	/**
	 * 首重，单位：500克 		db_column: first_weight 
	 */
	private int firstWeight;
	/**
	 * 首重每500克单价原价，单价：分 		db_column: first_original_price 
	 */
	private int firstOriginalPrice;
	/**
	 * 续重每500克原始价格，单位：分 		db_column: additional_original_price 
	 */
	private int additionalOriginalPrice;
	/**
	 * 首重每500克单价成本价，单价：分 		db_column: first_cost_price 
	 */
	private int firstCostPrice;
	/**
	 * 续重每500克成本价格，单位：分 		db_column: additional_cost_price 
	 */
	private int additionalCostPrice;
	/**
	 * 启用状态，0-未启用，1-已启用 		db_column: enabled 
	 */
	private int enabled;
	/**
	 * 创建时间 		db_column: gmt_create 
	 */
	private Date gmtCreate;
	/**
	 * 修改时间 		db_column: gmt_modified 
	 */
	private Date gmtModified;
	/**
	 * 创建人 		db_column: create_by 
	 */
	private String createBy;
	/**
	 * 修改人 		db_column: modify_by 
	 */
	private String modifyBy;

	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setProvinceCode(long provinceCode) {
		this.provinceCode = provinceCode;
	}
	
	public long getProvinceCode() {
		return this.provinceCode;
	}
	
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}
	
	public String getExpressCode() {
		return this.expressCode;
	}
	
	public void setFirstWeight(int firstWeight) {
		this.firstWeight = firstWeight;
	}
	
	public int getFirstWeight() {
		return this.firstWeight;
	}
	
	public void setFirstOriginalPrice(int firstOriginalPrice) {
		this.firstOriginalPrice = firstOriginalPrice;
	}
	
	public int getFirstOriginalPrice() {
		return this.firstOriginalPrice;
	}
	
	public void setAdditionalOriginalPrice(int additionalOriginalPrice) {
		this.additionalOriginalPrice = additionalOriginalPrice;
	}
	
	public int getAdditionalOriginalPrice() {
		return this.additionalOriginalPrice;
	}
	
	public void setFirstCostPrice(int firstCostPrice) {
		this.firstCostPrice = firstCostPrice;
	}
	
	public int getFirstCostPrice() {
		return this.firstCostPrice;
	}
	
	public void setAdditionalCostPrice(int additionalCostPrice) {
		this.additionalCostPrice = additionalCostPrice;
	}
	
	public int getAdditionalCostPrice() {
		return this.additionalCostPrice;
	}
	
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	public int getEnabled() {
		return this.enabled;
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
			.append("ProvinceCode",getProvinceCode())
			.append("ExpressCode",getExpressCode())
			.append("FirstWeight",getFirstWeight())
			.append("FirstOriginalPrice",getFirstOriginalPrice())
			.append("AdditionalOriginalPrice",getAdditionalOriginalPrice())
			.append("FirstCostPrice",getFirstCostPrice())
			.append("AdditionalCostPrice",getAdditionalCostPrice())
			.append("Enabled",getEnabled())
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
		if(obj instanceof FreightDO == false) return false;
		FreightDO other = (FreightDO)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

