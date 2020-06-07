package com.testcase;

import org.junit.jupiter.api.*;

/**
 * Description:
 * date: 2020 2020/6/5 10:39
 *
 * @author shaowenhao
 * @since JDK 1.8
 */


@DisplayName("Junit5演示类")
public class Junit5DemoTest {


    @BeforeAll
    public static void before(){
        System.out.println("before");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }
    // 注意引入的是junit5的标签
    @Test
    @DisplayName("fun测试方法")
    @RepeatedTest(5)
    void fun(){
        System.out.println("fun");
    }

    @Test
    @DisplayName("fun1测试方法")
    //@Disabled
    void fun1(){
        System.out.println("fun1");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @AfterAll
    public static void after(){
        System.out.println("after");
    }
}
