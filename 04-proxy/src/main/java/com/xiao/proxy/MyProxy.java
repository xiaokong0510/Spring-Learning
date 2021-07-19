package com.xiao.proxy;

/**
 * @author KongXiao
 * @date 2021/7/19
 */
public class MyProxy implements Rent {

    private Host host;

    public MyProxy() {
    }

    public MyProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        // 中介在出租房屋前带客户看房子
        seeHouse();
        this.host.rent();
        // 中介在出租房屋后收中介费
        fare();
    }

    public void seeHouse() {
        System.out.println("带客户看房子");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
