package com.cheng.usercenter.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Aaron
 * @date : 2023/5/18 7:49
 */
@SpringBootTest
public class AssertionsTest {

    @Test
    public void testAssert() {
        int expected = 2;
        int actual = 1;

        assertEquals(expected,
                actual,
                // 这个lambda表达式，只有在expected和actual不相等时才执行
                ()->String.format("期望值[%d]，实际值[%d]", expected, actual));
    }


}
