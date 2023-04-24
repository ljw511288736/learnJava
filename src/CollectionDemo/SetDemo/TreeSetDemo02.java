package CollectionDemo.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        
        Student s1 = new Student("ljw", 25);
        Student s2 = new Student("lijiewen", 26);
        Student s3 = new Student("Skyrim1ee", 27);
        Student s4 = new Student("Skyrimlee", 28);
        Student s5 = new Student("ljw", 26);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);
    }
}
