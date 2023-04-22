package GenericsDemo.GenericsTestDemo;

import java.util.ArrayList;

public class GenericsTestDemo {
    public static void main(String[] args) {
        
    }

    public static void keepCatPet(ArrayList<? extends Cat> list){}

    public static void keepDogPet(ArrayList<? extends Dog> list){}

    public static void keepPet(ArrayList<? extends Animal> list){}

}
