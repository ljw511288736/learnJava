package CollectionDemo.SetDemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo01 {
    public static void main(String[] args) {

        //可排序、不重复、无索引
        //对于数值类型: Integer、Double,默认按照从小到大的顺序进行排序
        //对于字符、字符串类型:按照字符在ASCII码表中的数字升序进行排序
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(2);
        ts.add(4);

        System.out.println(ts);

        // 迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer str = it.next();
            System.out.println(str);
        }

        // 增强for遍历
        for (Integer i : ts) {
            System.out.println(i);
        }

        // lambda表达式遍历
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        // lambda表达式遍历 简化版
        ts.forEach(i -> System.out.println(i));
    }
}
