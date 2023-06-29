package class_03;

/**
 * @Date: 2023/5/11 20:14
 * @Author: Sean Luo
 * @Description: 局部最小值问题
 */
public class Code04_FindLocalMinimum {

    /**
     * 查找旋转数组的最小值的位置
     * @param arr-待查找的旋转数组
     * @return 局部最小值的位置下标，若未找到返回-1
     */
    public static int findLocalMinimum(int[] arr){
        // 边界条件：数组为空或长度为0，返回-1
        if (arr == null || arr.length < 1){
            return -1;
        }
        // 数组只有一个元素，直接返回该元素的下标0
        if (arr.length == 1){
            return 0;
        }
        // 数组的第1个元素比第2个元素小，直接返回下标0
        if (arr[0] < arr[1]){
            return 0;
        }
        // 数组的最后1个元素比倒数第2个元素小，直接返回最后一个元素的下
        if (arr[arr.length-1] < arr[arr.length-2]){
            return arr.length-1;
        }
        int left  = 0;
        int right = arr.length - 1;
        while(left < right-1){
            int mid = left + ((right - left) >> 1);
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else {
                if (arr[mid] > arr[mid - 1]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return arr[left] < arr[right] ? left : right;
    }

    /**
     * 生成指定长度的随机整数数组
     * @param maxLen-数组最大长度
     * @param maxValue-随机数最大值
     * @return 生成的随机整数数组
     */
    public static int[] randomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
            for (int i = 1; i < len; i++) {
                do {
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i - 1]);
            }
        }
        return arr;
    }

    /**
     * 检查给定的数组中的最小值索引是否为局部最小值
     * @param arr-给定的数组
     * @param minIndex-最小值的索引
     * @return 布尔值，表示给定的最小值索引是否为局部最小值
     */
    public static boolean check(int[] arr, int minIndex) {
        if (arr.length == 0) {
            return minIndex == -1;
        }
        int left = minIndex - 1;
        int right = minIndex + 1;
        boolean leftBigger = left < 0 || arr[left] > arr[minIndex];
        boolean rightBigger = right >= arr.length || arr[right] > arr[minIndex];
        return leftBigger && rightBigger;
    }

    /**
     * 打印整型数组
     * @param arr-待打印的整型数组
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
