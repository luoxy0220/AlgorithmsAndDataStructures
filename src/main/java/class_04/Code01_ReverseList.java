package class_04;

import utils.DoubleNode;
import utils.Node;

/**
 * @Date: 15:10 2024/7/15
 * @Author: Sean Luo
 * @Description: 单链表及双向链表的反转
 */
public class Code01_ReverseList {

    /**
     * 反转单向链表。
     * @param node - 待处理单向链表
     * @return 反转后的链表
     */
    public static Node reverseLinkedList(Node node) {
        Node prev = null;
        Node next;

        while (node != null) {
            // 记录当前节点的下一个节点
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }

    /**
     * 反转双向链表。
     * @param node - 待处理双向链表
     * @return 反转后的链表
     */
    public static DoubleNode reverseDoubleList(DoubleNode node) {
        DoubleNode prev = null;
        DoubleNode next;

        while (node != null) {
            next = node.next;
            node.next = prev;
            node.last = next;
            prev = node;
            node = next;
        }
        return prev;
    }
}

