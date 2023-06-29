package class_03;

import org.junit.Test;

import java.util.Arrays;

import static class_03.Code03_FindRightPosition.*;

/**
 * @Date: 2023/5/11 21:34
 * @Author: Sean Luo
 * @Description:
 */
public class Code03_FindRightPositionTest {

    @Test
    public void myTest() {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if (test(arr, value) != findRightPosition(arr, value)) {
                printArray(arr);
                System.out.println(value);
                System.out.println(test(arr, value));
                System.out.println(findRightPosition(arr, value));
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}