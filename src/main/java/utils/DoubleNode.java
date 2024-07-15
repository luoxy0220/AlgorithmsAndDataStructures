package utils;

/**
 * @Date: 15:12 2024/7/15
 * @Author: Sean Luo
 * @Description: 双向节点
 */
public class DoubleNode {
    public int value;
    public DoubleNode last;
    public DoubleNode next;

    public DoubleNode(int data) {
        value = data;
    }
}
