public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
    }
    public Triangle(final Point a, final Point b, final Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }
    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }
    public void setB(Point b) { this.b = b; }
    public void setC(Point c) { this.c = c; }


    public double compBase(){
        return a.distanceTo(b);
    }
    public double compAlt(){
        return a.distanceTo(c);
    }
    public double areaTr(){
        return (compBase()*compAlt())/2;
    }
}
