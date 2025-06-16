public class TestAbstract {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Square(0, 0, 2);
        s[1] = new Square(0,0,3);
        s[2] = new Square(0,0,4);
        computeShapeArea(s);
    }

    public static void computeShapeArea(Shape[] shapes) {
        for (Shape s:shapes) {
            System.out.println("Area = " + s.computeArea());
        }
    }
}
