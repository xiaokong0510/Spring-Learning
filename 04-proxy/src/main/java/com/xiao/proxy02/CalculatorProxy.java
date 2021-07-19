package com.xiao.proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author KongXiao
 * @date 2021/7/19
 */
public class CalculatorProxy {
    public static Calculator getProxy(Calculator calculator) {

        Object proxyInstance = Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;
                        try {
                            // 目标方法执行前
                            LogUtils.before(method, args);
                            System.out.println("动态代理要帮你执行方法！");
                            //利用反射执行目标方法
                            result = method.invoke(calculator, args);
                            // 目标方法执行后
                            LogUtils.after(method, result);
                        } catch (IllegalAccessException e) {
                            //目标方法出现异常
                            LogUtils.exception(method, e);
                        } finally {
                            //目标方法结束后
                            LogUtils.end(method);
                        }
                        // 返回值必须返回出去，外界才能拿到真正执行后的返回值
                        return result;
                    }
                });
        // 返回代理对象
        return (Calculator) proxyInstance;
    }
}
