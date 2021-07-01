package com.xiao;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
public class MyFactoryBeanImpl implements FactoryBean<Air> {
    /**
     * 工厂方法，Spring会自动调用这个方法来创建对象并返回
     * @return
     */
    @Override
    public Air getObject() {
        Air air = new Air();
        air.setName("zhangsan");
        return air;
    }

    /**
     * 返回对象的类型,Spring会自动调用这个方法来确认创建的对象是什么类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 是否为单例模式
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
