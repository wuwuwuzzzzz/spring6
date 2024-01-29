package com.wxz.spring6.tx.controller;

import com.wxz.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author wxz
 * @date 09:37 2024/1/29
 */
@Controller
public class BookController
{
    @Autowired
    private BookService bookService;

    /**
     * @param bookId bookId
     * @param userId userId
     * @author wxz
     * @date 09:41 2024/1/29
     */
    public void buyBook(Integer bookId, Integer userId)
    {
        bookService.buyBook(bookId, userId);
    }
}
