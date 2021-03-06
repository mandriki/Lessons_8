package taskGeometry;

public  class Rectangle implements Figyra {
    private static final String NAME1 = "Прямоугольник";
    private static final String NAME2 = "Квадрат";
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String getArea() {
        return width * height + " -Площадь"; }
    @Override
    public String getName() {
        if (width == height){
            return NAME2;
        }
        return NAME1;
    }
    public double getWidth() { return width; }
    public double getHeight() {return height; }
   }