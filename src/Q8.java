class Parent {
    public static void main(String[] args) {
        System.out.println("I am Parent");
        System.out.println("111");
    }
}
class Child extends Parent {
    public static void main(String[] args) {
        System.out.println("I am Child");
    }
}
public class Q8 {
    public static void main(String[] args) {
        Parent.main(args);
        Child.main(args);
        System.out.println("111");
    }
}