package com.zeh.wms.biz.model;

import com.zeh.wms.biz.model.enums.StateEnum;

import lombok.Getter;
import lombok.Setter;

/**
 * 辅材价格模型
 *
 * @author allen
 * @create $ ID: AuxiliaryMaterialVO, 18/2/6 15:10 allen Exp $
 * @since 1.0.0
 */
@Getter
@Setter
public class AuxiliaryMaterialVO extends BaseVO {
    /**  */
    private static final long serialVersionUID = 1L;
    /** 辅料、辅材、包装名称 */
    private String            name;
    /** 辅料，辅材，包装费用，单位：分*/
    private Integer           price;
    /** 多少商品需要增加辅材费用 */
    private Integer           quantity;
    /** * 商品ID */
    private Long              commodityId;
    /** 启用状态 */
    private StateEnum         enabled;
}