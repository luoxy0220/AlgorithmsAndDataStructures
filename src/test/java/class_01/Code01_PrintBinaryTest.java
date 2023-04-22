package class_01;

import org.junit.Test;

import static class_01.Code01_PrintBinary.print;

/**
 * @Date: 2023/4/22 15:45
 * @Author: Sean Luo
 * @Description:
 */
public class Code01_PrintBinaryTest {

    @Test
    public void test() {
        int num = 88575644;
        print(num);

        int a = Integer.MAX_VALUE;
        print(a);
    }

}