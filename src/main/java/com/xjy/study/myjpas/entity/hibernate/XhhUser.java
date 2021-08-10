package com.xjy.study.myjpas.entity.hibernate;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "xhh_user")
public class XhhUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PK
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 手机号
     */
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * 创建人id
     */
    @Column(name = "creator_id", nullable = false)
    private String creatorId;

    /**
     * 修改人id
     */
    @Column(name = "updater_id", nullable = false)
    private String updaterId;

    /**
     * 插入时间
     */
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    /**
     * 逻辑删除状态位,1删除0保留
     */
    @Column(name = "is_delete", nullable = false)
    private Boolean delete;

    /**
     * 密码
     */
    @Column(name = "password", nullable = false)
    private String password;

    /**
     * 家庭住址
     */
    @Column(name = "address")
    private String address;

}
