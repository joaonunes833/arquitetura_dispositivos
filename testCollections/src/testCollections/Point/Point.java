package testCollections.Point;

public class Point implements Comparable<Point>{
    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }
    public Point(final double x,
                 final double y) {
        this.y = y;
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(int value) {
        x = value;
    }
    public void setY(int value) {
        y = value;
    }

    public double distanceTo(Point other){
        double distance = 0;
        distance = Math.sqrt(Math.pow(other.x - this.x,2)+Math.pow(other.x - this.x,2));
        return distance;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o){
        Point other = (Point) o;
        if (this.x == other.x && this.y == other.y)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Point o){
        //crescente
        int diff = (int)((this.x - o.x) + (this.y - o.y));
        //decrescente
        //int diff = (int)((o.x - this.x ) + (o.y - this.y));
        return diff;
    }
}
