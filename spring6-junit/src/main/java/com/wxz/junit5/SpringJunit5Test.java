package com.wxz.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author wxz
 * @date 14:52 2024/1/14
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringJunit5Test
{
    @Autowired
    private User user;

    /**
     * @author wxz
     * @date 14:55 2024/1/14
     */
    @Test
    public void testUser()
    {
        user.run();
    }
}
