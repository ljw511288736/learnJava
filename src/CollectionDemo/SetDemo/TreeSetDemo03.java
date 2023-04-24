package CollectionDemo.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        String s1 = "c";
        String s2 = "ab";
        String s3 = "df";
        String s4 = "qwer";

        // TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
        // @Override
        // public int compare(String o1, String o2) {
        // int i = o1.length() - o2.length();
        // i = i == 0 ? o1.compareTo(o2) : i;
        // return i;
        // }
        // });

        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        // 因为String类中已经重写了compareTo方法，因此需要用比较器排序重新排序

        System.out.println(ts);
    }
}
