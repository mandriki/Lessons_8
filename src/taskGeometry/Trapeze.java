package taskGeometry;

public class Trapeze implements Figyra {
    private static final String NAME = "Трапеция";

    private double prallelSide_A;
    private double prallelSide_B;
    private double heighth;

    public Trapeze(double prallelSide_A, double prallelSide_B, double heighth) {
        this.prallelSide_A = prallelSide_A;
        this.prallelSide_B = prallelSide_B;
        this.heighth = heighth;
    }
    @Override
    public double getArea() {
       return  (prallelSide_A + prallelSide_B)* heighth / 2;
    }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSideA() {
        return prallelSide_A;
    }
    public void setSideA(double A) {
        this.prallelSide_A = prallelSide_A;
    }
    public double getSideB() {
        return prallelSide_B;
    }
    public void setSideB(double B) {
        this.prallelSide_B = prallelSide_B;
    }
    public double getSideC() {
        return heighth;
    }
    public void setSideC(double C) {
        this.heighth = heighth;
    }
}
