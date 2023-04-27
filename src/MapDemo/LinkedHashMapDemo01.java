package MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();


        //有序、不重复、无索引
        //利用双向链表的机制记录每个键值对的顺序
        lhm.put("a", 123);
        lhm.put("b", 456);
        lhm.put("c", 789);
        lhm.put("a", 111);

        System.out.println(lhm);

    }
}
