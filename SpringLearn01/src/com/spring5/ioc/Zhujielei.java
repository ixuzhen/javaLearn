package com.spring5.ioc;


import org.springframework.stereotype.Component;

@Component(value = "zhujielei")
public class Zhujielei {
    public void add(){
        System.out.println("add");
    }
}
