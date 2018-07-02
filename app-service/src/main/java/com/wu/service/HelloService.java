package com.wu.service;

import com.wu.dao.HelloDao;

/**
 * Created by wu on 2018/6/30.
 */
public class HelloService {
    public String sayHelloService(String name){

        HelloDao helloDao=new HelloDao();
        return helloDao.sayHello(name);
    }

    public void hello(){
        System.out.println("aaa");
    }
    public void test(){
        System.out.println("test server");
    }
}
