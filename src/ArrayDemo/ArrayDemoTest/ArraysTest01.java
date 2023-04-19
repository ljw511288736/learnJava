package ArrayDemo.ArrayDemoTest;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest01 {
    public static void main(String[] args) {
        Friend f1 = new Friend("ljw", 27, 1.81);
        Friend f2 = new Friend("skyrim", 26, 1.8);
        Friend f3 = new Friend("lee", 25, 1.76);
        Friend f4 = new Friend("Skyrim1ee", 25, 1.72);
        Friend f5 = new Friend("Skyrimlee", 26, 1.8);

        Friend[] friends = { f1, f2, f3, f4, f5 };
        // Arrays.sort(friends, new Comparator<Friend>() {
        // public int compare(Friend o1, Friend o2) {
        // double temp = o1.getAge() - o2.getAge();
        // temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
        // temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
        // if(temp > 0){
        // return 1;
        // }else if(temp <0){
        // return -1;
        // }else{
        // return 0;
        // }
        // };
        // });

        Arrays.sort(friends, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i].toString());
        }
    }
}