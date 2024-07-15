package class_03;

/**
 * @Date: 2023/5/1 17:21
 * @Author: Sean Luo
 * @Description: 有序数组中找到num
 */
public class Code01_BinarySearch {

    /**
     * 在有序数组arr中查找元素num是否存在
     * @param arr-待查找的有序数组
     * @param num-待查找的元素
     * @return 如果num存在于arr中，则返回true；否则返回false
     */
    public static boolean binarySearch(int[] arr, int num) {
        // 边界检查：如果数组为空或长度为0，则返回false
        if (arr == null || arr.length == 0) {
            return false;
        }
        // 初始化左右指针
        int left  = 0;
        int right = arr.length - 1;
        // 在数组的[left, right]区间中进行查找
        while(left <= right) {
            // 计算中间位置的下标
            int mid = (left + right) / 2;
            // 如果mid位置的元素等于num，返回true
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) { // 如果中间位置的元素比num大，说明num在左侧区间，将right指针移动到mid-1位置继续查找
                right = mid - 1;
            } else { // 如果中间位置的元素比num小，说明num在右侧区间，将left指针移动到mid+1位置继续查找
                left = mid +1;
            }
        }
        // 如果没找到num，返回false
        return false;
    }

    /**
     * 测试给定数组中是否包含给定的整数
     * @param arr-给定的整数数组
     * @param num-给定的整数
     * @return 数组中是否包含给定的整数
     */
    public static boolean test(int[] arr, int num) {
        for (int i : arr) {
            if (i == num){
                return true;
            }
        }
        return false;
    }
}
