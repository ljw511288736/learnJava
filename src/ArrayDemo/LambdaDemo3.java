package ArrayDemo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        String[] str_arr = { "a", "aaa", "aa", "aaaa" };
        // Arrays.sort(str_arr, new Comparator<String>() {
        //     public int compare(String o1, String o2) {
        //         return o1.length() - o2.length();
        //     };
        // });

        Arrays.sort(str_arr, (String o1, String o2) -> {
                return o1.length() - o2.length();
        });

        Arrays.sort(str_arr, ( o1, o2) -> {
            return o1.length() - o2.length();
        });

        Arrays.sort(str_arr, ( o1, o2) -> o1.length() - o2.length());
    
        System.out.println(Arrays.toString(str_arr));
    }
}
