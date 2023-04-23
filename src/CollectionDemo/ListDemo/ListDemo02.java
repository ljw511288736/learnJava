package CollectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ljw");
        list.add("skyrim");
        list.add("Skyrim1ee");

        //列表迭代器遍历
        ListIterator<String> it = list.listIterator();
        boolean flag = true;
        while(flag){
            String str_next = it.next();
            if("skyrim".equals(str_next)){
                it.add("skyrimlee");//利用列表迭代器的add方法，可以在遍历过程中添加元素
            }
            System.out.println(str_next);
            flag = it.hasNext();
        }
        System.out.println(list);
    }
}
