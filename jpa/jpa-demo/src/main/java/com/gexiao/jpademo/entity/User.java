package com.gexiao.jpademo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author gexiao
 * @date 2019/1/17 11:40
 */
@Entity
@Data
public class User {
    @Id
    @GenericGenerator(name = "system-uuid",strategy = "uuid")//声明一个策略通用生成器，name为"system-uuid",策略strategy为"uuid"。
    @GeneratedValue(generator = "system-uuid")//用generator属性指定要使用的策略生成器。
    private String id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;

}
