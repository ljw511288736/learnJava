package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        boolean r1 = set.add("ljw");
        boolean r2 = set.add("ljw");
        set.add("Skyrimlee");
        set.add("Skyrim1ee");

        // System.out.println(r1);
        // System.out.println(r2);//set不能添加重复元素
        // System.out.println(set);//set是无序的

        // 迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        // 增强for遍历
        for (String string : set) {
            System.out.println(string);
        }

        // lambda表达式遍历
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        // lambda表达式简化格式遍历
        set.forEach(str -> System.out.println(str));
    }
}
