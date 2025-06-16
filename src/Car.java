public class Car extends test{
    protected void drive() {
        System.out.println("drive method in car class");
    }

    public static void main(String[] args) {
        test v = new Car();
        //v.drive();
    }
}
