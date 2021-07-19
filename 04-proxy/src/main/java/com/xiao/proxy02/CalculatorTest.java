package com.xiao.proxy02;

import org.junit.Test;

/**
 * @author KongXiao
 * @date 2021/7/19
 */
public class CalculatorTest {

    @Test
    public void test(){
        Calculator calculator = new MyCalculator();
        Calculator proxy = CalculatorProxy.getProxy(calculator);
        proxy.add(1,2);
        proxy.divide(2,0);
    }
}
