package com.wxz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wxz
 * @date 16:03 2024/1/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 测试方法
     *
     * @author wxz
     * @date 21:16 2024/1/10
     */
    public void run()
    {
        System.out.println("run......");
    }
}
