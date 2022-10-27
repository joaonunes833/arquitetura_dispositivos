public class Point {
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


}
