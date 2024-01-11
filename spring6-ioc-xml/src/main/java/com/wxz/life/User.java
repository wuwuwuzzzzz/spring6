package com.wxz.life;

/**
 * @author wxz
 * @date 20:46 2024/1/11
 */
public class User
{
    /**
     * @author wxz
     * @date 20:47 2024/1/11
     */
    private String name;

    /**
     * 无参构造
     *
     * @author wxz
     * @date 20:47 2024/1/11
     */
    public User()
    {
        System.out.println("1 bean 对象创建，调用无参构造器");
    }

    /**
     * 初始化方法
     *
     * @author wxz
     * @date 20:51 2024/1/11
     */
    public void initMethod()
    {
        System.out.println("4 bean 对象的初始化，会调用指定的初始化方法");
    }

    /**
     * 销毁方法
     *
     * @author wxz
     * @date 20:52 2024/1/11
     */
    public void destroyMethod()
    {
        System.out.println("7 bean 对象销毁，调用指定的销毁方法");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        System.out.println("2 给 bean 对象设置属性值");
        this.name = name;
    }
}
