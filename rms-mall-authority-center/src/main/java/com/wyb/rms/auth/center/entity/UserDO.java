package com.wyb.rms.auth.center.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Marcher丶
 * @date 2022-08-21 08:50
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_ecommerce_user")
public class UserDO implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username", nullable = false)
    private String username;

    /**
     * MD5 密码
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 额外的信息, json 字符串存储
     */
    @Column(name = "extra_info", nullable = false)
    private String extraInfo;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @LastModifiedDate
    @Column(name = "update_time", nullable = false)
    private Date updateTime;

}
