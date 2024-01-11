package com.wxz.ditest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工表
 *
 * @author wxz
 * @date 14:33 2024/1/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp
{
    /**
     * 所属部门
     */
    private Dept dept;

    /**
     * 名称
     */
    private String empName;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 爱好
     */
    private String[] loves;

    /**
     * @author wxz
     * @date 14:34 2024/1/11
     */
    public void work()
    {
        System.out.println(empName + "正在工作..." + age);
        dept.info();
    }
}
