package ArrayDemo.ArrayDemoTest;

public class ArraysTest04 {
    public static void main(String[] args) {
        System.out.println(methodNumber(7));
        System.out.println(methodNumber(20));
        System.out.println(methodNumber(19));
        System.out.println(methodNumber(18));
    }

    public static int methodNumber(int step) {
        if (step == 0) {
            return 0;
        } else if (step == 1) {
            return 1;
        } else if (step == 2) {
            return 2;
        } else {
            return methodNumber(step - 1) + methodNumber(step - 2);
        }
    }
}
