package class_02;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/30 14:13
 * @Author: Sean Luo
 * @Description: 对数器
 */
public class Code03_Comp {

    /**
     * 插入排序
     * @param arr 需排序的数组
     */
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * 返回一个数组arr，arr长度[0,maxLen-1],arr中的每个值[0,maxValue-1]
     * @param maxLen 数组长度为maxLen-1
     * @param maxValue 数组中的最大值maxValue-1
     * @return 数组
     */
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    /**
     * 复制数组
     * @param arr 被复制的数组
     * @return 复制后的数组
     */
    public static int[] copyArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    /**
     * 数组是否是有序的
     * @param arr
     * @return
     */
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }
}
