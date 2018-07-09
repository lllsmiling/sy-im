package com.sy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * @author lllsmiling
 * @create 2017-12-14 11:25
 **/
@Aspect
@Order(-1)
public class ViewInstance {

    @Pointcut("execution(* com.sy.view..*.*(..))")
    public void instance() {
    }

    @Around("instance()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        return joinPoint.proceed();
    }

}
