package ntut.posd2024f.shapes;

public class Circle implements Shape {
    private double radian;
   

    public Circle(Double... args) throws ShapeException{
        if (args.length != 1)
            throw new ShapeException("It's not a circle!");
        radian = args[0];

    }

    public double area() {
        return radian * radian * 3.14;
    }

    public double perimeter() {
        return 2 * radian * 3.14;
    }
    
    @Override
    public void add(Shape s) {}
    
    @Override
    public NullIterator iterator() {
        return new ShapeIterator();
    }

    private class ShapeIterator implements NullIterator {
        public boolean hasNext() {return false;}
        public Shape next() {return null;}; 
    }



}
