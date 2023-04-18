package ArrayDemo;

import java.util.Arrays;

// Lambda表达式可以用来简化匿名内部类的书写
//Lambda表达式只能简化函数式接口的匿名内部类的写法
public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
        Arrays.sort(arr, (Integer o1, Integer o2) ->{//lambda表达式
                return o1 - o2;
            }
        );
    }
}
