package aula6.shapes;

public abstract class Shape {
    protected Point position;

    public Shape(){
        this.position = new Point();
    }

    public Shape(int x, int y){
        this.position = new Point(x, y);
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "position=" + position +
                '}';
    }
}
