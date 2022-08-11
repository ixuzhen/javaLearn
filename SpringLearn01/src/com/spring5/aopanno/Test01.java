package com.spring5.aopanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
