package com.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* com.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("before------------");
    }
}
