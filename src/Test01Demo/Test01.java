package Test01Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList list = new ArrayList<>();
            boolean flag = true;
            int sum = 0;
            while(flag){
                String line = sc.nextLine();
                int num = Integer.parseInt(line);
                
                if(num < 1 || num > 100){
                    System.out.println("输入有误");
                    continue;
                }
                list.add(line);
                sum = sum + num;
                if(sum > 200){
                    flag = false;
                }
            }
            System.out.println(list);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
