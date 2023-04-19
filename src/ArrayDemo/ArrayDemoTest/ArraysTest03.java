package ArrayDemo.ArrayDemoTest;

public class ArraysTest03 {
    public static void main(String[] args) {
        System.out.println(peach_num(1));
    }

    public static int peach_num(int day) {
        if (day <= 0 || day >= 11) {
            return -1;
        }
        if (day == 10) {
            return 1;
        } else {
            return 2 * (peach_num(day + 1) + 1);
        }

    }
}
