public abstract class Shape {
    private double x;
    private double y;

    public Shape(double centerX, double centerY) {
        this.x = centerX;
        this.y = centerY;
    }


    public abstract double computeArea();
}
