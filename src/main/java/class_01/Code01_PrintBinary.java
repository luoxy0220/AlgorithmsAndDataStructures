package class_01;

/**
 * @Date: 2023/4/22 15:44
 * @Author: Sean Luo
 * @Description: 把int类型整数转化为32位二进制数
 */
public class Code01_PrintBinary {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
