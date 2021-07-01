package com.xiao.dao;

import org.springframework.stereotype.Repository;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Repository
public class BookDao {
    //声明一个方法
    public void readBook() {
        System.out.println("读了一本书！");
    }
}