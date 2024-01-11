package com.wxz.ditest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    }
}
