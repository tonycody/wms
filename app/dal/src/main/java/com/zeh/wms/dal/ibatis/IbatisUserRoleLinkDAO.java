/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.daointerface.UserRoleLinkDAO;
import com.zeh.wms.dal.dataobject.UserRoleLinkDO;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * UserRoleLinkDAO
 * database table: user_role_link
 * database table comments: UserRoleLink
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisUserRoleLinkDAO extends SqlMapClientDaoSupport implements UserRoleLinkDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         user_role_link         (             id ,user_id ,role_id ,type             )      VALUES         (?,?,?,?)</pre>
	 */
	public long insert(UserRoleLinkDO userRoleLink) throws DataAccessException {
		if(userRoleLink == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.UserRoleLink.insert", userRoleLink);
		return userRoleLink.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         user_role_link      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.UserRoleLink.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         user_role_link      WHERE         user_id = ?</pre>
	 */
	public int deleteByUserId(Long userId) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.UserRoleLink.deleteByUserId", userId);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         user_role_link      SET         user_id = ? ,role_id = ? ,type = ?                  WHERE         id = ?</pre>
	 */
	public int update(UserRoleLinkDO userRoleLink) throws DataAccessException {
		if(userRoleLink == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.UserRoleLink.update", userRoleLink);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, user_id, role_id, type                       FROM         user_role_link                  WHERE         id = ?</pre>
	 */
	public UserRoleLinkDO queryById(Long id) throws DataAccessException {
		return (UserRoleLinkDO)getSqlMapClientTemplate().queryForObject("wms.UserRoleLink.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         user_id                  FROM         user_role_link                  WHERE         role_id = ?</pre>
	 */
	public List<Long> queryByRoleId(Long roleId) throws DataAccessException {
		return (List<Long>)getSqlMapClientTemplate().queryForList("wms.UserRoleLink.queryByRoleId",roleId);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         role_id                  FROM         user_role_link                  WHERE         user_id = ?</pre>
	 */
	public List<Long> queryByUserId(Long userId) throws DataAccessException {
		return (List<Long>)getSqlMapClientTemplate().queryForList("wms.UserRoleLink.queryByUserId",userId);
	}

}

