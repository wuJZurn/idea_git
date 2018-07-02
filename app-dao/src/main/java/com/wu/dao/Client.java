package com.wu.dao;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * Created by wu on 2018/7/1.
 */
public class Client {


    public static void main(String[] args) {
        /*Subject subject=new ProxySubject(new RealSubject());
       subject.request();*/

       /* Subject subject= (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JDKProxySubject(new RealSubject()));
        subject.request();*/

        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibSubject());
        Subject s= (Subject) enhancer.create();
        s.request();
    }
}
