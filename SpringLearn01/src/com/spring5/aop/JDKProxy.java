package com.spring5.aop;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int a = dao.add(1, 2);
        System.out.println(a);
    }
}



class UserDaoProxy implements InvocationHandler {

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "---之前执行---参数：" + Arrays.toString(args));
        Object invoke = method.invoke(obj, args);
        System.out.println(method.getName() + "之后");

        return invoke;
    }
}
