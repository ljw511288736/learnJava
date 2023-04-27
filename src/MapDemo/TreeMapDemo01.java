package MapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(001, "Phone");
        tm.put(002, "Book");
        tm.put(003, "Model");
        tm.put(004, "Computer");

        System.out.println(tm);
    }
}
