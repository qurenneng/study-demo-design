package org.study.demo.design.coupon;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 14:32
 * 模拟优惠券服务
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid){
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
