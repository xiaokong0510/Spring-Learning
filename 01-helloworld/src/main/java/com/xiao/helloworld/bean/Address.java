package com.xiao.helloworld.bean;

import lombok.Data;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Data
public class Address {
    private String name;
    private Integer num;

    public Address() {
        System.out.println("Address创建了");
    }
}
