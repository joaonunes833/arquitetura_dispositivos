package aula6.shapes;
public class Triangle extends Shape{
    private Point b;
    private Point c;

    public Triangle() {
        position = new Point();
        b = new Point();
        c = new Point();
    }
    public Triangle(final Point a, final Point b, final Point c) {
        position = a;
        this.b = b;
        this.c = c;
    }

    public Point getPosition() {
        return position;
    }
    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }

    public void setPosition(Point a) {
        this.position = a;
    }
    public void setB(Point b) { this.b = b; }
    public void setC(Point c) { this.c = c; }


    public double compBase(){
        return position.distanceTo(b);
    }
    public double compAlt(){
        return position.distanceTo(c);
    }

    @Override
    public double area() {
        return (compBase()*compAlt())/2;
    }

    @Override
    public double perimeter() {
        return (position.distanceTo(b) + b.distanceTo(c) + c.distanceTo(position));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + position +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
