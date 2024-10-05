package ntut.posd2024f.shapes;

import java.util.Iterator;

public interface Shape {
    public double area();
    public double perimeter();
    public void add(Shape s) throws ShapeException;
    
    public Iterator<Shape> iterator();

    
}
