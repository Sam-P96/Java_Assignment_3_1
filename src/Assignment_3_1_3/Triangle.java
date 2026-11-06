package Assignment_3_1_3;

public class Triangle extends Shape {
    private String typeShape;
    private double width;
    private double height;
    private String color;

    public Triangle(double height, double width, String color) {
        this.typeShape = "Triangle";
        this.width = width;
        this.height = height;
        this.color = color;
    }


    @Override
    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getTypeShape() {
        return typeShape;
    }

    public void setTypeShape(String typeShape) {
        this.typeShape = typeShape;
    }

    @Override
    public double calculateArea() {
        return (this.width * this.height) / 2;
    }
}
