package com.xiao.service;

import com.xiao.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Service
public class BookService {

    // 使用@Autowired完成成员BookDao的自动装配
    // @Autowired
    private BookDao bookDao;

    @Autowired
    private void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void read() {
        this.bookDao.readBook();
    }
}
