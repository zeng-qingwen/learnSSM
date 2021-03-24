package com.SpringAOP.AOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    /**
     *
     * @param returnValue   执行函数后返回的值
     * @param method        要执行的目标对象的方法
     * @param args          参数
     * @param target        目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法执行后的日志："+"执行了"+method.getName()+"方法，返回结果为："+returnValue);
    }

}
