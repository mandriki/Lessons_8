package taskGeometry;

public class Circle extends Figyra {
    private static final String NAME = "Круг";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return  Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
