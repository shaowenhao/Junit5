package com.testcase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * Description:
 * date: 2020 2020/6/5 11:05
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

//NESTED 写法是倒叙的 从最下面往上执行

public class LoginTest {
    protected static HashMap<String,Object> dataMap = new HashMap<String, Object>();

    @Test
    void login(){
        dataMap.put("login","登录成功");
    }

    @Nested
    class PayTest{
        @Test
        void payTest(){
            if (dataMap.get("buy") != null) {
                System.out.println("正在支付，请等待");
                System.out.println(dataMap.get("buy"));
            }else {
                System.out.println("还未购买课程");
            }
        }
    }


    @Nested
    class BuyTest{
         @Test
        void buyTest(){
             if (dataMap.get("login").equals("登录成功")) {
                 System.out.println("登录成功");
                 dataMap.put("buy","购买了霍格沃兹名企定向的课程");
             }else{
                 System.out.println("需要先登录 才能购买");
             }
         }
    }


}
