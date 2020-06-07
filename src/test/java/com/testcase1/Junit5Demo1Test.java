package com.testcase1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Description:
 * date: 2020 2020/6/5 11:34
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Junit5Demo1Test {
      @Test
      void demo1(){
          System.out.println("demo1");
      }

      @Test
      @Tag("sanity")
    void sanity1(){
          System.out.println("sanity testing");
      }

      @Test
      @Tag("regression")
    void regression1(){
          System.out.println("regression testing");
      }
}
