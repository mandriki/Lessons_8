package taskGeometry;

public class Rhombus implements Figyra{
    private static String NAME = "Ромб";
    private double diagonal;
    private double diagonal2;

    public Rhombus(double diagonal, double diagonal2) {
        this.diagonal = diagonal;
        this.diagonal2 = diagonal2;
    }
    @Override
    public String getArea() {
        return (diagonal * diagonal2)/2 + " - Площадь"; }
    @Override
    public String getName() {
        if (diagonal == diagonal2) {
            NAME = " Квадрат";
        }
        return NAME;
    }
    public double getDiagonal() {return diagonal; }
    public double getDiagonal2() {return diagonal2; }
}

