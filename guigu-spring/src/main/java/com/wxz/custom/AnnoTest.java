package com.wxz.custom;

import com.wxz.custom.bean.AnnotationApplicationContext;
import com.wxz.custom.service.UserService;
import org.junit.jupiter.api.Test;

/**
 * @author wxz
 * @date 20:54 2024/1/12
 */
public class AnnoTest
{
    /**
     * @author wxz
     * @date 21:45 2024/1/13
     */
    @Test
    public void testAnno()
    {
        AnnotationApplicationContext context = new AnnotationApplicationContext("com.wxz.custom");
        UserService bean = (UserService) context.getBean(UserService.class);
        bean.add();
    }
}
