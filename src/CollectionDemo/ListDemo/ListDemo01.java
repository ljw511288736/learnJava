package CollectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        /*
         * void add(int index,E element) 在指定位置插入指定元素
         * E remove(int index) 删除指定索引处的元素，返回被删除的元素
         * E set(int index,E element) 修改指定所引出的元素，返回被修改的元素
         * E get(int index) 返回指定索引的元素
         */

        List<String> list = new ArrayList<>();
        list.add("ljw");
        list.add("skyrim");
        list.add("Skyrim1ee");

        System.out.println(list);

        list.add(2, "Skyrimlee");
        System.out.println(list);

        String remove_str = list.remove(1);
        System.out.println(remove_str);
        System.out.println(list);

        String set_str = list.set(0, "Cow");
        System.out.println(set_str);
        System.out.println(list);

        String str = list.get(2);
        System.out.println(str);
    }

}
