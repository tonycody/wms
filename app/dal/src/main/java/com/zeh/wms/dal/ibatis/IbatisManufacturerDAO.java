/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.operation.manufacturer.*;
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

import com.zeh.wms.dal.dataobject.ManufacturerDO;
import com.zeh.wms.dal.daointerface.ManufacturerDAO;

/**
 * ManufacturerDAO
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
public class IbatisManufacturerDAO extends SqlMapClientDaoSupport implements ManufacturerDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         manufacturer         (             id ,code ,name ,settle_type ,express ,gmt_create ,gmt_modified ,create_by ,modify_by             )      VALUES         (?,?,?,?,?,?,?,?,?)</pre>
	 */
	public long insert(ManufacturerDO manufacturer) throws DataAccessException {
		if(manufacturer == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.Manufacturer.insert", manufacturer);
		return manufacturer.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         manufacturer      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.Manufacturer.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         manufacturer      SET         code = ? ,name = ? ,settle_type = ? ,express = ? ,gmt_create = ? ,gmt_modified = ? ,create_by = ? ,modify_by = ?                  WHERE         id = ?</pre>
	 */
	public int update(ManufacturerDO manufacturer) throws DataAccessException {
		if(manufacturer == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.Manufacturer.update", manufacturer);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, code, name, settle_type, express, gmt_create, gmt_modified, create_by, modify_by                       FROM         manufacturer                  WHERE         id = ?</pre>
	 */
	public ManufacturerDO queryById(Long id) throws DataAccessException {
		return (ManufacturerDO)getSqlMapClientTemplate().queryForObject("wms.Manufacturer.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, code, name, settle_type, express, gmt_create, gmt_modified, create_by, modify_by                       FROM         manufacturer                  WHERE         code = ?</pre>
	 */
	public ManufacturerDO queryByCode(String code) throws DataAccessException {
		return (ManufacturerDO)getSqlMapClientTemplate().queryForObject("wms.Manufacturer.queryByCode",code);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, code, name, settle_type, express, gmt_create, gmt_modified, create_by, modify_by                       FROM         manufacturer                  WHERE         1=1                                        AND                      code = ?                                            AND                      name = ?                                            AND                      settle_type = ?                                            AND                      express = ?                                                ORDER BY         gmt_modified DESC</pre>
	 */
	public PageList<ManufacturerDO> queryByPage(QueryByPageQuery param) throws DataAccessException {
		return PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"wms.Manufacturer.queryByPage",param);
	}

}

