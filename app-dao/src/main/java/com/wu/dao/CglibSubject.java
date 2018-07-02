package com.wu.dao;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wu on 2018/7/1.
 */
public class CglibSubject implements MethodInterceptor{
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin in cglib");
        Object result;
        try {
            result=methodProxy.invoke(o,objects);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }finally {
            System.out.println("end in cglib");
        }
        return result;
    }
}
