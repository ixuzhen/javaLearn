package com.spring5.jdbctemplate.dao;


import com.spring5.jdbctemplate.entity.Book;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=?, ustatus=? where userId=?";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(), book.getUserId());
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where userId=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where userId=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void batchAddBooks(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(ints);
    }


}
