package CollectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01_DelectDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //[1,3]
        //如果方法出现了重载现象
        //优先调用，实参和形参类型一致的那个方法
        list.remove(1);
        System.out.println(list);

        //[2,3]
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);

    }
}
