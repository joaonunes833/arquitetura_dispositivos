public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;

    public  Rectangle(){
        this.topLeftPoint = new Point();
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(Point topLeftPoint, double height, double width){
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double areaRect(){
        return height*width;
    }

    public double perimeter(){
        return height+height+width+width;
    }

    public boolean containsPoint(Point point){
        boolean contains = false;
        Point bottomLeftPoint = new Point(topLeftPoint.getX(), topLeftPoint.getY() - height);
        Point bottomRightPoint = new Point(topLeftPoint.getX() + width, topLeftPoint.getY() - height);
        Point topRightPoint = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());

        if (point.getX() > topLeftPoint.getX() && point.getX() < topRightPoint.getX()
                && point.getY() > bottomLeftPoint.getY() && point.getX() < topLeftPoint.getY()){
            contains = true;
        }

        return contains;
    }
}
