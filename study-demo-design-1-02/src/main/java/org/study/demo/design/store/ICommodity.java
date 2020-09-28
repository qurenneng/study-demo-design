package org.study.demo.design.store;

import java.util.Map;

/**
 * @author qrn
 * @version 1.0
 * @date 2020/9/28 15:42
 * 接口:
 */
public interface ICommodity {

    /**
     * 定义接口，用于实现所有服务的业务,最后根据不用的类型调用不同的实现类，来实现不用的业务:
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
