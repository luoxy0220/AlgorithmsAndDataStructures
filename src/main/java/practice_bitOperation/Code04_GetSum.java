package practice_bitOperation;

/**
 * @Date: 2023/4/25 22:12
 * @Author: Sean Luo
 * @Description: 不使用加法运算实现两个整数的加法
 */
public class Code04_GetSum {

    public static int getSum(int m, int n) {
        while (n != 0) {
            // carry表示需要进位的位
            int carry = m & n;
            // 无进位加法的结果
            m = m ^ n;
            n = carry << 1;
        }
        return m;
    }
    /**
     *  10111011
     *  10110010
     *  & 10110010
     *  ^ 10001001
     */
}
