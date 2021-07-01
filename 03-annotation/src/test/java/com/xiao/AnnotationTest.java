package com.xiao;

import com.xiao.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AnnotationTest {
    @Autowired
    private BookController bookController;

    @Test
    public void test01() {
        this.bookController.one();
    }
}
