public class Circle {
    public double centerX;
    public double centerY;
    public double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }



    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }



    public double computeCircumference(){
        double circum = 2 * Math.PI * radius;
        return circum;
    }
    public double computeArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    public void resize(double factor){
        radius = radius * factor;
    }

    public static int numCircles = 0;

    //constructor without parameters
    public Circle(){
        this.centerX = 10.0;
        this.centerY = 10.0;
        this.radius = 5.0;
    }

    //constructor with parameters
    public Circle(double x, double y, double r){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        numCircles++;
    }

    public static void printNumCircles() {
        System.out.println("Num of circles: " + numCircles);
    }
}
