package com.xiao;

import lombok.Data;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Data
public class Air {
    private String name;
    private Double weight;
    private Double length;
    private Integer personNum;

    public void destroy(){
        System.out.println("销毁方法被调用了！");
    }

    public void init(){
        System.out.println("初始方法被调用了");
    }
}
