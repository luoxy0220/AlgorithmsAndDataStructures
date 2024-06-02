package class_55;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/18 23:08
 * @Author: Sean Luo
 * @Description: 插入排序，基本思路是将一个待排序的元素插入到已排序序列的合适位置，
 * 从而得到一个新的有序序列。
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            // 第二个元素开始，依次将待排序元素插入到已排序序列中的合适位置
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }
}
