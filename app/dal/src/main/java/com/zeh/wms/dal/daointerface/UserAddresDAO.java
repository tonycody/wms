/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */package com.zeh.wms.dal.daointerface;
import org.springframework.dao.DataAccessException;
import com.zeh.wms.dal.operation.useraddres.*;
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
 * UserAddresDAO
 * database table: user_address
 * database table comments: UserAddres
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public interface UserAddresDAO {


	/**
	 * 
	 * sql:
	 * <pre>INSERT      INTO         user_address         (           id ,name ,tel ,zip_code ,province ,city ,region ,detail ,address_type ,user_id ,default_setting ,gmt_create ,gmt_modified ,create_by ,modify_by           )      VALUES         (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)</pre> 
	 */
	public long insert(UserAddresDO userAddres) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>DELETE      FROM         user_address      WHERE         id = ?</pre> 
	 */
	public int delete(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>UPDATE         user_address      SET         name = ? ,tel = ? ,zip_code = ? ,province = ? ,city = ? ,region = ? ,detail = ? ,address_type = ? ,user_id = ? ,default_setting = ? ,gmt_create = ? ,gmt_modified = ? ,create_by = ? ,modify_by = ?                WHERE         id = ?</pre> 
	 */
	public int update(UserAddresDO userAddres) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, name, tel, zip_code, province, city, region, detail, address_type, user_id, default_setting, gmt_create, gmt_modified, create_by, modify_by                  FROM         user_address                WHERE         id = ?</pre> 
	 */
	public UserAddresDO queryById(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, name, tel, zip_code, province, city, region, detail, address_type, user_id, default_setting, gmt_create, gmt_modified, create_by, modify_by            FROM         user_address</pre> 
	 */
	public PageList<UserAddresDO> findPage(int pageSize,int pageNum) throws DataAccessException;

}


