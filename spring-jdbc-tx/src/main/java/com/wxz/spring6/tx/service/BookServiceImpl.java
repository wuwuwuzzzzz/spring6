package com.wxz.spring6.tx.service;

import com.wxz.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wxz
 * @date 09:38 2024/1/29
 */
@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookDao bookDao;

    /**
     * @param bookId bookId
     * @param userId userId
     * @author wxz
     * @date 09:42 2024/1/29
     */
    @Override
    public void buyBook(Integer bookId, Integer userId)
    {
        // 根据图书 ID 查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        // 更新图书表库存量 -1
        bookDao.updateStock(bookId);
        // 更新用户余额 - 图书价格
        bookDao.updateUserBalance(userId, price);
    }
}
