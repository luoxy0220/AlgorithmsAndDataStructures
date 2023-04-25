package practice_bitOperation;

import org.junit.Test;

import static practice_bitOperation.Code01_CountOnes.countOnes;
import static class_01.Code01_PrintBinary.print;

/**
 * @Date: 2023/4/24 21:49
 * @Author: Sean Luo
 * @Description:
 */
public class Code01_CountOnesTest {

    @Test
    public void myTest() {
        int num = 88;

        System.out.println(countOnes(num));
        print(num);
    }

}