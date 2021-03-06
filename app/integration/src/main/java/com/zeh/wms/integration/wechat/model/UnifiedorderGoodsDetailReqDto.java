package com.zeh.wms.integration.wechat.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hzy24985
 * @version $Id: UnifiedorderGoodsDetailReqDto, v 0.1 2018/2/7 15:58 hzy24985 Exp $
 */
@Data
public class UnifiedorderGoodsDetailReqDto implements Serializable {

    private static final long serialVersionUID = -6867155085809507941L;

    /**商品编码 必填 32 商品的编号*/
    @JSONField(name = "goods_id")
    private String goodsId;
    /** 可选 32 微信支付定义的统一商品编号 */
    @JSONField(name = "wxpay_goods_id")
    private String wxpayGoodsId;
    /** 可选 256 商品名称 */
    @JSONField(name = "goods_name")
    private String goodsName;
    /** 用户购买的数量 必填 32 商品数量*/
    private int quantity;

    /** 单位为：分。如果商户有优惠，需传输商户优惠后的单价(例如：用户对一笔100元的订单使用了商场发的纸质优惠券100-50，则活动商品的单价应为原单价-50) */
    private int price;
    /**类目*/
    @JSONField(name = "goods_category")
    private String goodsCategory;
    /** 名称 */
    private String body;

}
