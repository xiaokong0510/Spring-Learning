package com.xiao.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author KongXiao
 * @date 2021/7/22
 */
@Repository
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 减去某个用户的账户余额
     * @param userName 用户名
     * @param price 金额
     */
    public void updateBalance(String userName, int price) {
        String sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
        this.jdbcTemplate.update(sql, price, userName);
    }

    /**
     * 按照图书的isbn获取图书的价格
     * @param isbn 编号
     * @return
     */
    public Integer getPrice(String isbn) {
        String sql = "SELECT price FROM book WHERE isbn = ?";
        return this.jdbcTemplate.queryForObject(sql, Integer.class, isbn);
    }

    /**
     * 减去图书的库存,每次减去1
     * @param isbn 编号
     */
    public void updateStock(String isbn) {
        String sql = "UPDATE book_stock SET stock = stock-1 WHERE isbn = ?";
        this.jdbcTemplate.update(sql, isbn);
    }

    /**
     * 修改图书价格
     * @param isbn 编号
     * @param price 要修改的价格
     */
    public void updatePrice(String isbn, Integer price) {
        String sql = "UPDATE book SET price=? where isbn =?";
        this.jdbcTemplate.update(sql, price, isbn);
    }
}
