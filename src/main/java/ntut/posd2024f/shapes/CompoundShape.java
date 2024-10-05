package ntut.posd2024f.shapes;

import java.util.ArrayList;
import java.util.Iterator;

public class CompoundShape implements Shape {

    private ArrayList<Shape> arr = new ArrayList<Shape>();

    public CompoundShape(){}
    
    @Override
    public double area() {
        double total = 0.0;
        for (Shape elm : arr)
            total += elm.area();
        return total;
    }
    
    
    @Override
    public double perimeter() {
        double total = 0.0;
        for (Shape elm : arr)
            total += elm.perimeter();    
        return total;
    }
    
    @Override
    public void add(Shape s) {
        arr.add(s);
    }

    @Override
    public Iterator<Shape> iterator() {
        return new CompoundIterator(arr);
    }

    private class CompoundIterator implements Iterator<Shape> {
        private ArrayList<Shape> arr = new ArrayList<Shape>();

        
        public CompoundIterator(ArrayList<Shape> x) {
            for (Shape elm : x) {
                if (elm instanceof CompoundShape){
                    Iterator<Shape> it = elm.iterator();
                    while(it.hasNext())
                        arr.add(it.next());
                } else {

                    arr.add(elm);
                }
            }    
        }    
        

        @Override
        public boolean hasNext() {
            return arr.size() > 0;
        }

        @Override
        public Shape next() {
            Shape s = arr.get(0);
            arr.remove(0);
            return s;
        }; 
    }


}
