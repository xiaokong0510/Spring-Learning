package com.xiao.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author KongXiao
 * @date 2021/10/26
 */
public class MulService {
    @Autowired
    private BookService bookService;

    @Transactional(rollbackFor = Exception.class)
    public void mulTx() {
        //结账
        this.bookService.checkOut("Tom", "ISBN-001");
        //修改价格
        this.bookService.updatePrice("ISBN-002", 998);

    }
}
