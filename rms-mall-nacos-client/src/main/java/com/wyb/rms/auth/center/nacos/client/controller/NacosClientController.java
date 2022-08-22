package com.wyb.rms.auth.center.nacos.client.controller;

import com.wyb.rms.auth.center.nacos.client.config.CommonConfig;
import com.wyb.rms.auth.center.nacos.client.service.NacosClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Marcher丶
 * @date 2022-08-08 22:55
 **/
@Slf4j
@RestController
@RequestMapping("/nacos-client")
public class NacosClientController {

    @Autowired
    private NacosClientService nacosClientService;
    @Resource
    private CommonConfig commonConfig;

    @GetMapping("/getServerList")
    public List<ServiceInstance> getServiceInstances(@RequestParam(defaultValue = "rms-mall-nacos-client") String serviceId) {
        return nacosClientService.getServiceInstances(serviceId);
    }

    /**
     * 动态获取配置文件
     */
    @GetMapping("/getConfig")
    public Boolean getConfig() {
        return commonConfig.getIsNewBusi();
    }


}
