package com.xiao.transaction;

import com.xiao.transaction.dao.BookDao;
import com.xiao.transaction.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KongXiao
 * @date 2021/7/22
 */

public class TransactionTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test() {
        BookService bookService = ioc.getBean(BookService.class);
        System.out.println(bookService.getClass());
        System.out.println(ioc.getBean(BookDao.class).getClass());
        bookService.checkOut("Tom", "ISBN-001");

    }
}
