/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */package com.zeh.wms.dal.daointerface;
import org.springframework.dao.DataAccessException;
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
public interface ManufacturerDAO {


	/**
	 * 
	 * sql:
	 * <pre>INSERT      INTO         manufacturer         (             id ,code ,name ,settle_type ,express ,gmt_create ,gmt_modified ,create_by ,modify_by             )      VALUES         (?,?,?,?,?,?,?,?,?)</pre> 
	 */
	public long insert(ManufacturerDO manufacturer) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>DELETE      FROM         manufacturer      WHERE         id = ?</pre> 
	 */
	public int delete(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>UPDATE         manufacturer      SET         code = ? ,name = ? ,settle_type = ? ,express = ? ,gmt_create = ? ,gmt_modified = ? ,create_by = ? ,modify_by = ?                  WHERE         id = ?</pre> 
	 */
	public int update(ManufacturerDO manufacturer) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, code, name, settle_type, express, gmt_create, gmt_modified, create_by, modify_by                       FROM         manufacturer                  WHERE         id = ?</pre> 
	 */
	public ManufacturerDO queryById(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, code, name, settle_type, express, gmt_create, gmt_modified, create_by, modify_by                       FROM         manufacturer                  WHERE         code = ?</pre> 
	 */
	public ManufacturerDO queryByCode(String code) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, code, name, settle_type, express, gmt_create, gmt_modified, create_by, modify_by                       FROM         manufacturer                  WHERE         1=1                                        AND                      code = ?                                            AND                      name = ?                                            AND                      settle_type = ?                                            AND                      express = ?                                                ORDER BY         gmt_modified DESC</pre> 
	 */
	public PageList<ManufacturerDO> queryByPage(QueryByPageQuery param) throws DataAccessException;

}



