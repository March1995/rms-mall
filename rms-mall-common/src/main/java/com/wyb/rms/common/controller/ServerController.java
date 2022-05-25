package com.wyb.rms.common.controller;

import com.wyb.rms.common.config.CommonConfig;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Marcher丶
 */
@RestController
public class ServerController {

    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private CommonConfig commonConfig;

    @GetMapping("/getServerList")
    public List<ServiceInstance> getServiceInstances() {
        return discoveryClient.getInstances("rms-mall-common");
    }

    @GetMapping("/getConfig")
    public boolean getConfig() {
        return commonConfig.getIsNewBusi();
    }
}
