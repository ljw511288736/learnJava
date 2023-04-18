package Test01Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                System.out.println("请输入一个整数：");
                String numstr = sc.nextLine();
                int num = Integer.parseInt(numstr);
                if(num < 1 || num > 100){
                    System.out.println("输入有误");
                    continue;
                }
                list.add(num);
                int sum = getSum(list);
                if(sum > 200){
                    System.out.println("集合所有数据和已超过200");
                    break;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(list);
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    
}
