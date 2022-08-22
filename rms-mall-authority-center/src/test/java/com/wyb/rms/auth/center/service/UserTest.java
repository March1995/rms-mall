package com.wyb.rms.auth.center.service;

import cn.hutool.crypto.digest.MD5;
import com.alibaba.fastjson.JSON;
import com.wyb.rms.auth.center.dao.UserDao;
import com.wyb.rms.auth.center.entity.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <h1>EcommerceUser 相关的测试</h1>
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void createUserRecord() {

        UserDO userDO = new UserDO();
        userDO.setUsername("ImoocQinyi@imooc.com");
        userDO.setPassword(MD5.create().digestHex("12345678"));
        userDO.setExtraInfo("{}");
        log.info("save user: [{}]",
                JSON.toJSON(userDao.save(userDO)));
    }
}
