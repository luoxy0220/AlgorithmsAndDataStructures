package class_01;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/21 20:19
 * @Author: Sean Luo
 * @Description: 常见的排序算法
 */
public class Code03_Sort {

    /**
     * 选择排序
     * @param arr - 待排序的数组
     */
    public static void selectionSort(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        // 从 0 ~ n-1 范围上选出最小的数，和 0 位置上的数进行交换，
        // 从 1 ~ n-1 范围上选出最小的数，和 1 位置上的数进行交换，
        // 从 i ~ n-1 范围上选出最小的数，和 i 位置上的数进行交换。
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 假定i位置上的数是数组中最小的数，把索引记为minValueIndex。
            int minValueIndex = i;
            for (int j = i + 1; j < n; j++) {
                // 将minValueIndex位置上的数与j位置后面的数进行比较，如果小于，则索引更新为j，否则，保持不变。
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr,i,minValueIndex);
        }
    }

    /**
     * 打印数组arr。
     * @param arr - 待排序的数组
     */
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /**
     * 冒泡排序
     * @param arr - 待排序的数组
     */
    public static void bubbleSort(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        // 从0 ~ n-1对数组元素进行比较，如果0位置元素大于1位置元素，那么把两个元素进行交换，循环往复，一直到n-1位置
        // 从0 ~ n-2对数组元素进行比较，如果0位置元素大于1位置元素，那么把两个元素进行交换，循环往复，一直到n-2位置
        // 从0 ~ n-3对数组元素进行比较，如果0位置元素大于1位置元素，那么把两个元素进行交换，循环往复，一直到n-3位置
        int n = arr.length;
        for (int end = arr.length - 1; end >= 0; end --) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    /**
     * 插入排序
     * @param arr - 待排序的数组
     */
    public static void insertSort1(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ 1是有序的
        // 0 ~ 2，此时0 ~ 1位置上是有序的，需要将2位置上的数与0 ~ 1位置上的数进行比较，然后按照大小顺序，插入到0 ~ 1中
        // 0 ~ 3，此时0 ~ 2位置上是有序的，需要将3位置上的数与0 ~ 2位置上的数进行比较，然后按照大小顺序，插入到0 ~ 2中
        // 0 ~ n-1，此时0 ~ n-2位置上是有序的，需要将n-1位置上的数与0 ~ n-2位置上的数进行比较，然后按照大小顺序，插入到0 ~ n-2中
        int n = arr.length;
        for (int end = 1; end < n; end++){
            int newNumIndex = end;
            while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                swap(arr, newNumIndex - 1, newNumIndex);
                newNumIndex--;
            }
        }
    }

    public static void insertSort2(int[] arr) {
        // 边界条件
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ 1是有序的，
        // 0 ~ 2，此时0 ~ 1位置上是有序的，需要将2位置上的数与0 ~ 1位置上的数进行比较，然后按照大小顺序，插入到0 ~ 1中，
        // 0 ~ 3，此时0 ~ 2位置上是有序的，需要将3位置上的数与0 ~ 2位置上的数进行比较，然后按照大小顺序，插入到0 ~ 2中，
        // 0 ~ n-1，此时0 ~ n-2位置上是有序的，需要将n-1位置上的数与0 ~ n-2位置上的数进行比较，然后按照大小顺序，插入到0 ~ n-2中。
        int n = arr.length;
        for (int end = 1; end < n; end++){
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }
    }
}
