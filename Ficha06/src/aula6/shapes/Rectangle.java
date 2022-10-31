package aula6.shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public  Rectangle(){
        this.position = new Point();
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(Point topLeftPoint, double height, double width){
        this.position = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getPosition() {
        return position;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public boolean containsPoint(Point point){
        boolean contains = false;
        Point bottomLeftPoint = new Point(position.getX(), position.getY() - height);
        Point bottomRightPoint = new Point(position.getX() + width, position.getY() - height);
        Point topRightPoint = new Point(position.getX() + width, position.getY());

        if (point.getX() > position.getX() && point.getX() < topRightPoint.getX()
                && point.getY() > bottomLeftPoint.getY() && point.getX() < position.getY()){
            contains = true;
        }

        return contains;
    }

    @Override
    public double perimeter() {
        return height+height+width+width;
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeftPoint=" + position +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
