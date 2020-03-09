package taskGeometry;

public class Main {

    public static void main(String[] args) {
        Figyra[] figyra = new Figyra[]{new Rectangle(10, 9), /** Прямоулогьник, квадрат*/
                new Triangle(9, 8, 8), /**Стороны треугольника**/
                new Circle(9,9), /**Эллипс, круг*/
                new Trapeze(6, 9, 7)};

        for(Figyra figyrs : figyra)
            System.out.println(" площадь " + figyrs.getName()+ " = " + figyrs.getArea());
    }
}
