package com.wyb.rms.nacos.client.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @author Marcher丶
 * @date 2022-08-08 22:58
 **/
@Slf4j
@Service
public class NacosClientService {
    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 获取服务实例列表
     *
     * @param serviceId
     * @return
     */
    public List<ServiceInstance> getServiceInstances(String serviceId) {
        log.info("coming in get service instances: [{}]", serviceId);
        return discoveryClient.getInstances(serviceId);
    }


    /**
     * <h2>打印 Nacos Client 信息到日志中</h2>
     * */
    public List<ServiceInstance> getNacosClientInfo(String serviceId) {

        // 测试 UseHystrixCommandAnnotation 的超时
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ex) {
//            //
//        }

        // 测试 NacosClientHystrixCommand 熔断
//        throw new RuntimeException("has some error");

        log.info("request nacos client to get service instance info: [{}]", serviceId);
        return discoveryClient.getInstances(serviceId);
    }

    /**
     * <h2>提供给编程方式的 Hystrix 请求合并</h2>
     * */
    public List<List<ServiceInstance>> getNacosClientInfos(List<String> serviceIds) {

        log.info("request nacos client to get service instance infos: [{}]",
                JSON.toJSONString(serviceIds));
        List<List<ServiceInstance>> result = new ArrayList<>(serviceIds.size());

        serviceIds.forEach(s -> result.add(discoveryClient.getInstances(s)));
        return result;
    }

}
