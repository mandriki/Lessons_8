package taskGeometry;

public class Rectangle extends Figyra {
    private static final String NAME1 = "Прямоугольник";
    private static final String NAME2 = "Квадрат";
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        if (width == height){
            return width * width;
        }
        else
        return width * height;
    }
    @Override
    public String getName() {
        if (width == height){
            return NAME2;
        }
        return NAME1;
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
}