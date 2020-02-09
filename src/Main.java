import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle("blue", 1, 2),
                new Rectangle("red", 3, 4),
                new Rectangle("yellow", 5, 5.54),
                new Rectangle("green", 12, 23),
                new Circle("orange", 123),
                new Circle("coffe", 1),
                new Circle("black", 77),
                new Triangle("grey", 4, 5, 3),
                new Triangle("white", 12, 28, 32)};
        printShapes(shapes);
        System.out.println("Sum(areas) = " + calcShapesArea(shapes));
        System.out.println("Sum(areas of triangles) = " + calcShapesArea(shapes, Triangle.class.getSimpleName()));
        System.out.println("Sum(areas of circles) = " + calcShapesArea(shapes, Circle.class.getSimpleName()));
        System.out.println("Sum(areas of rectangles) = " + calcShapesArea(shapes, Rectangle.class.getSimpleName()));
    }

    private static void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println("\n" + shape + "\n --------\n area = " + shape.calcArea() + "\n");
        }
    }

    private static double calcShapesArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area = area + shape.calcArea();
        }
        return area;
    }

    private static double calcShapesArea(Shape[] shapes, String classNameOfShapeToCalculate) {
        double area = 0;
        for (Shape shape : shapes) {
            if (shape.getClass().getSimpleName().equals(classNameOfShapeToCalculate)) {
                area = area + shape.calcArea();
            }
        }
        return area;
    }
}
