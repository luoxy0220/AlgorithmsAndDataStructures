package class_01;

import org.junit.Test;

import static class_01.Code02_SumOfFactorial.f1;
import static class_01.Code02_SumOfFactorial.f2;

/**
 * @Date: 2023/4/22 15:58
 * @Author: Sean Luo
 * @Description:
 */
public class Code02_SumOfFactorialTest {

    @Test
    public void myTest() {
        int n = 10;

        System.out.println(f1(n));
        System.out.println(f2(n));
    }
}