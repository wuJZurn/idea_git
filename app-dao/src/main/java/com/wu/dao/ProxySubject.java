package com.wu.dao;

/**
 * Created by wu on 2018/7/1.
 */
public class ProxySubject implements Subject{

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        System.out.println("before");
        try{
            realSubject.request();
        }catch (Exception e){
            System.out.println("e:"+e.getMessage());
        }finally {
            System.out.println("after");
        }
    }
}
