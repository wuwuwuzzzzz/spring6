package com.wxz.dimap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author wxz
 * @date 15:16 2024/1/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    /**
     * Map
     */
    private Map<String, Teacher> teacherMap;

    /**
     * ID
     */
    private String sid;

    /**
     * 姓名
     */
    private String name;
}
