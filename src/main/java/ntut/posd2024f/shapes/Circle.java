package ntut.posd2024f.shapes;

import java.util.ArrayList;
import java.util.Iterator;

public class Circle implements Shape {
    private double radian;
   

    public Circle(double args) throws ShapeException{
        if (args < 0)
            throw new ShapeException("It's not a circle!");
        radian = args;
    }




    public Circle(ArrayList<Double> args) throws ShapeException{
        if (args.size() !=  1)
            throw new ShapeException("It's not a circle!");
        radian = args.get(0);

        

    }
    
    @Override
    public double area() {
        return radian * radian * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * radian * 3.14;
    }
    
    @Override
    public void add(Shape s) throws ShapeException {
        throw new ShapeException("Illegal Operation");
    }
    
    @Override
    public Iterator<Shape> iterator() {
        return new NullIterator();
    }

}
