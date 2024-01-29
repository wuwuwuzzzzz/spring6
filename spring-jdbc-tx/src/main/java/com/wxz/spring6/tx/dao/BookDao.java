package com.wxz.spring6.tx.dao;

/**
 * @author wxz
 * @date 09:38 2024/1/29
 */
public interface BookDao
{
    /**
     * 根据图书 ID 查询图书价格
     *
     * @param bookId bookId
     * @return java.lang.Integer
     * @author wxz
     * @date 09:45 2024/1/29
     */
    Integer getBookPriceByBookId(Integer bookId);

    /**
     * 更新图书表库存量
     *
     * @param bookId bookId
     * @author wxz
     * @date 09:45 2024/1/29
     */
    void updateStock(Integer bookId);

    /**
     * 更新用户余额
     *
     * @param userId userId
     * @param price  price
     * @author wxz
     * @date 09:45 2024/1/29
     */
    void updateUserBalance(Integer userId, Integer price);
}
