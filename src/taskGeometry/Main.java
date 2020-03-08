package taskGeometry;

public class Main {

    public static void main(String[] args) {
        Figyra[] figyra = {new Rectangle(9, 9), /** Прямоулогьник, квадрат*/
                new Triangle(9, 8, 5),
                new Circle(10)};

        for(Figyra figyrs : figyra)
            System.out.println(" площадь " + figyrs.getName()+ " = " + figyrs.getArea());
    }
}
