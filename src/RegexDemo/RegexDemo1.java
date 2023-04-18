package RegexDemo;
public class RegexDemo1 {
    public static void main(String[] args) {
        String RegexPhone = "((\\+|00)86)?1((3[\\d])|(4[5-79])|(5[0-35-9])|(6[5-7])|(7[0-8])|(8[\\d])|(9[1589]))\\d{8}";
        String PhoneNumber1 = "13415637178";
        String PhoneNumber2 = "13600223378";
        System.out.println(PhoneNumber1.matches(RegexPhone));
        System.out.println(PhoneNumber2.matches(RegexPhone));
    }
}