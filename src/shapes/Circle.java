package shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() + " radius =" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

}
