package com.wyb.rms.nacos.client.service.communication.hystrix;

import com.alibaba.fastjson.JSON;
import com.wyb.rms.common.vo.JwtToken;
import com.wyb.rms.common.vo.UsernameAndPassword;
import com.wyb.rms.nacos.client.service.communication.AuthorityFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <h1>AuthorityFeignClient 后备 fallback</h1>
 * */
@Slf4j
@Component
public class AuthorityFeignClientFallback implements AuthorityFeignClient {

    @Override
    public JwtToken getTokenByFeign(UsernameAndPassword usernameAndPassword) {

        log.info("authority feign client get token by feign request error " +
                "(Hystrix Fallback): [{}]", JSON.toJSONString(usernameAndPassword));
        return new JwtToken("qinyi");
    }
}
