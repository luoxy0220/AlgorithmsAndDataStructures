package class_01;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/22 15:48
 * @Author: Sean Luo
 * @Description: 选择排序，基本思路是从待排序的元素中选出最小的一个元素，然后与待排序的第一个元素交换位置；
 * 接着从剩余的元素中选择最小的一个元素，与待排序的第二个元素交换位置；以此类推，直到所有的元素都排序完毕。
 */
public class Code04_SelectionSort {

    public static void selectionSort(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
}
