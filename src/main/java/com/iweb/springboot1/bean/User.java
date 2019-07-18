package com.iweb.springboot1.bean;

import lombok.Data;

/**
 * @author azzhu
 * @create 2019-07-17 14:05:14
 */
@Data
public class User {
    private Integer id;
    private String name;
    //userName   字段：user_name
    private int score;
    //alt+insert  toString/构造器/getXX/hash。。。。
}
