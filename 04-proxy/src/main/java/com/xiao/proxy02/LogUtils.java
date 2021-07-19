package com.xiao.proxy02;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 日志工具类
 *
 * @author KongXiao
 * @date 2021/7/19
 */
public class LogUtils {

    // 执行前
    public static void before(Method method, Object... args) {
        System.out.println("【" + method.getName() + "】方法开始执行了，用的参数列表是【" + Arrays.asList(args) + "】");
    }

    // 执行后
    public static void after(Method method, Object result) {
        System.out.println("【" + method.getName() + "】方法执行完成了，计算结果是【" + result + "】");
    }

    // 出现异常
    public static void exception(Method method, Exception e) {
        System.out.println("【" + method.getName() + "】方法出现异常了,异常信息是：" + e.getCause());
    }

    // 方法结束
    public static void end(Method method) {
        System.out.println("【" + method.getName() + "】方法最终结束了");
    }
}
