package ntut.posd2024f.shapes;

public class Triangle implements Shape {
    private double s1, s2, s3;
    private TwoDimensionalVector v1 = null , v2 = null, v3 = null;
   

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
        v1 = args[0];
        v2 = args[1];
        v3 = args[2];
        s1 = v2.subtract(v1).length();
        s2 = v3.subtract(v2).length();
        s3 = v1.subtract(v3).length();
        
        
    }
    
    @Override
    public double area() {
        // if (v1 != null)
        //   return Math.abs(v1.cross(v2) / 2);
        // // return 0.0;

        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    
    @Override
    public double perimeter() {
        return s1 + s2 + s3;
    }


    @Override
    public void add(Shape s) throws ShapeException {
        throw new ShapeException("Illegal Operaton");
    }

    @Override
    public NullIterator iterator() {
        return new ShapeIterator();
    }

    private class ShapeIterator implements NullIterator {
        public boolean hasNext() {return false;}
        public Shape next() {return null;}; 
    }
}
