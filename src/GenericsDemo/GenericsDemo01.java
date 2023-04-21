package GenericsDemo;

import java.util.ArrayList;

public class GenericsDemo01 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        ListUtil.addAll(al1, "ljw", "skyrim", "Skyrimlee", "Skyrim1ee");
        System.out.println(al1);

        ArrayList<Integer> al2 = new ArrayList<>();
        ListUtil.addAll(al2, 1, 2, 3, 4);
        System.out.println(al2);
    }
}
