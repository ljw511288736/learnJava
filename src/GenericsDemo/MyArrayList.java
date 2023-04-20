package GenericsDemo;

import java.util.Arrays;

/*
 * 当我在编写一个类的时候，如果不确定类型，那么这个类就可以定位为泛型类
 */
public class MyArrayList<E> {
    Object[] obj = new Object[100];
    int size;

    public boolean add(E e) {
        if (size >= 99) {
            return false;
        }
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

}
