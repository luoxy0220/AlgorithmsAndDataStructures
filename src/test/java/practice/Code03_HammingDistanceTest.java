package practice;

import org.junit.Test;

import static practice.bitOperation.Code03_HammingDistance.hammingDistance;
import static class_01.Code01_PrintBinary.print;

/**
 * @Date: 2023/4/25 21:47
 * @Author: Sean Luo
 * @Description:
 */
public class Code03_HammingDistanceTest {

    @Test
    public void myTest() {
        int m = 34985;
        int n = 69875;

        print(m);
        print(n);
        System.out.println(hammingDistance(m, n));
    }
}