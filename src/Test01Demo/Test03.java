package Test01Demo;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numstr = sc.nextLine();
            int i = Integer.parseInt(numstr);
            int quotient = i / 2;
            int rem = i % 2;
            StringBuilder sb = new StringBuilder();
            sb.append(rem);
            while (quotient != 0) {
                rem = quotient % 2;
                sb.append(rem);
                quotient = quotient / 2;
            }
            String str = sb.reverse().toString();
            System.out.println(str);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
