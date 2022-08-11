package com.spring5.jdbctemplate.service;


import com.spring5.jdbctemplate.dao.BookDao;
import com.spring5.jdbctemplate.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void modifyBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(String id) {
        bookDao.delete(id);
    }

    public int getCount(){
        return bookDao.selectCount();
    }

    public Book findABook(String id) {
        return bookDao.findBookInfo(id);
    }

    public List<Book> getAllBook() {
        return bookDao.findAllBook();
    }

    public void BatchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBooks(batchArgs);
    }

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        增加
//        Book book = new Book("1", "java", "a");
//        bookService.addBook(book);

//        修改
//        Book book = new Book("1", "python", "b");
//        bookService.modifyBook(book);

//            删除
//        bookService.deleteBook("1");

//      所有记录条数
//        System.out.println(bookService.getCount());

//        查询某个对象
//        Book aBook = bookService.findABook("2");
//        System.out.println(aBook);

//        查询多个对象
//        List<Book> allBook = bookService.getAllBook();
//        System.out.println(allBook);

//        添加多个对象
        List<Object[]> objects = new ArrayList<>();
        Object[] o1 = {"5", "rust", "i"};
        Object[] o2 = {"6", "mysql", "k"};
        objects.add(o1);
        objects.add(o2);
        bookService.BatchAdd(objects);

    }


}
