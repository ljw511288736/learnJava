package IntegerDemo;

import java.util.Scanner;

public class IntegerDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("请输入一个整数: ");
        // int i = sc.nextInt();
        // System.out.println(i);

        String line = sc.nextLine();
        System.out.println(line);
        int i = Integer.parseInt(line);
        System.out.println(i);
    }
}
