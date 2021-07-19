package com.xiao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现InvocationHandler接口，来创建动态代理对象
 *
 * @author KongXiao
 * @date 2021/7/19
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    /**
     * 设置要代理的接口
     *
     * @param rent
     */
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 生成代理类的方法
     *
     * @return 代理类
     */
    public Object getProxy() {
        // Proxy.newProxyInstance()传入三个参数：类加载器，类实现的接口，InvocationHandler对象
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }


    /**
     * 执行被代理对象的任何接口方法都会经过该方法
     *
     * @param proxy  代理对象的引用
     * @param method 当前执行的方法
     * @param args   当前执行方法所需的参数
     * @return 和被代理对象方法有相同的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 先看房
        seeHouse();
        // 使用反射机制invoke方法，传入被代理的接口和参数。使用真实对象的方法
        Object result = method.invoke(rent, args);
        // 收中介费
        fare();
        return result;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fare() {
        System.out.println("中介收费");
    }
}
