package com.wyb.rms.auth.center.dao;

import com.wyb.rms.auth.center.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>EcommerceUser Dao 接口定义</h1>
 */
public interface UserDao extends JpaRepository<UserDO, Long> {

    /**
     * <h2>根据用户名查询 EcommerceUser 对象</h2>
     * select * from t_ecommerce_user where username = ?
     */
    UserDO findByUsername(String username);

    /**
     * <h2>根据用户名和密码查询实体对象</h2>
     * select * from t_ecommerce_user where username = ? and password = ?
     */
    UserDO findByUsernameAndPassword(String username, String password);
}
