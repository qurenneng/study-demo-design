package org.study.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.study.demo.design.card.IQiYiCardService;
import org.study.demo.design.store.ICommodity;

import java.util.Map;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 15:46
 * 爱奇艺会员卡
 */
public class CardCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);
    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String bindMobileNumber = queryUserMobile(uId);
        iQiYiCardService.grantToken(bindMobileNumber,bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }
    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
