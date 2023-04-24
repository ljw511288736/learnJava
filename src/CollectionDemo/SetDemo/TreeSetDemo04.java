package CollectionDemo.SetDemo;

import java.util.TreeSet;


public class TreeSetDemo04 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("ljw", 25, 80, 95, 90);
        Student2 s2 = new Student2("zhangsan", 26, 80, 96, 90);
        Student2 s3 = new Student2("lisi", 25, 80, 95, 90);
        Student2 s4 = new Student2("wangwu", 28, 80, 95, 95);
        Student2 s5 = new Student2("ljw", 25, 80, 95, 90);

        TreeSet<Student2> ts2 = new TreeSet<>();

        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        ts2.add(s5);

       for (Student2 t : ts2) {
        System.out.println(t);
       }
    }
}
