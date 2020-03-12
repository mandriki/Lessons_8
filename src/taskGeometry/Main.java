package taskGeometry;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Figyra[] figyra = {new Rectangle( 9,9),/** Прямоулогьник, квадрат*/
                new Triangle(9, 8, 8), /**Стороны треугольника*/
                new Circle(9,9), /**Эллипс, круг*/
                new Trapeze(6, 9, 7),/**Параллелограмм*/
                new Parallelogram(9,9),/**Параллелограмм*/
                new Rhombus(9,10)/**Ромб, Квадрат*/};

        for(Figyra figyrs : figyra)
            System.out.println(" Это " + figyrs.getName()+ " = " + figyrs.getArea());

        System.out.println(figyra[0] instanceof Rectangle);
        System.out.println(figyra[1] instanceof Triangle);
        System.out.println(figyra[2] instanceof Circle);
        System.out.println(figyra[3] instanceof Trapeze);
        System.out.println(figyra[4] instanceof Circle);
        System.out.println(figyra[4] instanceof Parallelogram);
        System.out.println(figyra[5] instanceof Rhombus);
        System.out.println(figyra[1] instanceof Circle);

    }
}
