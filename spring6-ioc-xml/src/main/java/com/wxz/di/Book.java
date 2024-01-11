package com.wxz.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wxz
 * @date 12:01 2024/1/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book
{
    /**
     * 名称
     */
    private String bookName;

    /**
     * 作者
     */
    private String author;
}
