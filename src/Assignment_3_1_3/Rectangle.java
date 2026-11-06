package Assignment_3_1_3;

public class Rectangle extends Shape{
    private String typeShape = "Rectangle";
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.color = color;
        this.width = width;
        this.height = height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
