package com.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Description:
 * date: 2020 2020/6/6 21:55
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TestAeesrtion {
    @Test
    public void assertion(){
        assertAll("demo assertion",
                ()-> assertEquals(1,2),
                ()-> assertEquals(1,1),
                ()-> assertEquals(1,3));
    }
}
