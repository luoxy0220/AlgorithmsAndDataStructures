package class_01;

import org.junit.Test;

import static class_01.Code03_Sort.*;
import static utils.ArraysUtil.printArray;

/**
 * @Date: 2023/4/22 16:00
 * @Author: Sean Luo
 * @Description:
 */
public class Code03_SortTest {

    @Test
    public void selectionSortTest() {
        int[] arr = {5, 6, 7, 1, 3, 2, 9, 2, 5};

        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }

    @Test
    public void bubbleSortTest() {
        int[] arr = {5, 6, 7, 1, 3, 2, 9, 2, 5};

        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    @Test
    public void insertSort1Test() {
        int[] arr = {5, 6, 7, 1, 3, 2, 9, 2, 5};

        printArray(arr);
        insertSort1(arr);
        printArray(arr);
    }

    @Test
    public void insertSort2Test() {
        int[] arr = {5, 6, 7, 1, 3, 2, 9, 2, 5};

        printArray(arr);
        insertSort2(arr);
        printArray(arr);
    }
}