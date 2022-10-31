package aula6.shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        position = new Point();
        this.radius = 0.0;
    }

    public Circle(Point a, double radius){
        position = a;
        this.radius = radius;
    }

    @Override
    public Point getPosition() {
        return super.getPosition();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void setPosition(Point position) {
        super.setPosition(position);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = 3.14 * Math.pow(radius,2);
        return area;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Center point=" + position +
                ", radius=" + radius +
                '}';
    }
}
