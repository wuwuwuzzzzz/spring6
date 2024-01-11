package com.wxz.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 20:28 2024/1/11
 */
public class JdbcTest
{
    /**
     * @author wxz
     * @date 20:28 2024/1/11
     */
    @Test
    public void demo()
    {
        try (DruidDataSource source = new DruidDataSource())
        {
            source.setUrl("jdbc:mysql://localhost:3306/zky?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8&allowMultiQueries=true");
            source.setUsername("root");
            source.setPassword("123456");
            source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        }
    }

    /**
     * @author wxz
     * @date 20:28 2024/1/11
     */
    @Test
    public void demo2()
    {
        try (DruidDataSource source = new DruidDataSource())
        {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
            DruidDataSource dataSource = context.getBean(DruidDataSource.class);
            System.out.println(dataSource.getUrl());
        }
    }
}
