package com.wyb.rms.nacos.client.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
}
