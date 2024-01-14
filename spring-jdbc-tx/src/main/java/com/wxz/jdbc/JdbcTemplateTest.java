package com.wxz.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @author wxz
 * @date 15:10 2024/1/14
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @author wxz
     * @date 15:11 2024/1/14
     */
    @Test
    public void testInsert()
    {
        // 添加操作
        String sql = "INSERT INTO t_emp VALUES (NULL, ?, ?, ?)";
        int rows = jdbcTemplate.update(sql, "李四", 20, "男");
        System.out.println(rows);
    }

    /**
     * @author wxz
     * @date 15:30 2024/1/14
     */
    @Test
    public void testUpdate()
    {
        // 修改操作
        String sql = "UPDATE t_emp set age = ? WHERE id = ?";
        int rows = jdbcTemplate.update(sql, 30, 1);
        System.out.println(rows);
    }

    /**
     * @author wxz
     * @date 15:32 2024/1/14
     */
    @Test
    public void testDelete()
    {
        // 删除操作
        String sql = "DELETE FROM t_emp WHERE id = ?";
        int rows = jdbcTemplate.update(sql, 1);
        System.out.println(rows);
    }

    /**
     * @author wxz
     * @date 15:36 2024/1/14
     */
    @Test
    public void testSelectObject()
    {
        // 返回对象
        String sql = "SELECT * FROM t_emp WHERE id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(emp);
    }

    /**
     * @author wxz
     * @date 15:47 2024/1/14
     */
    @Test
    public void testSelectList()
    {
        // 返回集合
        String sql = "SELECT * FROM t_emp";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(empList);
    }

    /**
     * @author wxz
     * @date 15:51 2024/1/14`
     */
    @Test
    public void testSelectCount()
    {
        // 返回单个值
        String sql = "SELECT count(*) FROM t_emp";
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(i);
    }
}
