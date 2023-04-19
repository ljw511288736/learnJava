package ArrayDemo.ArrayDemoTest;

public class ArraysTest02 {
    public static void main(String[] args) {
        /*
         * 不死神兔问题，有一对兔子，从出生第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
         * 假如兔子都不是，问第十二个月的兔子对数为多少
         * 1月：1
         * 2月：1
         * 3月：2
         * 4月：3
         * 5月：5
         * 6月：8
         */
        System.out.println(rabbit_num(12));
        System.out.println(sum(12));

    }

    // 递归的方法
    public static int rabbit_num(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return rabbit_num(month - 1) + rabbit_num(month - 2);
        }
    }

    // 数组求和
    public static int sum(int x) {
        if (x < 2) {
            return 1;
        }
        int[] arr = new int[x];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[x - 1];
    }
}
