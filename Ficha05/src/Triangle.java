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

    public void setA(Point value) {
        a = value;
    }
    public void setB(Point value) { b = value; }
    public void setC(Point value) { c = value; }


    /*public double areaTriangle(){
        double areaTriangleA = this
    }*/
}
