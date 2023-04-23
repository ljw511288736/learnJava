package CollectionDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        HashSet<Student> hashset = new HashSet<>();

        System.out.println(hashset.add(s1));
        System.out.println(hashset.add(s2));
        System.out.println(hashset.add(s3));
        System.out.println(hashset.add(s4));//重写完hashcode和equals方法后，不同对象属性相同会被视为同一个对象

        System.out.println(hashset);

    }
}
