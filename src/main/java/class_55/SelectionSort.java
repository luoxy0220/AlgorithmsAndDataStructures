package class_55;

import java.util.Arrays;

import static utils.ArraysUtil.swap;

/**
 * @Date: 2023/4/18 23:08
 * @Author: Sean Luo
 * @Description: 选择排序算法，基本思路是从待排序的元素中选出最小的一个元素，然后与待排序的第一个元素交换位置；
 * 接着从剩余的元素中选择最小的一个元素，与待排序的第二个元素交换位置；以此类推，直到所有的元素都排序完毕。
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        if (arr==null || arr.length<2) {
            return;
        }
        int length = arr.length;
        for (int i=0; i<length-1; i++) {
            // 在待排序的元素中选择最小的元素，并记录其下标
            int minIndex = i;
            // 遍历剩余的未排序元素
            for (int j=i+1; j<length; j++) {
                // 如果发现比当前记录的最小值更小的元素，则更新最小元素的下标
                minIndex = arr[j]<arr[minIndex] ? j : minIndex;
            }
            // 将选出的最小元素与待排序的第一个元素交换位置
            swap(arr, i, minIndex);
        }
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            // [-? , +?]
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        return res;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
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
}
