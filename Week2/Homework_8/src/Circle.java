public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double pi = 3.14;
        return pi * (this.radius * this.radius);

    }

    public double getPerimeter() {
        double pi = 3.14;
        return pi * this.radius ;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Circle " + "\n" + "radius = " + radius +
                "\n" + "Area = " + getArea() +
                "\n" +
                "Perimeter = " + getPerimeter();
    }
}
