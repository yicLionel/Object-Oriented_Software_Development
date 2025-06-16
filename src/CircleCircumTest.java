public class CircleCircumTest{
    public static void main(String[] args) {

        //constructor without parameter
        Circle circle1 = new Circle();
        System.out.println("Defined circle 1 with center (" + circle1.getCenterX() +
                ',' + circle1.getCenterY() + ") and radius " + circle1.radius);

        //constructor with parameter
        Circle circle2 = new Circle(10.0,20.0,12.2);
        System.out.println("Defined circle 2 with center (" + circle2.getCenterX() +
                ',' + circle2.getCenterY() + ") and radius " + circle2.radius);

    }
}
