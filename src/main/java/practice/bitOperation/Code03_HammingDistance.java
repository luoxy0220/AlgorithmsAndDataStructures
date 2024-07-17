package practice.bitOperation;

/**
 * @Date: 2023/4/25 21:42
 * @Author: Sean Luo
 * @Description: 给定两个整数m和n，计算需要改变m的二进制表示中的多少位才能得到n的二进制表示
 */
public class Code03_HammingDistance {

    public static int hammingDistance(int m, int n) {
        int xor = m ^ n;
        int num = 0;
        while(xor != 0) {
            xor &= (xor - 1);
            num++;
        }
        return num;
    }
}
