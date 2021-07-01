package com.xiao.helloworld;

import com.xiao.helloworld.bean.Address;
import com.xiao.helloworld.bean.Person;
import com.xiao.helloworld.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
public class IocTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person bean = (Person) ioc.getBean("person01");
        System.out.println(bean);
        Person bean2 = (Person) ioc.getBean("person01");
        System.out.println(bean == bean2);
        Person bean3 = ioc.getBean(Person.class);
        System.out.println(bean == bean3 );
    }

    @Test
    public void test02(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Student student = (Student) ioc.getBean("student01");
//        System.out.println(student);
//        System.out.println(student.getName() == null);

//        Address address01 = ioc.getBean("address01", Address.class);
//        Student student02 = ioc.getBean("student02", Student.class);
//        System.out.println(student02);
//        System.out.println(student02.getAddress() == address01);  //true

        Student student03 = ioc.getBean("student03", Student.class);
        System.out.println(student03);
    }
}
