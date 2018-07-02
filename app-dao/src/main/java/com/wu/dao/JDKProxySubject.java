package com.wu.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wu on 2018/7/1.
 */
public class JDKProxySubject implements InvocationHandler{
    private RealSubject realSubject;

    public JDKProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("---begin---");
        Object result=null;
        try {
            result=method.invoke(realSubject,args);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("---end---");
        }
        return result;

    }
}
