public class Main {
    public static void main(String[] args) {
        Point p0 = new Point(2,3);
        Rectangle p1 = new Rectangle(new Point(0,0),4,5);
        System.out.print(p1.getTopLeftPoint());
    }
}