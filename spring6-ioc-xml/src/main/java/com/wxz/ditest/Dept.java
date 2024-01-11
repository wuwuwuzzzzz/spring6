package com.wxz.ditest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 部门表
 *
 * @author wxz
 * @date 14:32 2024/1/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept
{
    /**
     * 员工列表
     */
    private List<Emp> empList;

    /**
     * 名称
     */
    private String deptName;

    /**
     * @author wxz
     * @date 14:35 2024/1/11
     */
    public void info()
    {
        System.out.println("部门名称：" + deptName);
        for (Emp emp : empList)
        {
            System.out.println(emp.getEmpName() + emp.getAge());
        }
    }
}
