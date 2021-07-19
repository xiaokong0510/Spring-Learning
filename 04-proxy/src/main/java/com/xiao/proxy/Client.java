package com.xiao.proxy;

/**
 * 客户Client，找中介租房
 * @author KongXiao
 * @date 2021/7/19
 */
public class Client {
    public static void main(String[] args) {
        // 房东
        Host host = new Host();
        // 中介来代理房东
        MyProxy proxy = new MyProxy(host);
        // 客户找中介，中介出租房屋
        proxy.rent();
    }
}
