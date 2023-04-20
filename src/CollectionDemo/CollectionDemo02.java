package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> Str = new ArrayList<>();
        Str.add(" 学");
        Str.add("习");
        Str.add("Java");
        // System.out.println(Str);

        Iterator<String> it = Str.iterator();
        boolean flag = true;
        while(flag){
            String str = it.next();
            System.out.print(str);
            flag = it.hasNext();
        }

        System.out.println("");

        Iterator<String> it2 = Str.iterator();
        it2.hasNext();
        it2.next();
        it2.remove();//在遍历过程中删除元素，需要使用迭代器
        System.out.println(Str);
    }
}
