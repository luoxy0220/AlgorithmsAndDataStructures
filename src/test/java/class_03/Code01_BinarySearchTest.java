package class_03;

import org.junit.Test;

import java.util.Arrays;

import static class_03.Code01_BinarySearch.*;
import static utils.ArraysUtil.generateRandomArray;

/**
 * @Date: 2023/5/1 17:42
 * @Author: Sean Luo
 * @Description:
 */
public class Code01_BinarySearchTest {

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
            if (test(arr, value) != binarySearch(arr, value)) {
                System.out.println(Arrays.toString(arr));
                System.out.println("出错了！");
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}