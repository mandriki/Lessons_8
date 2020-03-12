package taskGeometry;

public  class Triangle implements Figyra {
    private static final String NAME = "Треугольник";
    private double A;
    private double B;
    private double C;
    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    @Override
    public String getArea() {
        double p = (A + B + C) / 2; // полупериметр триугольника
        return  Math.sqrt(p * (p - A) * (p - B) * (p - C))+ " -Площадь"; //  Герон
    }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSideA() {
        return A;
    }
    public double getSideB() {
        return B;
    }
    public double getSideC() {
        return C;
    }

}
