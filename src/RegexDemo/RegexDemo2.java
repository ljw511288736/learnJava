package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11,因为这两个是长期支持版本,"+ 
                "下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台。";
        // extracted(str);
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        while(m.find()){
            String group = m.group();
            System.out.println(group);
        }
    }

    private static void extracted(String str) {
        String regexstr = "Java\\d{0,2}";
        // m:文本匹配器的对象
        // str:要匹配的字符串
        // p:规则
        // regexstr：正则表达式
        // 获取正则表达式的对象
        Pattern p = Pattern.compile(regexstr);
        // 获取文本匹配器的对象
        Matcher m = p.matcher(str);
        boolean b = m.find();
        String s1 = m.group();
        System.out.println(s1);
        // b = m.find();
        // String s2 = m.group();
        // System.out.println(s2);
    }
}
