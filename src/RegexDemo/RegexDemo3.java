package RegexDemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //a123a b123b c123c a123b
        // String regex1 = "(.).+\\1";
        // System.out.println("a123a".matches(regex1));
        // System.out.println("b123b".matches(regex1));
        // System.out.println("c123c".matches(regex1));
        // System.out.println("a123b".matches(regex1));

        // //aaa123aaa bbb123bbb ccc123ccc abc123abc
        // String regex2 = "(.+).+\\1";
        // System.out.println("aaa123aaa".matches(regex2));
        // System.out.println("bbb123bbb".matches(regex2));
        // System.out.println("ccc123ccc".matches(regex2));
        // System.out.println("aaa123abc".matches(regex2));

        //我要学学学学学编编编编编编编程程程程程程程程程程程程程程程;
        String regex3 = "(.)\\1+";
        String result = "我要学学学学学编编编编编编编程程程程程程程程程程程程程程程".replaceAll(regex3, "$1");
        System.out.println(result);
        //System.out.println("我要学学学学学编编编编编编编程程程程程程程程程程程程程程程".matches(regex3));

    }
}
