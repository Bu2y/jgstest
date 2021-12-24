package com.user.AopTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//使用注解的方式做增强
@Aspect
@Component
public class aop {
    //设置切入点
    @Pointcut("execution(public void add(com.user.pojo.user))")
    public void qq(){}
    @Before("qq()")
    public void before(JoinPoint point) {
        System.out.println("前置增强");
        System.out.println("调用:"+point.getTarget()+"的"+
                point.getSignature().getName()+
                "方法，方法参数:"+ Arrays.toString(point.getArgs()));
    }
    @AfterReturning(pointcut = "qq()",returning = "a")
    public void after(JoinPoint point,Object a){
        System.out.println("后置增强");
        System.out.println("调用:"+point.getTarget()+"的"+
                point.getSignature().getName()+
                "方法，方法参数:"+ Arrays.toString(point.getArgs())+"返回值:"+a);
    }
    //环绕增强。前置，后置，异常，最终一套全有
    @Around("qq()")
    public Object hrzq(ProceedingJoinPoint point)throws Throwable {
        try {
            System.out.println("前置增强");
            System.out.println("调用:" + point.getTarget() + "的" +
                    point.getSignature().getName() +
                    "方法，方法参数:" + Arrays.toString(point.getArgs()));

            Object r = point.proceed();
            System.out.println("后置增强");
            System.out.println("调用:" + point.getTarget() + "的" +
                    point.getSignature().getName() +
                    "方法，方法参数:" + Arrays.toString(point.getArgs()) + "返回值:" + r);
            return r;
        } catch (Throwable e) {
            System.err.println(point.getSignature().getName()+"方法异常"+e);
            throw  e;
        }finally {
            System.out.println(point.getSignature().getName()+"最终增强");
        }
    }
}
