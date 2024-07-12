package class_01;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/20 20:39
 * @Author: Sean Luo
 * @Description: 基本思路是通过不断交换相邻的元素，将大的元素逐渐“沉”到数组的底部，而小的元素则“浮”到数组的顶部。
 */
public class Code05_BubbleSort {

    public static void bubbleSort(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
}
