package practice_bitOperation;

import org.junit.Test;

import static practice_bitOperation.Code02_IsPowerOfTwo.isPowerOfTwo;

/**
 * @Date: 2023/4/24 22:01
 * @Author: Sean Luo
 * @Description:
 */
public class Code02_IsPowerOfTwoTest {

    @Test
    public void myTest() {
        int num1 = 4096;
        int num2 = 68486574;

        System.out.println(isPowerOfTwo(num1));
        System.out.println(isPowerOfTwo(num2));
    }
}