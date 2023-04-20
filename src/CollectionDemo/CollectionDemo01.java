package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        /*
            public boolean add(E e)             添加
            public void clear()                 清空
            public boolean remove(E e)          删除
            public boolean contains(Object obj) 判断是否包含
            public boolean isEmpty()            判断集合是否为空    
            public int size()                   集合长度
        */ 

        Collection<String> col = new ArrayList<>();
        col.add("ljw");
        col.add("skyrim");
        col.add("Skyrim1ee");

        //col.clear();

        col.remove("ljw");//因为Collection里面定义的是共性的方法（List，Set），所以此时不用通过索引去删除，只能通过元素的对象进行删除

        col.contains("skyrim");//底层是依赖equals方法进行判断是否存在的，所以如果存储的是自定义对象，一定要重写equals方法

        col.isEmpty();

        col.size();
    }
}
