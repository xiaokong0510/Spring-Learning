package com.xiao.controller;

import com.xiao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void one() {
        this.bookService.read();
    }
}
