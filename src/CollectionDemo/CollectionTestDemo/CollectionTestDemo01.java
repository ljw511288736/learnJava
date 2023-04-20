package CollectionDemo.CollectionTestDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTestDemo01 {
    public static void main(String[] args) {
        Collection<Student> stu = new ArrayList<>();

        Student s1 = new Student("ljw",25);
        Student s2 = new Student("skyrim",26);
        Student s3 = new Student("skyrimlee",27);

        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        
        Student s4 = new Student("ljw",25);
        //如果学生中姓名年龄相同，则判断为同一个学生

        //stu.add(s4);

        boolean flag = stu.contains(s4);
        System.out.println(flag);

        boolean empty = stu.isEmpty();
        System.out.println(empty);

        int size = stu.size();
        System.out.println(size);
    }
}
