package Assignment_3_1_4;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle", 5.0, "green"),
                new Rectangle(4.0, 6.0, "blue"),
                new Triangle(3.0, 8.0, "red")
        };

        System.out.println("Shape Calculator");
        System.out.println();

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getColor() + " " + shape.getTypeShape() + ": " + shape.calculateArea());
//        System.out.println(shape.calculateArea());
        }
    }
}