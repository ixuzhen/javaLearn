package com.spring5.test;

import com.spring5.ioc.Book;
import com.spring5.ioc.Orders;
import com.spring5.ioc.User;
import com.spring5.ioc.Zhujielei;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
//    基于xml方式
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);
        user1.add();
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
        Orders order1 = context.getBean("order1", Orders.class);
        System.out.println(order1);
    }
//    基于注解方式
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Zhujielei zhujielei = context.getBean("zhujielei", Zhujielei.class);
        System.out.println(zhujielei);
        zhujielei.add();
    }
}
