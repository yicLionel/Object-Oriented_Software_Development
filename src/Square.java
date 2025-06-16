public class Square extends Shape{
    private double sideLength;

    public Square(double centerX, double centerY, double sideLength) {
        super(centerX,centerY);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double computeArea() {
        return Math.pow(sideLength, 2.0);
    }
}
