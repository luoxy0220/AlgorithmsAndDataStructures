package class_02;

import org.junit.Test;

import static class_02.Code04_EqualProbabilityRandom.g;
import static org.junit.Assert.*;

/**
 * @Date: 2023/4/30 14:27
 * @Author: Sean Luo
 * @Description:
 */
public class Code04_EqualProbabilityRandomTest {

    @Test
    public void myTest() {
        int[] count = new int[2];// 0 1
        for (int i = 0; i < 1000000; i++) {
            int ans = g();
            count[ans]++;
        }
        System.out.println(count[0] + " , " + count[1]);

//		double zeroP = 0.88;
//		RandomBox randomBox = new RandomBox(zeroP);
//
//		int testTime = 10000000;
//		int count = 0;
//		for (int i = 0; i < testTime; i++) {
//			if (rand01(randomBox) == 0) {
//				count++;
//			}
//		}
//		System.out.println((double) count / (double) testTime);
    }
}