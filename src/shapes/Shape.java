package shapes;

public class Shape {
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return " Class = " + this.getClass().getSimpleName() +
                "\n color = " + color;
    }

    public double calcArea(){
        return 0.0;
    }

}
