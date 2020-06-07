package junit5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Description: 参数化例子 POM里 dependency compile
 * date: 2020 2020/6/5 13:34
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


}
