/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */package com.zeh.wms.dal.daointerface;
import com.zeh.wms.dal.dataobject.RoleAuthorizationLinkDO;
import org.springframework.dao.DataAccessException;

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
public interface RoleAuthorizationLinkDAO {


	/**
	 * 
	 * sql:
	 * <pre>INSERT      INTO         role_authorization_link         (             id ,role_id ,auth_id             )      VALUES         (?,?,?)</pre> 
	 */
	public long insert(RoleAuthorizationLinkDO roleAuthorizationLink) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>DELETE      FROM         role_authorization_link      WHERE         id = ?</pre> 
	 */
	public int delete(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>DELETE      FROM         role_authorization_link      WHERE         role_id = ?</pre> 
	 */
	public int deleteByRoleId(Long roleId) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>UPDATE         role_authorization_link      SET         role_id = ? ,auth_id = ?                  WHERE         id = ?</pre> 
	 */
	public int update(RoleAuthorizationLinkDO roleAuthorizationLink) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, role_id, auth_id                       FROM         role_authorization_link                  WHERE         id = ?</pre> 
	 */
	public RoleAuthorizationLinkDO queryById(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         auth_id                  FROM         role_authorization_link                  WHERE         role_id = ?</pre> 
	 */
	public List<Long> queryByRoleId(Long roleId) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         role_id                  FROM         role_authorization_link                  WHERE         auth_id = ?</pre> 
	 */
	public List<Long> queryByAuthId(Long authId) throws DataAccessException;

}



