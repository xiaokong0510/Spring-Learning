package com.xiao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
public class MyBeanPostProcessor  implements BeanPostProcessor {
    /**
     * 前置处理器，在初始化方法之前调用
     * @param bean 传递过来的，将要初始化的bean
     * @param beanName
     * @return 经该方法处理之后可以返回一个新的bean
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【"+beanName+"】将要调用初始化方法了..BeforeInitialization..这个bean是这样的：+【"+bean+"】");
        return bean;
    }

    /**
     * 后置处理器，在初始化方法之后调用
     * @param bean
     * @param beanName
     * @return 经该方法处理后返回给IOC容器保存的bean
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【"+beanName+"】初始化方法调用完了..AfterInitialization..这个bean是这样的：+【"+bean+"】");
        return bean;
    }
}
