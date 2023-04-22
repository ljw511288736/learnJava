package GenericsDemo;

import java.util.ArrayList;

public class GenericsDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "ljw", "skyrim", "Skyrimlee", "Skyrim1ee");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll2(list2, 1, 2, 3, 4);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        ListUtil.addAll2(list3, 123,1,444,678,987);
        System.out.println(list3);
    }
}
