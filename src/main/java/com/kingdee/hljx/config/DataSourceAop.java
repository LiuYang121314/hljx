package com.kingdee.hljx.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect//描述一个切面类，定义切面类的时候需要打上这个注解
//@Component
@Slf4j
public class DataSourceAop {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.kingdee.hljx.control.*.*(..))")
    public void pointcut() {
        logger.info("aop线程：{}", Thread.currentThread().getId());

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        logger.info("AOP： 方法执行前");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        log.info("这是后置通知");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint joinPoint) {
        log.info("这是后置返回 ");
        log.info(Arrays.toString(joinPoint.getArgs()));
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing(JoinPoint joinPoint) {
        log.info("后置异常");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint poin) throws Throwable {
        log.info("环绕通知");
        poin.proceed();
    }
}
