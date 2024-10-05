package ntut.posd2024f.shapes;

import java.util.ArrayList;

public class ConvexPolygon implements Shape {

    private ArrayList<TwoDimensionalVector> edges = new ArrayList<TwoDimensionalVector>();
    private TwoDimensionalVector centroid;
   

    public ConvexPolygon(ArrayList<TwoDimensionalVector> args) throws ShapeException{
     
        for (TwoDimensionalVector arg : args)
            edges.add(arg);
        
        double x = 0.0 , y = 0.0;
        for (TwoDimensionalVector elm : edges) {
            x += elm.x;
            y += elm.y;
        }
        centroid = new TwoDimensionalVector(x / edges.size(), y / edges.size());

        int n = edges.size();
        double  pre = 0.0, curr;
        boolean signal = true;
        for (int i = 0; i < n; i++) {
            TwoDimensionalVector u = edges.get((i + 1) % n).subtract(edges.get(i));
            TwoDimensionalVector v = edges.get((i + 2) % n).subtract(edges.get(i));
            curr = u.cross(v);
            if (curr * pre < 0.0) signal = false;
            pre = curr;
            if (signal == false) break;
        }


        if (signal == false)
        throw new ShapeException("It's not a convex polygon!");


    }

    public double area() {
        double ret = 0.0;
        int n = edges.size();
        for (int i = 0; i < n; i++) {
            TwoDimensionalVector v = edges.get(i).subtract(centroid);
            TwoDimensionalVector u = edges.get((i+1) % n).subtract(edges.get(i));
            ret += Math.abs(0.5 * v.cross(u));
        }
        return ret;
    }

    public double perimeter() {
        double ret = 0.0;
        int n = edges.size();
        for (int i = 0; i < n; i++)
            ret += edges.get((i + 1 )% n).subtract(edges.get(i)).length();
        return ret;
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