package com.xiao.proxy;

/**
 * @author KongXiao
 * @date 2021/7/19
 */
public class ProxyTest {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //传入要代理的接口
        proxyInvocationHandler.setRent(host);

        //获得代理对象
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        //代理对象使用真实对象的方法，方法被增强了
        proxy.rent();
    }
}
