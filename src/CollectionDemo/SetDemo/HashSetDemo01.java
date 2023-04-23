package CollectionDemo.SetDemo;

public class HashSetDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("ljw", 26);
        Student s2 = new Student("ljw", 26);

        //如果没有重写hashcode方法，不同对象计算出来的哈希值是不同的
        //如果重写了hashcode方法，不同对象属性相同计算出来的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
