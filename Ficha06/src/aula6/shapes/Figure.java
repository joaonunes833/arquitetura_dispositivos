package aula6.shapes;

import java.util.ArrayList;

public class Figure {
    private ArrayList<Shape> shapes;

    public Figure(){
        this.shapes = new ArrayList<Shape>();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void add(Shape shape){
        this.shapes.add(shape);
    }
}
