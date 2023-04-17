package sort;

/**
 * 冒泡排序，基本思路是通过不断交换相邻的元素，
 * 将大的元素逐渐“沉”到数组的底部，而小的元素则“浮”到数组的顶部。
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr==null || arr.length<2) {
            return;
        }
        for (int e=arr.length-1; e>0; e--){
            // 从数组的第一个元素开始，依次比较相邻的两个元素
            for (int i=0; i<e; i++) {
                // 如果前一个元素比后一个元素大，则交换这两个元素的位置
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }

    /**
     * 交换数组arr里i位置和j位置的值
     * @param arr 数组
     * @param i 索引
     * @param j 索引
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i]  = arr[j];
        arr[j]  = tmp;
    }
}
