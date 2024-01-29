package com.wxz.spring6.tx;

import com.wxz.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wxz
 * @date 09:53 2024/1/29
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class BookTest
{
    @Autowired
    private BookController bookController;

    /**
     * @author wxz
     * @date 09:54 2024/1/29
     */
    @Test
    public void test()
    {
        bookController.buyBook(1, 1);
    }
}
