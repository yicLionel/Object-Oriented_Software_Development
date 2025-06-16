public class CircleTest{
    public static void main(String[] args) {
        Circle circleA = new Circle();
        double area;

        circleA.centerX = 4.0;
        circleA.radius = 2.0;
        area = circleA.computeArea();
        System.out.println("Area = " + area);
        System.out.println("Radius = " + circleA.radius);
        System.out.println("Circumference = " + circleA.computeCircumference());

        System.out.println("------------------");
        Circle circleB = new Circle(12.0,2.0,4.0);
        System.out.println("Area = " + circleB.computeArea());
        System.out.println("Radius = " + circleB.radius);
        System.out.println("Circumference = " + circleB.computeCircumference());
    }
}