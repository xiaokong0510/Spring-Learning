package com.xiao.proxy02;

/**
 * @author KongXiao
 * @date 2021/7/19
 */
public class MyCalculator implements Calculator {
    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public int subtract(int i, int j) {
        return i - j;
    }

    @Override
    public int multiply(int i, int j) {
        return i * j;
    }

    @Override
    public int divide(int i, int j) {
        return i / j;
    }
}
