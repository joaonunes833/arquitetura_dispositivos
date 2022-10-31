import aula6.shapes.*;
import aula6.vehicles.Car;
import aula6.vehicles.Vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle v1 = new Car();
        Car c2 = new Car(1997,"Ford","Mondeo",10000,"Black",3);
        System.out.println(c2.toString());
        c2.drive();
        Triangle tr = new Triangle(new Point(0,0),new Point(3,0),new Point(0,3));
        Rectangle rt = new Rectangle(new Point(0,0),100,100);

        Figure figure = new Figure();
        figure.add(tr);
        figure.add(rt);

        ArrayList<Point> points = new ArrayList<Point>();

        for (Shape shape : figure.getShapes()){
            double area = shape.area();
            double perimeter = shape.perimeter();

            System.out.println(shape.toString());
            System.out.println("\t Area: " + area + ", Perimeter: " + perimeter);
        }
    }
}