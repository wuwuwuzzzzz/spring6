package com.wxz.spring6.tx.service;

/**
 * @author wxz
 * @date 09:38 2024/1/29
 */
public interface BookService
{
    /**
     * @param bookId bookId
     * @param userId userId
     * @author wxz
     * @date 09:42 2024/1/29
     */
    void buyBook(Integer bookId, Integer userId);
}
