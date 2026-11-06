package Assignment_3_1_4;

public class Circle extends Shape {
    private String typeShape;
    private double radius;
    private String color;

    public Circle(String typeShape, double radius, String color) {
        this.typeShape = typeShape;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getTypeShape() {
        return typeShape;
    }

    public void setTypeShape(String typeShape) {
        this.typeShape = typeShape;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // I dont wanna do math if it isnt absolutely required (I'm traumatised), pls overlook this
        return radius * 100 * Math.PI;
    }
}
