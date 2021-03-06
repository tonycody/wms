/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.daointerface.RoleAuthorizationLinkDAO;
import com.zeh.wms.dal.dataobject.RoleAuthorizationLinkDO;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * RoleAuthorizationLinkDAO
 * database table: role_authorization_link
 * database table comments: RoleAuthorizationLink
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisRoleAuthorizationLinkDAO extends SqlMapClientDaoSupport implements RoleAuthorizationLinkDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         role_authorization_link         (             id ,role_id ,auth_id             )      VALUES         (?,?,?)</pre>
	 */
	public long insert(RoleAuthorizationLinkDO roleAuthorizationLink) throws DataAccessException {
		if(roleAuthorizationLink == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.RoleAuthorizationLink.insert", roleAuthorizationLink);
		return roleAuthorizationLink.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         role_authorization_link      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.RoleAuthorizationLink.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         role_authorization_link      WHERE         role_id = ?</pre>
	 */
	public int deleteByRoleId(Long roleId) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.RoleAuthorizationLink.deleteByRoleId", roleId);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         role_authorization_link      SET         role_id = ? ,auth_id = ?                  WHERE         id = ?</pre>
	 */
	public int update(RoleAuthorizationLinkDO roleAuthorizationLink) throws DataAccessException {
		if(roleAuthorizationLink == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.RoleAuthorizationLink.update", roleAuthorizationLink);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, role_id, auth_id                       FROM         role_authorization_link                  WHERE         id = ?</pre>
	 */
	public RoleAuthorizationLinkDO queryById(Long id) throws DataAccessException {
		return (RoleAuthorizationLinkDO)getSqlMapClientTemplate().queryForObject("wms.RoleAuthorizationLink.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         auth_id                  FROM         role_authorization_link                  WHERE         role_id = ?</pre>
	 */
	public List<Long> queryByRoleId(Long roleId) throws DataAccessException {
		return (List<Long>)getSqlMapClientTemplate().queryForList("wms.RoleAuthorizationLink.queryByRoleId",roleId);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         role_id                  FROM         role_authorization_link                  WHERE         auth_id = ?</pre>
	 */
	public List<Long> queryByAuthId(Long authId) throws DataAccessException {
		return (List<Long>)getSqlMapClientTemplate().queryForList("wms.RoleAuthorizationLink.queryByAuthId",authId);
	}

}

