package com.xiao.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KongXiao
 * @date 2021/7/19
 */
public class AopTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    @Test
    public void test() {
        //注意这里是根据接口类型获取的
        Calculator bean = ioc.getBean(Calculator.class);
        System.out.println(bean);
        System.out.println(bean.getClass());
        bean.add(1,2);
    }
}
