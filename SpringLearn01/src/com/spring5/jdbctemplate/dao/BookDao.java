package com.spring5.jdbctemplate.dao;

import com.spring5.jdbctemplate.entity.Book;

import java.util.List;

public interface BookDao {

    void add(Book book);

    void updateBook(Book book);

    void delete(String id);


    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBooks(List<Object[]> batchArgs);
}
