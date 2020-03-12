package taskGeometry;

public  class Trapeze implements Figyra {
    private static final String NAME = "Трапеция";

    private double prallelSide_A;
    private double prallelSide_B;
    private double height;

    public Trapeze(double prallelSide_A, double prallelSide_B, double heighth) {
        this.prallelSide_A = prallelSide_A;
        this.prallelSide_B = prallelSide_B;
        this.height = heighth;
    }
    @Override
    public String getArea() {
       return (prallelSide_A + prallelSide_B)* height / 2 + " -Площадь ";
    }
    @Override
    public String getName() {
        return NAME;
    }
    public double getSideA() {
        return prallelSide_A;
    }
    public double getSideB() {
        return prallelSide_B;
    }
    public double getSideC() {
        return height;
    }

}
