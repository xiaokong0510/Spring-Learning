package com.xiao;

/**
 * @author KongXiao
 * @date 2021/7/1
 */
public class AirStaticFactory {
    /**
     * 提供一个静态方法获取Air对象
     * @param name 名称
     * @return Air对象
     */
    public static Air getAir(String name){
        System.out.println("AirStaticFactory正在造飞机！");
        Air air = new Air();
        air.setName(name);
        air.setLength(100.0);
        air.setWeight(100.0);
        air.setPersonNum(200);
        return air;
    }
}

