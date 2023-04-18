package ArrayDemo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // method(new Swim() {
        //     @Override
        //     public void Swimming() {
        //         System.out.println("我在游泳");
        //     }
        // });
        method(
            () -> {
                System.out.println("我在游泳");
            }
        );

    }

    public static void method(Swim s){
        s.Swimming();
    }

}

interface Swim{
    public abstract void Swimming();
}
