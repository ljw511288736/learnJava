package MapDemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("ljw", 25);
        Student s2 = new Student("l", 26);
        Student s3 = new Student("j", 27);
        Student s4 = new Student("j", 27);

        hm.put(s1, "zq");
        hm.put(s2, "japan");
        hm.put(s3, "zq");
        hm.put(s4, "gd");

        hm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student t, String u) {
                System.out.println(t + " came from " + u);
            }
        });

        System.out.println("----------------------------------");
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key + " came from " + value);
        }

        System.out.println("------------------------------------");
        Set<Entry<Student, String>> entrySet = hm.entrySet();
        for (Entry<Student,String> es : entrySet) {
            Student key = es.getKey();
            String value = es.getValue();
            System.out.println(key+" came from "+ value);
        }
    }
}
