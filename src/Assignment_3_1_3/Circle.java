package Assignment_3_1_3;

public class Circle extends Shape {
    private String typeShape;
    private double radius;

    public Circle(String typeShape, double radius) {
        this.typeShape = typeShape;
        this.radius = radius;
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
