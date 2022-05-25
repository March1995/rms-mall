package com.wyb.rms.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author Marcher丶
 *
 * @RefreshScope只能加在获取的地方，加在controller无法刷新
 */
@Data
@Component
@RefreshScope
public class CommonConfig {

    @Value("${isNewBusi}")
    private Boolean isNewBusi;


}
