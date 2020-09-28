package org.study.demo.design.card;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 11:32
 * 模拟爱奇艺会员卡服务：
 */
public class IQiYiCardService {

    /**
     *  发送爱奇艺会员:
     * @param bindMobileNumber
     * @param cardId
     */
    public void  grantToken(String bindMobileNumber,String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
