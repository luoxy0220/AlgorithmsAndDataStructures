package practice;

import org.junit.Test;

import static class_01.Code01_PrintBinary.print;
import static practice.bitOperation.Code04_GetSum.getSum;

/**
 * @Date: 2023/4/25 22:45
 * @Author: Sean Luo
 * @Description:
 */
public class Code04_GetSumTest {

    @Test
    public void myTest() {
        int m = 34985;
        int n = 69875;

        print(m);
        print(n);
        System.out.println(getSum(m, n));
        System.out.println(m+n);
    }
}