package class_02;

import org.junit.Test;

import static class_02.Code03_Comp.*;
import static utils.ArraysUtil.copyArray;

/**
 * @Date: 2023/4/30 14:21
 * @Author: Sean Luo
 * @Description:
 */
public class Code03_CompTest {

    @Test
    public void myTest() {
        int maxLen = 5;
        int maxValue = 1000;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen, maxValue);
            int[] tmp = copyArray(arr1);
            selectionSort(arr1);
            if (!isSorted(arr1)) {
                for (int j = 0; j < tmp.length; j++) {
                    System.out.print(tmp[j] + " ");
                }
                System.out.println();
                System.out.println("选择排序错了！");
                break;
            }
        }
    }
}