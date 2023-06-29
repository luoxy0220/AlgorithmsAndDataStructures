package class_03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Date: 2023/6/29 21:22
 * @Author: Sean Luo
 * @Description: 哈希表和有序表的用法
 */
public class Code05_HashMapTreeMap {

    public static class Node {
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Anduin", "我是牧师。");
        System.out.println(map1.containsKey("Anduin"));
        System.out.println(map1.containsKey("an"));
        System.out.println(map1.get("Anduin"));

        map1.put("Anduin", "他是牧师。");
        System.out.println(map1.get("Anduin"));

//        map.remove("Anduin");
//        System.out.println(map.containsKey("Anduin"));
//        System.out.println(map.get("Anduin"));

        String priest1 = "Anduin";
        String priest2 = "Anduin";
        System.out.println(map1.containsKey(priest1));
        System.out.println(map1.containsKey(priest2));

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(123, "我是123.");

        Integer a = 123;
        Integer b = 123;

        System.out.println(a.equals(b));
        System.out.println(map2.containsKey(a));
        System.out.println(map2.containsKey(b));

        Node node1 = new Node(1);
        Node node2 = new Node(1);
        HashMap<Node, String> map3 = new HashMap<>();
        map3.put(node1, "我进来了。");
        System.out.println(map3.get(node1));    // 我进来了。
        System.out.println(map3.get(node2));    // null

        System.out.println("==========");

        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(3, "我是3.");
        treeMap1.put(0, "我是0.");
        treeMap1.put(4, "我是4.");
        treeMap1.put(6, "我是6.");
        treeMap1.put(9, "我是9.");
        System.out.println(treeMap1.containsKey(6));
        System.out.println(treeMap1.containsKey(7));
        System.out.println(treeMap1.get(3));

        treeMap1.put(3, "他是3.");
        System.out.println(treeMap1.get(3));

        treeMap1.remove(3);
        System.out.println(treeMap1.get(3));

        System.out.println(treeMap1.firstKey());
        System.out.println(treeMap1.lastKey());
        System.out.println(treeMap1.floorKey(6));
        System.out.println(treeMap1.floorKey(5));

        System.out.println(treeMap1.ceilingKey(6));
        System.out.println(treeMap1.ceilingKey(5));

        Node node3 = new Node(3);
        Node node4 = new Node(4);
        TreeMap<Node, String> treeMap2 = new TreeMap<>(new Comparator<Node>() {
            @Override
            public int compare(Node node1, Node node2) {
                return Integer.compare(node1.value, node2.value);
            }
        });
        treeMap2.put(node3, "我是node3.");
        treeMap2.put(node4, "我是node4.");
    }
}
