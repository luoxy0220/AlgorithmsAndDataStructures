package class_03;

/**
 * @Date: 2023/5/1 17:56
 * @Author: Sean Luo
 * @Description: 有序数组中找到>=num最左的位置
 */
public class Code02_FindLeftPosition {
    /**
     * 在有序数组中找到>=num最左的位置
     * @param arr-有序数组
     * @param num-目标数值
     * @return 返回大于或等于num的最左的位置，若不存在则返回-1
     */
    public static int findLeftPosition(int[] arr, int num) {
        // 边界检查：如果数组为空或长度为0，则返回-1
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left  = 0;
        int right = arr.length - 1;
        int ans   = -1;
        while (left <= right) {
            // 防止left+right过大导致整形溢出
            int mid = left + ((right - left) >> 1);
            // 如果mid位置的元素大于等于num，则将res更新为mid
            if (arr[mid] >= num) {
                // 更新最左的位置
                ans   = mid;
                right = mid - 1;
            } else { // 如果mid位置的元素小于num，则在mid的右侧查找
                left = mid + 1;
            }
        }
        return ans;
    }

    /**
     * 在一个有序数组中找到第一个大于等于给定值的元素位置
     * @param arr-给定的有序数组
     * @param value-给定的值
     * @return 返回第一个大于等于给定值的元素位置，如果没有找到则返回-1
     */
    public static int test(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= value) {
                return i;
            }
        }
        return -1;
    }
}
