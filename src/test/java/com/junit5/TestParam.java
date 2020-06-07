package com.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 * date: 2020 2020/6/5 13:33
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TestParam {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void testWithValueSource(int argument){

        assertTrue(argument > 0 && argument < 4);
    }

    // junt5 5.2.0 版本没有 Null 和 Empty Source 5.5.2以上根据之间的版本需要改一下

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {""," ","\t","\n"})
    void nullEmptyAndBlankStrings(String text){
      assertTrue(text == null || text.trim().isEmpty());

    }

    //对于 数据结构复杂 建议使用methordSource
   @ParameterizedTest
   @MethodSource("stringProvider")
   void testwithMethodSource(String argument){
        assertNotNull(argument);
   }

   // 一般用MethodSource 序列化和反序列化 构造出更复杂的数据源
   static Stream<String> stringProvider(){
        return Stream.of("apple","banana");
   }

    @ParameterizedTest
    @CsvSource({
            "apple,1",
            "banana,2"
    })
    void testWithCsvSource(String ftuit, int rank){
        assertNotNull(ftuit);
        assertNotEquals(0,rank);
    }

    //@csvFileSource(resources = "/xx/xx.csv", numLinesSkip = 1)


}
