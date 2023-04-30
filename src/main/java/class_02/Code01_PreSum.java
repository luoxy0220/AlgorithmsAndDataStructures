package class_02;

/**
 * @Date: 2023/4/25 23:21
 * @Author: Sean Luo
 * @Description: 假设有一个数组arr，用户总是频繁的查询arr中某一段的累加和，
 * 你如何组织数据，能让这种查询变得便利和快捷？
 */
public class Code01_PreSum {

    public static class RangeSum1 {

        private int[] arr;

        public RangeSum1(int[] array) {
            arr = array;
        }

        /**
         * 计算数组中从L ~ R位置的数的累加和
         * @param l
         * @param r
         * @return
         */
        public int rangeSum(int l, int r) {
            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum += arr[i];
            }
            return sum;
        }

    }

    public static class RangeSum2 {

        private int[] preSum;

        /**
         * 将数组从0开始到每个位置的累加和存入数组preSum中
         * @param array
         */
        public RangeSum2(int[] array) {
            int n = array.length;
            preSum = new int[n];
            preSum[0] = array[0];
            for (int i = 1; i < n; i++) {
                preSum[i] = preSum[i - 1] + array[i];
            }
        }

        /**
         * 计算数组中从L ~ R位置的数的累加和
         * @param l
         * @param r
         * @return
         */
        public int rangeSum(int l, int r) {
            return l == 0 ? preSum[r] : preSum[r] - preSum[l - 1];
        }
    }
}
