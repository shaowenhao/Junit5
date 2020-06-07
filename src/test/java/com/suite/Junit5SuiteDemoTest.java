package com.suite;

import com.testcase1.Junit5Demo1Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * Description:
 * date: 2020 2020/6/5 11:39
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

//@SelectPackages 与 @includePackages() 搭配
// 在一个大的包的范围 指定子包里要跑的用例 间接等于不跑某些子包下的用例
// 注释掉是为了 看selectClasses IncludeTags 标签效果
@RunWith(JUnitPlatform.class)
/*@SelectPackages({
        "com.testcase1",
        "com.testcase2"
})*/


@SelectClasses({
        Junit5Demo1Test.class
})
@IncludeTags({
  "sanity","regression"
})
public class Junit5SuiteDemoTest {


}
