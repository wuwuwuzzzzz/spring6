package com.wxz.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author wxz
 * @date 09:39 2024/1/29
 */
@Repository
public class BookDaoImpl implements BookDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @param bookId bookId
     * @return java.lang.Integer
     * @author wxz
     * @date 09:47 2024/1/29
     */
    @Override
    public Integer getBookPriceByBookId(Integer bookId)
    {
        String sql = "SELECT price FROM t_book WHERE book_id = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }

    /**
     * @param bookId bookId
     * @author wxz
     * @date 09:47 2024/1/29
     */
    @Override
    public void updateStock(Integer bookId)
    {
        String sql = "UPDATE t_book SET stock = stock - 1 WHERE book_id = ?";
        jdbcTemplate.update(sql, bookId);
    }

    /**
     * @param userId userId
     * @param price  price
     * @author wxz
     * @date 09:47 2024/1/29
     */
    @Override
    public void updateUserBalance(Integer userId, Integer price)
    {
        String sql = "UPDATE t_user SET balance = balance - ? WHERE user_id = ?";
        jdbcTemplate.update(sql, price, userId);
    }
}
