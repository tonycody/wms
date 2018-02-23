/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.operation.role.*;
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

import com.zeh.wms.dal.dataobject.RoleDO;
import com.zeh.wms.dal.daointerface.RoleDAO;

/**
 * RoleDAO
 * database table: role
 * database table comments: Role
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisRoleDAO extends SqlMapClientDaoSupport implements RoleDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         role         (             id ,name ,enabled ,gmt_create ,gmt_modify ,create_by ,modify_by             )      VALUES         (?,?,?,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,?,?)</pre>
	 */
	public long insert(RoleDO role) throws DataAccessException {
		if(role == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.Role.insert", role);
		return role.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         role      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.Role.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         role      SET         name = ? , enabled = ? ,gmt_modify = CURRENT_TIMESTAMP ,modify_by = ?                  WHERE         id = ?</pre>
	 */
	public int update(RoleDO role) throws DataAccessException {
		if(role == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.Role.update", role);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, name, enabled, gmt_create, gmt_modify, create_by, modify_by                       FROM         role                  WHERE         id = ?</pre>
	 */
	public RoleDO queryById(Long id) throws DataAccessException {
		return (RoleDO)getSqlMapClientTemplate().queryForObject("wms.Role.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, name, enabled, gmt_create, gmt_modify, create_by, modify_by                       FROM         role                  WHERE         name = ?          AND enabled = 1</pre>
	 */
	public RoleDO queryByName(String name) throws DataAccessException {
		return (RoleDO)getSqlMapClientTemplate().queryForObject("wms.Role.queryByName",name);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, name, enabled, gmt_create, gmt_modify, create_by, modify_by                       FROM         role                  WHERE         1=1                                        AND                      name = ?                                            AND                      enabled = ?                                                ORDER BY         gmt_modify DESC</pre>
	 */
	public PageList<RoleDO> queryByPage(QueryByPageQuery param) throws DataAccessException {
		return PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"wms.Role.queryByPage",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, name, enabled, gmt_create, gmt_modify, create_by, modify_by                       FROM         role                  WHERE         enabled = 1;</pre>
	 */
	public List<RoleDO> queryAllEnabled() throws DataAccessException {
		return (List<RoleDO>)getSqlMapClientTemplate().queryForList("wms.Role.queryAllEnabled",null);
	}

}

