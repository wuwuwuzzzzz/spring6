package com.wxz.annoaop;

import org.springframework.stereotype.Component;

/**
 * @author wxz
 * @date 11:48 2024/1/14
 */
@Component
public class CalculatorImpl implements Calculator
{
    /**
     * add 加
     *
     * @param i
     * @param j
     * @return int
     * @author wxz
     * @date 11:43 2024/1/14
     */
    @Override
    public int add(int i, int j)
    {
        return i + j;
    }

    /**
     * sub 减
     *
     * @param i
     * @param j
     * @return int
     * @author wxz
     * @date 11:43 2024/1/14
     */
    @Override
    public int sub(int i, int j)
    {
        return i - j;
    }

    /**
     * mul 乘
     *
     * @param i
     * @param j
     * @return int
     * @author wxz
     * @date 11:43 2024/1/14
     */
    @Override
    public int mul(int i, int j)
    {
        return i * j;
    }

    /**
     * div 除
     *
     * @param i
     * @param j
     * @return int
     * @author wxz
     * @date 11:43 2024/1/14
     */
    @Override
    public int div(int i, int j)
    {
        return i / j;
    }
}
