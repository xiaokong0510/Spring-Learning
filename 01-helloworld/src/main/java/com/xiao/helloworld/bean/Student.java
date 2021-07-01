package com.xiao.helloworld.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Data
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map card;
    private Set<String> games;
    private String wife;
    private Properties info;

    public Student() {
        System.out.println("Person创建了");
    }
}
