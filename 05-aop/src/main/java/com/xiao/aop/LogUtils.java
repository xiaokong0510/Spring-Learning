package com.xiao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * 日志工具类
 *
 * @author KongXiao
 * @date 2021/7/19
 */
@Aspect
@Component
public class LogUtils {

//    // 执行前
//    @Before("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
//    public static void before() {
//        System.out.println("方法开始执行了");
//    }
//
//    // 执行后
//    @After("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
//    public static void after() {
//        System.out.println("方法执行完成了");
//    }
//
//    // 出现异常
//    @AfterThrowing("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
//    public static void exception() {
//        System.out.println("方法出现异常了");
//    }
//
//    // 方法结束
//    @After("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
//    public static void end() {
//        System.out.println("方法最终结束了");
//    }

    //执行前
    @Before("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
    public static void before(JoinPoint joinPoint) {
        System.out.println("【"+ joinPoint.getSignature().getName()+"】方法开始执行了，用的参数列表是【"+ Arrays.asList(joinPoint.getArgs())+"】");

    }
    //执行后
    @AfterReturning(value = "execution(public int com.xiao.aop.MyCalculator.*(int,int))",returning = "result")
    public static void after(JoinPoint joinPoint,Object result) {
        System.out.println("【"+ joinPoint.getSignature().getName()+"】方法执行完成了，执行结果是【"+ result +"】");
    }
    //出现异常
    @AfterThrowing(value = "execution(public int com.xiao.aop.MyCalculator.*(int,int))",throwing = "exception")
    public static void exception(JoinPoint joinPoint,Exception exception) {
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法出现异常了,异常信息是："+exception);
    }
    //方法结束
    @After("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
    public  static void end(JoinPoint joinPoint) {
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法最终结束了");
    }

    @Pointcut("execution(public int com.xiao.aop.MyCalculator.*(int,int))")
    public static void myPoint(){

    }

    @Around("myPoint()")
    public Object myAround(ProceedingJoinPoint point) throws Throwable {
        // 获取参数
        Object[] args = point.getArgs();
        // 获取方法名
        String name = point.getSignature().getName();
        Object proceed = null;

        try {
            // @Before
            System.out.println("【环绕前置通知】..【" + name + "】方法开始，用的参数列表是" + Arrays.asList(args));
            // 就是利用反射调用目标方法，类似于method.invoke(obj,args)
            proceed = point.proceed(args);
            // @AfterReturning
            System.out.println("【环绕返回通知】..【" + name + "】方法返回，返回值是" + proceed);
        } catch (Exception e) {
            // @AfterThrowing
            System.out.println("【环绕异常通知】..【" + name + "】方法出现异常，异常信息是" + e);
            // 为了让外界知道这个异常，将其抛出
            throw new RuntimeException(e);
        } finally {
            // @After
            System.out.println("【环绕后置通知】..【" + name + "】方法结束");
        }
        // 反射调用后的返回值也一定返回出去
        return proceed;
    }

}
