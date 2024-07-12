package class_01;

import org.junit.Test;

import static class_01.Code04_SelectionSort.*;
import static utils.ArraysUtil.*;

/**
 * @Date: 2023/4/22 15:50
 * @Author: Sean Luo
 * @Description:
 */
public class Code04_SelectionSortTest {

    @Test
    public void myTest() {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            selectionSort(arr1);
            comparator(arr2);
            if (isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}