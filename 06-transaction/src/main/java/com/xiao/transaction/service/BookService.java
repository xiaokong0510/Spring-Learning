package com.xiao.transaction.service;

import com.xiao.transaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author KongXiao
 * @date 2021/7/22
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * 结账方法，分为减库存，减余额两步操作
     * @param username
     * @param isbn
     */
    @Transactional(rollbackFor = Exception.class)
    public void checkOut(String username,String isbn) {
        // 1.减库存
        this.bookDao.updateStock(isbn);
        System.out.println("减库存完成！");
        // 故意引入异常
        int a = 1/0;
        // 根据isbn查询价格
        Integer price = this.bookDao.getPrice(isbn);
        // 2.减账户余额
        this.bookDao.updateBalance(username,price);
        System.out.println("结账完成!");

    }

    /**
     * 修改价格
     * @param isbn
     * @param price
     */
    @Transactional(rollbackFor = Exception.class)
    public void updatePrice(String isbn,Integer price){
        this.bookDao.updatePrice(isbn, price);
    }
}
