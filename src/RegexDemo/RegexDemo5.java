package RegexDemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        String RegexUsername = "\\w{4,16}";
        String RegexIdentityCard = "[1-9]\\d{16}(\\d|(?i)x)";

        //身份证号码的严格校验
        //前6位:[1-9]\\d{5}
        //年的前半段: 18 19 20 (18|19|20)
        //年的后半段: \\d{2}
        //月: (0[1-9]|1[0-2])
        //日: 0[1-9]|[12]\\d|3[01]
        //后4位: \\d{3}[\\d(?i)x]
        String RegexIDCard = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\d(?i)x]";
        String idcard = "441202199710312015";
        System.out.println(idcard.matches(RegexIDCard));
    }
}
