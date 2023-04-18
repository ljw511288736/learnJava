package ArrayDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {
    public static void main(String[] args) {
        //重写排序规则
        Integer[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
        //因为只能排序引用类似的数字，所以要用Integer型
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1 - o2;
            }
        });
    }
}
