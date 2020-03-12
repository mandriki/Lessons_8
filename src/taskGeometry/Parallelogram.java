package taskGeometry;

public class Parallelogram implements Figyra {
    private static final String NAME = "Параллелограмм";

    private double side;
    private double height;

    public Parallelogram(double side, double height) {
        this.side = side;
        this.height = height;
    }
    @Override
    public String getArea() {
        return side * height + " - Площадь"; }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSide() { return side; }
    public double getHeight() {return height; }
}

