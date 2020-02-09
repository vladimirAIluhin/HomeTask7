package shapes;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;


    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private double halfPerimeter() {
        return (a + b + c) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n a = " + a +
                "\n b = " + b +
                "\n c = " + c;
    }

    @Override
    public double calcArea() {
        double p = halfPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
