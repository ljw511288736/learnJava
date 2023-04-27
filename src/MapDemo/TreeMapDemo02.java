package MapDemo;

import java.util.TreeMap;

public class TreeMapDemo02 {
    public static void main(String[] args) {
        TreeMap<Student2,String> tm = new TreeMap<>();

        Student2 s1 = new Student2("zhangsan", 25);
        Student2 s2 = new Student2("lisi", 26);
        Student2 s3 = new Student2("wangwu", 27);
        Student2 s4 = new Student2("zhaoliu", 25);

        tm.put(s1, "guangdong");
        tm.put(s2, "zhejiang");
        tm.put(s3, "hunan");
        tm.put(s4, "hubei");

        System.out.println(tm);

    }
}
