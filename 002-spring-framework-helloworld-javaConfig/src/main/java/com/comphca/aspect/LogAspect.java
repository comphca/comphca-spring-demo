package com.comphca.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @Created by comphca
 * @Date 2022/5/25 0:31
 * @Description TODO
 */
@Aspect
public class LogAspect {

    @Around("execution(* com.comphca.service.*.*(..))")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {


        System.out.println("-----------------------");
        System.out.println("环绕通知: 进入方法");
        Object o = pjp.proceed();
        System.out.println("环绕通知: 退出方法");
        return o;

    }
}
