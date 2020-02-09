package shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + "\n width = " + width +
                "\n height = " + height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }
}
