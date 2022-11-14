import testCollections.Point.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> arrayList= new ArrayList<Point>();

        arrayList.add(new Point());
        arrayList.add(new Point(10,10));
        arrayList.add(new Point(11,11));
        arrayList.add(new Point(12,12));

        Point element = arrayList.get(2);

        arrayList.remove(0);

        for(int i = 0;i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        Stack<String> stack = new Stack<String>();

        stack.push("Hello");
        String str = stack.pop();

        HashMap<String, Point> map = new HashMap<String, Point>();

        map.put("Point1", new Point());
        map.put("Point2", new Point(10,10));

        Point pm = map.get("Point2");

    }
    ////// Comparable ///
    //
    //implements
    //- compare to
    // - o (==), >o (a>b), <o (a<b)
    //
    //comparação por omissão de um tipo

    // // Comparator //
    //
    //implements
    //-compare
    // - o (==), >o (a>b), <o (a<b)
    //
    //forma adicional de comparação
}