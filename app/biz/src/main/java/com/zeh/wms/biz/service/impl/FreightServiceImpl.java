package com.zeh.wms.biz.service.impl;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;

import com.zeh.jungle.dal.paginator.PageList;
import com.zeh.jungle.dal.paginator.PageUtils;
import com.zeh.wms.biz.error.BizErrorFactory;
import com.zeh.wms.biz.exception.ServiceException;
import com.zeh.wms.biz.mapper.FreightMapper;
import com.zeh.wms.biz.model.FreightVO;
import com.zeh.wms.biz.model.enums.StateEnum;
import com.zeh.wms.biz.service.FreightService;
import com.zeh.wms.dal.daointerface.FreightDAO;
import com.zeh.wms.dal.dataobject.FreightDO;
import com.zeh.wms.dal.operation.freight.QueryByPageQuery;
import org.springframework.stereotype.Service;

/**
 * @author allen
 * @create $ ID: FreightServiceImpl, 18/2/9 00:39 allen Exp $
 * @since 1.0.0
 */
@Service
public class FreightServiceImpl implements FreightService {
    /** 错误工厂 */
    private static final BizErrorFactory ERROR_FACTORY = BizErrorFactory.getInstance();
    /** Freight mapper */
    @Resource
    private FreightMapper                mapper;
    /** 运价DAO */
    @Resource
    private FreightDAO                   freightDAO;

    /**
     * 创建运价
     *
     * @param freight 运价
     * @throws ServiceException 创建运价异常
     */
    @Override
    public void createFreight(FreightVO freight) throws ServiceException {
        if (freight == null) {
            throw new ServiceException(ERROR_FACTORY.createFreightError());
        }
        FreightDO existFreight = freightDAO.queryByProvince(freight.getProvinceCode());
        if (existFreight != null) {
            throw new ServiceException(ERROR_FACTORY.freightExistError(existFreight.getProvinceCode(), existFreight.getId()));
        }
        freight.setEnabled(StateEnum.Y);
        FreightDO freightDO = mapper.vo2do(freight);
        freightDAO.insert(freightDO);
    }

    /**
     * 更新运价信息
     *
     * @param freight 运价
     * @throws ServiceException 运价更新异常
     */
    @Override
    public void updateFreight(FreightVO freight) throws ServiceException {
        if (freight == null || freight.getId() <= 0) {
            throw new ServiceException(ERROR_FACTORY.updateFreightError());
        }

        if (StringUtils.isNotBlank(freight.getProvinceCode())) {
            FreightDO existFreight = freightDAO.queryByProvince(freight.getProvinceCode());
            if (existFreight != null) {
                throw new ServiceException(ERROR_FACTORY.freightExistError(existFreight.getProvinceCode(), existFreight.getId()));
            }
        }

        FreightDO freightDO = freightDAO.queryById(freight.getId());
        freightDO.setAdditionalPrice(freight.getAdditionalPrice() != null ? freight.getAdditionalPrice() : freightDO.getAdditionalPrice());
        freightDO.setFirstPrice(freight.getFirstPrice() != null ? freight.getFirstPrice() : freightDO.getFirstPrice());
        freightDO.setFirstWeight(freight.getFirstWeight() != null ? freight.getFirstWeight() : freightDO.getFirstWeight());
        freightDO.setProvinceCode(StringUtils.isNotBlank(freight.getProvinceCode()) ? freight.getProvinceCode() : freightDO.getProvinceCode());
        freightDO.setModifyBy(freight.getModifyBy());
        freightDO.setEnabled(freight.getEnabled() != null ? freight.getEnabled().getCode() : freightDO.getEnabled());
        freightDAO.update(freightDO);
    }

    /**
     * 根据运价ID查询运价信息
     *
     * @param id 运价ID
     * @return 运价信息
     * @throws ServiceException 运价查询异常
     */
    @Override
    public FreightVO findFreightById(long id) throws ServiceException {
        FreightDO freightDO = freightDAO.queryById(id);
        return mapper.do2vo(freightDO);
    }

    /**
     * 分页查询运价信息
     *
     * @param freight     运价查询条件
     * @param currentPage 查询起始页
     * @param size        每页数量
     * @return 运价信息
     * @throws ServiceException 分页查询异常
     */
    @Override
    public PageList<FreightVO> pageQueryFreights(FreightVO freight, int currentPage, int size) throws ServiceException {
        if (freight == null) {
            throw new ServiceException(ERROR_FACTORY.queryFreightError());
        }
        QueryByPageQuery query = new QueryByPageQuery();
        query.setProvinceCode(StringUtils.isNotBlank(freight.getProvinceCode()) ? freight.getProvinceCode() : null);
        query.setEnabled(freight.getEnabled() == null ? null : freight.getEnabled().getCode());
        query.setPage(currentPage);
        query.setPageSize(size);
        PageList<FreightDO> ret = freightDAO.queryByPage(query);
        Collection<FreightVO> freights = mapper.do2vos(ret.getData());
        return PageUtils.createPageList(freights, ret.getPaginator());
    }

    /**
     * 查询所有运价信息
     *
     * @return 所有运价信息
     * @throws ServiceException 运价查询异常
     */
    @Override
    public Collection<FreightVO> findAllFreights() throws ServiceException {
        List<FreightDO> freightDOs = freightDAO.queryAllEnabled();
        return mapper.do2vos(freightDOs);
    }

    /**
     * 查询该省运价信息
     *
     * @param province 省
     * @return 该省运价信息
     * @throws ServiceException 运价查询异常
     */
    @Override
    public FreightVO findByProvince(String province) throws ServiceException {
        if (StringUtils.isBlank(province)) {
            throw new ServiceException(ERROR_FACTORY.queryFreightError());
        }
        FreightDO freightDO = freightDAO.queryByProvince(province);
        return mapper.do2vo(freightDO);
    }

    /**
     * 更新运价启用、禁用状态
     *
     * @param id       运价ID
     * @param modifyBy 修改人
     * @param enabled  状态
     * @throws ServiceException 运价状态更新异常
     */
    @Override
    public void updateFreightState(long id, String modifyBy, StateEnum enabled) throws ServiceException {
        FreightVO freight = new FreightVO();
        freight.setId(id);
        freight.setModifyBy(modifyBy);
        freight.setEnabled(enabled);
        updateFreight(freight);
    }
}