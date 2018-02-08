/**
 * Jungle.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */ 
package com.zeh.wms.dal.ibatis;

import com.zeh.wms.dal.operation.expressorder.*;
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

import com.zeh.wms.dal.dataobject.ExpressOrderDO;
import com.zeh.wms.dal.daointerface.ExpressOrderDAO;

/**
 * ExpressOrderDAO
 * database table: express_order
 * database table comments: ExpressOrder
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/dalgen</tt>
 * 
 * @author Allen Wang(Wang Junxiang)
 * */
public class IbatisExpressOrderDAO extends SqlMapClientDaoSupport implements ExpressOrderDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         express_order         (           id ,order_no ,other_order_no ,code ,status ,sender_name ,sender_tel ,sender_province ,sender_city ,sender_region ,sender_address_detail ,sender_zip_code ,receiver_name ,receiver_tel ,receiver_province ,receiver_city ,receiver_region ,receiver_address_detail ,receiver_zip_code ,express_type ,total_price ,gmt_create ,gmt_modified ,create_by ,modify_by           )      VALUES         (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)</pre>
	 */
	public long insert(ExpressOrderDO expressOrder) throws DataAccessException {
		if(expressOrder == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("wms.ExpressOrder.insert", expressOrder);
		return expressOrder.getId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>DELETE      FROM         express_order      WHERE         id = ?</pre>
	 */
	public int delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("wms.ExpressOrder.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>UPDATE         express_order      SET         order_no = ? ,other_order_no = ? ,code = ? ,status = ? ,sender_name = ? ,sender_tel = ? ,sender_province = ? ,sender_city = ? ,sender_region = ? ,sender_address_detail = ? ,sender_zip_code = ? ,receiver_name = ? ,receiver_tel = ? ,receiver_province = ? ,receiver_city = ? ,receiver_region = ? ,receiver_address_detail = ? ,receiver_zip_code = ? ,express_type = ? ,total_price = ? ,gmt_create = ? ,gmt_modified = ? ,create_by = ? ,modify_by = ?                WHERE         id = ?</pre>
	 */
	public int update(ExpressOrderDO expressOrder) throws DataAccessException {
		if(expressOrder == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("wms.ExpressOrder.update", expressOrder);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, order_no, other_order_no, code, type, status, sender_name, sender_tel, sender_province, sender_city, sender_region, sender_address_detail, sender_zip_code, receiver_name, receiver_tel, receiver_province, receiver_city, receiver_region, receiver_address_detail, receiver_zip_code, express_type, total_price, gmt_create, gmt_modified, create_by, modify_by                 FROM         express_order                WHERE         id = ?</pre>
	 */
	public ExpressOrderDO queryById(Long id) throws DataAccessException {
		return (ExpressOrderDO)getSqlMapClientTemplate().queryForObject("wms.ExpressOrder.queryById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, order_no, other_order_no, code, type, status, sender_name, sender_tel, sender_province, sender_city, sender_region, sender_address_detail, sender_zip_code, receiver_name, receiver_tel, receiver_province, receiver_city, receiver_region, receiver_address_detail, receiver_zip_code, express_type, total_price, gmt_create, gmt_modified, create_by, modify_by           FROM         express_order         WHERE         1=1                               AND                      order_no = ?                                            AND                      other_order_no = ?                                            AND                      code = ?                                            AND                      type = ?                                            AND                      status = ?                                            AND                      receiver_name like concat('%',?,'%')                                            AND                      receiver_tel = ?                                            AND                      express_type = ?                                            AND                                               gmt_create >= ?                                                                 AND                                               gmt_create <= ?</pre>
	 */
	public PageList<ExpressOrderDO> findPage(FindPageQuery param) throws DataAccessException {
		return PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"wms.ExpressOrder.findPage",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         id, order_no, other_order_no, code, type, status, sender_name, sender_tel, sender_province, sender_city, sender_region, sender_address_detail, sender_zip_code, receiver_name, receiver_tel, receiver_province, receiver_city, receiver_region, receiver_address_detail, receiver_zip_code, express_type, total_price, gmt_create, gmt_modified, create_by, modify_by           FROM         express_order         WHERE         1=1                   AND       order_no = ?                    AND       other_order_no = ?                    AND       code = ?                    AND       type = ?                    AND       status = ?                    AND       receiver_name like concat('%',?,'%')                    AND       receiver_tel = ?                    AND       express_type = ?                    AND                                gmt_create >= ?                                         AND                                gmt_create <= ?</pre>
	 */
	public List<ExpressOrderDO> getAllByPars(GetAllByParsQuery param) throws DataAccessException {
		return (List<ExpressOrderDO>)getSqlMapClientTemplate().queryForList("wms.ExpressOrder.getAllByPars",param);
	}

}

