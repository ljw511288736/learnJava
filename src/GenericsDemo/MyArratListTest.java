package GenericsDemo;

public class MyArratListTest {
    public static void main(String[] args) {
        MyArrayList<String> mal = new MyArrayList<>();
        mal.add("ljw");
        mal.add("Skyrim1ee");
        mal.add("Skyrimlee");
        String string = mal.get(0);
        System.out.println(string);
        System.out.println(mal);
    }
}
