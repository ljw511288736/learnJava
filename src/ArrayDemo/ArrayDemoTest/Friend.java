package ArrayDemo.ArrayDemoTest;

public class Friend {
    private String name;
    private int age;
    private double height;
    public Friend(){}
    
    public Friend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Friend [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
    
}
