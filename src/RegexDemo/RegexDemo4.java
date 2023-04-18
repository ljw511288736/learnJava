package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        String str = "来黑马程序员学习Java," +
                "电话:18512516758,18512508907" +
                "或者联系邮箱:boniu@itcast.cn," +
                "座机电话:01036517895,010-98951256" +
                "邮箱:bozai@itcast.cn," +
                "热线电话:400-618-9090 , 400-618-4000, 4006184000,4006189090";

        String PhoneRegex = "((\\+|00)86)?1((3[\\d])|(4[5-79])|(5[0-35-9])|(6[5-7])|(7[0-8])|(8[\\d])|(9[1589]))\\d{8}";
        String EmailRegex = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        String HomePhoneRegex = "0\\d{2,3}-?[1-9]\\d{4,9}";
        String HotPhoneRegex = "400-?[1-9]\\d{2}-?[1-9]\\d{3}";

        Pattern p = Pattern.compile(HotPhoneRegex);
        Matcher m = p.matcher(str);
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
