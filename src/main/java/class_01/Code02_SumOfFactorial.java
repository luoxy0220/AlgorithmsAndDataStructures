package class_01;

/**
 * @Date: 2023/4/20 20:30
 * @Author: Sean Luo
 * @Description: 计算阶乘之和
 */
public class Code02_SumOfFactorial {

    public static long f1(int n) {
        long ans = 0;
        for (int i=1; i<=n; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    public static long factorial(int n) {
        int ans = 1;
        for (int i=1; i<=n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static long f2(int n) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= n; i++) {
            cur = cur * i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
