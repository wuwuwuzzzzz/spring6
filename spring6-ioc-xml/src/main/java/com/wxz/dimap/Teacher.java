package com.wxz.dimap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wxz
 * @date 15:16 2024/1/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher
{
    /**
     * ID
     */
    private String tid;

    /**
     * 姓名
     */
    private String name;
}
