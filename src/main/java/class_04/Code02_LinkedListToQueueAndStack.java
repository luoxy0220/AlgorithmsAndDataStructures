package class_04;

/**
 * @Date: 2024/7/16 9:25
 * @Author: Sean Luo
 * @Description:
 */
public class Code02_LinkedListToQueueAndStack {

    public static class Node<V> {
        public V value;
        public Node<V> next;

        public Node(V v) {
            value = v;
            next  = null;
        }
    }

    public static class MyQueue<V> {
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void offer(V value) {
            Node<V> node = new Node<>(value);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
            size++;
        }

        public V poll() {
            V v = null;
            if (head != null) {
                v    = head.value;
                head = head.next;
                size--;
            }
            if (head == null) tail = null;
            return v;
        }

        public V peek() {
            V v = null;
            if (head != null) v = head.value;
            return v;
        }
    }

    public static class MyStack<V> {
        private Node<V> head;
        private int size;

        public MyStack() {
            head = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void push(V value) {
            Node<V> curr = new Node<>(value);
            if (head != null) curr.next = head;
            head = curr;
            size++;
        }

        public V pop() {
            V value = null;
            if (head != null) {
                value = head.value;
                head  = head.next;
                size--;
            }
            return value;
        }

        public V peek() {
            return head == null ? null : head.value;
        }
    }
}
