/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.operation.shiprecord.*;
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

import com.zeh.wms.dal.dataobject.ShipRecordDO;
import com.zeh.wms.dal.daointerface.ShipRecordDAO;

/**
 * ShipRecordDAO
 * database table: ship_record
 * database table comments: ShipRecord
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisShipRecordDAO extends SqlMapClientDaoSupport implements ShipRecordDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         ship_record         (           id ,agent_id ,commodity_id ,qrcode_no ,gmt_create ,gmt_modified ,create_by ,modify_by           )      VALUES         (?,?,?,?,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,?,?)</pre>
	 */
	public long insert(ShipRecordDO shipRecord) throws DataAccessException {
		if(shipRecord == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.ShipRecord.insert", shipRecord);
		return shipRecord.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         ship_record      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.ShipRecord.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         ship_record      WHERE         qrcode_no = ?</pre>
	 */
	public int deleteByQRCode(String qrcodeNo) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.ShipRecord.deleteByQRCode", qrcodeNo);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, agent_id, commodity_id, qrcode_no, gmt_create, gmt_modified, create_by, modify_by                  FROM         ship_record                WHERE         id = ?</pre>
	 */
	public ShipRecordDO queryById(Long id) throws DataAccessException {
		return (ShipRecordDO)getSqlMapClientTemplate().queryForObject("wms.ShipRecord.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, agent_id, commodity_id, qrcode_no, gmt_create, gmt_modified, create_by, modify_by            FROM         ship_record         WHERE         qrcode_no = ?</pre>
	 */
	public ShipRecordDO queryByQRCode(String qrcodeNo) throws DataAccessException {
		return (ShipRecordDO)getSqlMapClientTemplate().queryForObject("wms.ShipRecord.queryByQRCode",qrcodeNo);
	}

}

