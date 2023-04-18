package Test01Demo;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            if(!str.matches("[1-9]\\d{0,9}")){
                System.out.println("数据有误 ");
            }else{
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    int number = str.charAt(i) - 48;
                    sum = sum*10 + number;
                }
                System.out.println(sum);
            }
        }
    }
}
