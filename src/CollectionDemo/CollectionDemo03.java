package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> strarr = new ArrayList<>();
        strarr.add("ljw");
        strarr.add("skyrim");
        strarr.add("Skyrim1ee");

        // 1、利用增强for进行遍历
        // str是一个第三方变量，依次表示循环里的每一个元素
        for (String str : strarr) {
            System.out.println(str);
        }

        // 2、①利用lambda表达式遍历(利用匿名内部类的形式)
        strarr.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            };
        });

        // ②省略格式
        strarr.forEach((String s) -> {
            System.out.println(s);
        });

        // ③省略格式2
        strarr.forEach(s -> System.out.println(s));
    }
}
