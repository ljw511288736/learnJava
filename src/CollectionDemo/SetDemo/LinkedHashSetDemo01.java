package CollectionDemo.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        Student stu1 = new Student("ljw",23);
        Student stu2 = new Student("zhangsan",24);
        Student stu3 = new Student("lisi",25);
        Student stu4 = new Student("ljw",23);

        //有序、无重复、无索引
        //底层基于哈希表，使用双链表记录添加顺序
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(stu1);
        linkedHashSet.add(stu2);
        linkedHashSet.add(stu3);
        linkedHashSet.add(stu4);

        System.out.println(linkedHashSet);

    }
}
