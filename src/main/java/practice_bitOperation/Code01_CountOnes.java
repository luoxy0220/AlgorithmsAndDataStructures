package practice_bitOperation;

/**
 * @Date: 2023/4/24 21:28
 * @Author: Sean Luo
 * @Description: 求一个整数的二进制表示中有多少个1。
 */
public class Code01_CountOnes {

    public static int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            // 将num的二进制表示中的最后一个1变成0
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
