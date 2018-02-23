/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */package com.zeh.wms.dal.daointerface;
import org.springframework.dao.DataAccessException;
import com.zeh.wms.dal.operation.useragentlink.*;
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
 * UserAgentLinkDAO
 * database table: user_agent_link
 * database table comments: UserAgentLink
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public interface UserAgentLinkDAO {


	/**
	 * 
	 * sql:
	 * <pre>INSERT      INTO         user_agent_link         (           id ,user_id ,code ,type ,link_status ,gmt_create ,gmt_modified ,create_by ,modify_by           )      VALUES         (?,?,?,?,?,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,?,?)</pre> 
	 */
	public long insert(UserAgentLinkDO userAgentLink) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>DELETE      FROM         user_agent_link      WHERE         id = ?</pre> 
	 */
	public int delete(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>UPDATE         user_agent_link      SET         type = ? , code = ?, link_status = ? ,gmt_modified = CURRENT_TIMESTAMP , modify_by = ?               WHERE         id = ?</pre> 
	 */
	public int update(UserAgentLinkDO userAgentLink) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, user_id, code, type, link_status, gmt_create, gmt_modified, create_by, modify_by                  FROM         user_agent_link                WHERE         id = ?</pre> 
	 */
	public UserAgentLinkDO queryById(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, user_id, code, type, link_status, gmt_create, gmt_modified, create_by, modify_by            FROM         user_agent_link         WHERE         1=1                   AND       user_id = ?                     AND       code = ?                     AND       type = ?                    AND       link_status = ?</pre> 
	 */
	public UserAgentLinkDO queryByPar(QueryByParQuery param) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, user_id, code, type, link_status, gmt_create, gmt_modified, create_by, modify_by            FROM         user_agent_link         WHERE         user_id = ?          and link_status = ?</pre> 
	 */
	public UserAgentLinkDO queryByUserId(Long userId ,Integer linkStatus) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         id, user_id, code, type, link_status, gmt_create, gmt_modified, create_by, modify_by            FROM         user_agent_link</pre> 
	 */
	public PageList<UserAgentLinkDO> findPage(int pageSize,int pageNum) throws DataAccessException;

}



