package org.study.demo.design.coupon;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 11:39
 */
public class CouponResult {

    private String code; // 编码
    private String info; // 描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
