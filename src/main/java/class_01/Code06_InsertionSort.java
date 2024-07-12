package class_01;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/22 16:01
 * @Author: Sean Luo
 * @Description: 插入排序，基本思路是将一个待排序的元素插入到已排序序列的合适位置，从而得到一个新的有序序列。
 */
public class Code06_InsertionSort {

    public static void insertionSort(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int tail = 1; tail < n; tail++) {
            int keyIndex = tail;
            while (keyIndex - 1 >= 0 && arr[keyIndex - 1] > arr[keyIndex]) {
                swap(arr, keyIndex -1, keyIndex);
                keyIndex--;
            }
        }
    }
}
