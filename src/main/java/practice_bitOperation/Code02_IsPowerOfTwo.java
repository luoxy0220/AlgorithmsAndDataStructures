package practice_bitOperation;

/**
 * @Date: 2023/4/24 21:56
 * @Author: Sean Luo
 * @Description: 判断一个数是否是2的幂次方。
 * 2的幂次方在二进制下只有最高位是1，其余位都是0，因此可以通过检查该数的二进制表示中是否只有一个1来判断它是否是2的幂次方。
 */
public class Code02_IsPowerOfTwo {

    public static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }
        return (num & (num - 1)) == 0;
    }
}
