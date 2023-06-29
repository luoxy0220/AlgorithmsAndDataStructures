package class_03;

import org.junit.Test;

import static class_03.Code04_FindLocalMinimum.*;

/**
 * @Date: 2023/5/14 19:23
 * @Author: Sean Luo
 * @Description:
 */
public class Code04_FindLocalMinimumTest {

    @Test
    public void myTest(){
        int maxLen = 100;
        int maxValue = 200;
        int testTime = 1000000;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int[] arr = randomArray(maxLen, maxValue);
            int ans = findLocalMinimum(arr);
            if (!check(arr, ans)) {
                printArray(arr);
                System.out.println(ans);
                break;
            }
        }
        System.out.println("测试结束");
    }
}