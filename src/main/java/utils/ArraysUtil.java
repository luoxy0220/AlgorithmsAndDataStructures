package utils;

/**
 * @Date: 2024/6/2 12:00
 * @Author: Sean Luo
 * @Description:
 */
public class ArraysUtil {

    /**
     * 交换数组arr中i位置和j位置上的元素。
     * @param arr - 要进行交换操作的数组
     * @param i - 第一个元素的位置
     * @param j - 第二个元素的位置
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 通过位运算交换数组arr中i位置和j位置上的元素。
     * @param arr - 要进行交换操作的数组
     * @param i - 第一个元素的位置
     * @param j - 第二个元素的位置
     */
    public static void swapByBit(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }
}
