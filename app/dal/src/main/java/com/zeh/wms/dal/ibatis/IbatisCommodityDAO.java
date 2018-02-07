/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.operation.commodity.*;
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

import com.zeh.wms.dal.dataobject.CommodityDO;
import com.zeh.wms.dal.daointerface.CommodityDAO;

/**
 * CommodityDAO
 * database table: commodity
 * database table comments: Commodity
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisCommodityDAO extends SqlMapClientDaoSupport implements CommodityDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         commodity         (           id ,manufacturer_id ,code ,name ,price ,unit ,weight ,description ,gmt_create ,gmt_modified ,create_by ,modify_by           )      VALUES         (?,?,?,?,?,?,?,?,?,?,?,?)</pre>
	 */
	public long insert(CommodityDO commodity) throws DataAccessException {
		if(commodity == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.Commodity.insert", commodity);
		return commodity.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         commodity      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.Commodity.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         commodity      SET         manufacturer_id = ? ,code = ? ,name = ? ,price = ? ,unit = ? ,weight = ? ,description = ? ,gmt_create = ? ,gmt_modified = ? ,create_by = ? ,modify_by = ?                WHERE         id = ?</pre>
	 */
	public int update(CommodityDO commodity) throws DataAccessException {
		if(commodity == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.Commodity.update", commodity);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, manufacturer_id, code, name, price, unit, weight, description, gmt_create, gmt_modified, create_by, modify_by                  FROM         commodity                WHERE         id = ?</pre>
	 */
	public CommodityDO queryById(Long id) throws DataAccessException {
		return (CommodityDO)getSqlMapClientTemplate().queryForObject("wms.Commodity.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, manufacturer_id, code, name, price, unit, weight, description, gmt_create, gmt_modified, create_by, modify_by            FROM         commodity</pre>
	 */
	public PageList<CommodityDO> findPage(int pageSize,int pageNum) throws DataAccessException {
		return PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"wms.Commodity.findPage",null,pageNum,pageSize);
	}

}
