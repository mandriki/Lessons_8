package taskGeometry;

public  class Circle implements Figyra {
    private static final String NAME1 = "Круг";
    private static final String NAME2 = "Эллипс";
    private  double radius1;
    private  double radius2;

    public Circle(double radius, double radius1) {
        this.radius1 = radius;
        this.radius2 = radius1;
    }
    @Override
    public String getArea(){
       return  Math.PI * radius1 * radius2 + " -Площадь";
    }
    @Override
    public String getName() {
        if (radius1 == radius2){return NAME1;}
        else {return  NAME2;}
    }
    public double getRadius1() { return radius1;}
    public double getRadius2() { return radius2;}
 }
