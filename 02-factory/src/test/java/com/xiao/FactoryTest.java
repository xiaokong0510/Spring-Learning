package com.xiao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
public class FactoryTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Air air = (Air) ioc.getBean("air01");
//        System.out.println(air);
//        Air air02 = (Air) ioc.getBean("air02");
//        System.out.println(air02);
//        Object air03 = ioc.getBean("air03");
//        System.out.println(air03);
          Air air04 = (Air) ioc.getBean("air04");
          System.out.println(air04);
    }
}
