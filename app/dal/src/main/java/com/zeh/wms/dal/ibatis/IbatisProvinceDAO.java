/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.operation.province.*;
import com.zeh.wms.dal.dataobject.*;


import java.io.*;
import java.net.*;
import java.util.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.zeh.jungle.dal.paginator.PageQuery;
import com.zeh.jungle.dal.paginator.PageList;
import com.zeh.jungle.dal.paginator.PageQueryUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zeh.wms.dal.dataobject.ProvinceDO;
import com.zeh.wms.dal.daointerface.ProvinceDAO;

/**
 * ProvinceDAO
 * database table: province
 * database table comments: Province
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisProvinceDAO extends SqlMapClientDaoSupport implements ProvinceDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         province         (           id ,code ,name ,gmt_create ,gmt_modified ,create_by ,modify_by           )      VALUES         (?,?,?,?,?,?,?)</pre>
	 */
	public long insert(ProvinceDO province) throws DataAccessException {
		if(province == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.Province.insert", province);
		return province.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         province      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.Province.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         province      SET         code = ? ,name = ? ,gmt_create = ? ,gmt_modified = ? ,create_by = ? ,modify_by = ?                WHERE         id = ?</pre>
	 */
	public int update(ProvinceDO province) throws DataAccessException {
		if(province == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.Province.update", province);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, code, name, gmt_create, gmt_modified, create_by, modify_by                  FROM         province                WHERE         id = ?</pre>
	 */
	public ProvinceDO queryById(Long id) throws DataAccessException {
		return (ProvinceDO)getSqlMapClientTemplate().queryForObject("wms.Province.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, code, name, gmt_create, gmt_modified, create_by, modify_by            FROM         province</pre>
	 */
	public PageList<ProvinceDO> findPage(int pageSize,int pageNum) throws DataAccessException {
		return PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"wms.Province.findPage",null,pageNum,pageSize);
	}

}
