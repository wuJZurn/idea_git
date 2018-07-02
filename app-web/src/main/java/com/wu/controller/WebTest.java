package com.wu.controller;


import com.wu.service.HelloService;

/**
 * Created by wu on 2018/6/30.
 */
public class WebTest {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        System.out.println(helloService.sayHelloService("wu"));
    }

}
