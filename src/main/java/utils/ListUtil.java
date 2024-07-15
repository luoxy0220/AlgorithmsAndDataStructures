package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date: 15:26 2024/7/15
 * @Author: Sean Luo
 * @Description:
 */
public class ListUtil {

    /**
     * 生成一个长度为length，取值范围为[0, value]的单向链表
     * @param length 链表长度
     * @param value 链表的取值范围是[0, value]
     * @return 长度为length，取值范围为[0, value]的单向链表
     */
    public static Node generateRandomLinkedList(int length, int value) {
        int size = (int) (Math.random() * (length + 1));
        if (length == 0) return null;
        size--;
        Node head = new Node((int) (Math.random() * (value + 1)));
        Node prev = head;
        while(size != 0) {
            Node curr = new Node((int) (Math.random() * (value + 1)));
            prev.next = curr;
            prev = curr;
            size--;
        }
        return head;
    }

    /**
     * 生成一个长度为length，取值范围为[0, value]的双向链表
     * @param length 链表长度
     * @param value 链表的取值范围是[0, value]
     * @return 长度为length，取值范围为[0, value]的双向链表
     */
    public static DoubleNode generateRandomDoubleList(int length, int value) {
        int size = (int) (Math.random() * (length + 1));
        if (size == 0) return null;
        size--;
        DoubleNode head = new DoubleNode((int) (Math.random() * (value + 1)));
        DoubleNode prev = head;
        while (size != 0) {
            DoubleNode curr = new DoubleNode((int) (Math.random() * (value + 1)));
            prev.next = curr;
            curr.last = prev;
            prev = curr;
            size--;
        }
        return head;
    }

    public static List<Integer> getLinkedListOriginOrder(Node head) {
        List<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.value);
            head = head.next;
        }
        return ans;
    }

    public static boolean checkLinkedListReverse(List<Integer> origin, Node head) {
        for (int i = origin.size() - 1; i >= 0; i--) {
            if (!origin.get(i).equals(head.value)) return false;
            head = head.next;
        }
        return true;
    }

    public static List<Integer> getDoubleListOriginOrder(DoubleNode head) {
        List<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.value);
            head = head.next;
        }
        return ans;
    }

    public static boolean checkDoubleListReverse(List<Integer> origin, DoubleNode head) {
        DoubleNode tail = null;
        for (int i = origin.size() - 1; i>= 0; i--) {
            if (!origin.get(i).equals(head.value)) return false;
            tail = head;
            head = head.next;
        }
        for (Integer integer : origin) {
            if (!integer.equals(tail.value)) return false;
            tail = tail.last;
        }
        return true;
    }
}
