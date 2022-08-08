package com.wyb.rms.nacos.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * RefreshScope只能加在获取的地方，加在controller无法刷新
 *
 * @author Marcher丶
 * @date 2022-08-08 23:01
 **/
@Data
@Component
@RefreshScope
public class CommonConfig implements Serializable {

    private static final long serialVersionUID = -1L;

    @Value("${isNewBusi}")
    private Boolean isNewBusi;


}
