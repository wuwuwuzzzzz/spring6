package com.wxz.example;

/**
 * @author wxz
 * @date 11:48 2024/1/14
 */
public class CalculatorLogImpl implements Calculator
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
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        int result = i + j;

        System.out.println("[日志] add 方法结束了，结果是：" + result);

        return result;
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
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);

        int result = i - j;

        System.out.println("[日志] sub 方法结束了，结果是：" + result);

        return result;
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
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);

        int result = i * j;

        System.out.println("[日志] mul 方法结束了，结果是：" + result);

        return result;
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
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);

        int result = i / j;

        System.out.println("[日志] div 方法结束了，结果是：" + result);

        return result;
    }
}
