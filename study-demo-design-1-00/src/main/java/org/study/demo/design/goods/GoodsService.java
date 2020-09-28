package org.study.demo.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 14:41
 * 模拟实物商品服务
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
