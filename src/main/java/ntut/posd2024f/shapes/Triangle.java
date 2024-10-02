package ntut.posd2024f.shapes;

public class Triangle implements Shape {
    private double s1, s2, s3;
    private TwoDimensionalVector v1 = null , v2 = null;
   

    public Triangle(Double... args) throws ShapeException{
        if (args.length != 3)
            throw new ShapeException("It's not a triangle!");
        s1 = args[0];
        s2 = args[1];
        s3 = args[2];
    }


    public Triangle(TwoDimensionalVector... args) throws ShapeException{
        if (args.length != 2)
            throw new ShapeException("It's not a triangle!");
        s1 = args[0].length();
        s2 = args[1]. length();
        s3 = args[0].subtract(args[1]).length();
        v1 = args[0];
        v2 = args[1];
    }
    
    @Override
    public double area() {
        if (v1 != null)
          return Math.abs(v1.cross(v2) / 2);
        // return 0.0;

        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    
    @Override
    public double perimeter() {
        return s1 + s2 + s3;
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
