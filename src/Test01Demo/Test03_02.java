package Test01Demo;

public class Test03_02 {
    public static void main(String[] args) {
        String binaryString = toBinaryString(6);
        System.out.println(binaryString);
    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            if (number == 0) {
                break;
            }
            int remaindar = number % 2;
            sb.append(remaindar);
            number = number / 2;
        }
        return sb.reverse().toString();
    }
}
