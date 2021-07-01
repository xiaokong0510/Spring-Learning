package com.xiao.helloworld.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Data
@AllArgsConstructor
public class Person {
    private String lastName;
    private Integer age;
    private String gender;
    private  String email;

    public Person() {
        System.out.println("Person创建了");
    }
}
