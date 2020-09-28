package org.study.demo.design;

import org.study.demo.design.store.ICommodity;
import org.study.demo.design.store.impl.CardCommodityService;
import org.study.demo.design.store.impl.CouponCommodityService;
import org.study.demo.design.store.impl.GoodsCommodityService;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 15:44
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if(null == commodityType) return  null;
        if(commodityType == 1) return  new CardCommodityService();
        if(commodityType == 2) return  new GoodsCommodityService();
        if(commodityType == 3) return  new CouponCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
