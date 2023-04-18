package IntegerDemo;

public class IntegerDemo2 {
    public static void main(String[] args) {
        String s1 = Integer.toBinaryString(100);
        String s2 = Integer.toOctalString(100);
        String s3 = Integer.toHexString(100);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "123";
        int i = Integer.parseInt(s4) + 123;
        System.out.println(i);
    }
}
