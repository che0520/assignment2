package ntut.posd2024f.shapes;

public class Rectangle implements Shape {
    private double edge1, edge2;
   

    public Rectangle(Double... args) throws ShapeException{
        if (args.length != 1)
            throw new ShapeException("It's not a rectangle!");
        edge1 = args[0];
        edge2 = args[1];

    }

    public double area() {
        return edge1 * edge2;
    }

    public double perimeter() {
        return 2 * (edge1 + edge2);
    }

    @Override
    public void add(Shape s) throws ShapeException {
        throw new ShapeException("Illegal Operaton");
    }

    @Override
    public NullIterator iterator() {
        return new NullIterator();
    }

    private class ShapeIterator implements NullIterator {
        public boolean hasNext() {return false;}
        public Shape next() {return null;}; 
    }
}
