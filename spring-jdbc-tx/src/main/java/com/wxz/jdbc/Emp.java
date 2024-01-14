package com.wxz.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wxz
 * @date 15:35 2024/1/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable
{
    /**
     * ID
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private String sex;
}