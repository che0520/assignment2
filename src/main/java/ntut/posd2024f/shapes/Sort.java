package ntut.posd2024f.shapes;

import java.util.ArrayList;


public class Sort {
    private ArrayList<Shape> arr;
    public Sort(Shape... s) {
        arr = new ArrayList<Shape>();
        for (Shape elem : s)
            arr.add(elem);
    }

    public void sort() {
        arr.sort((Shape x,  Shape y) -> { return y.area() > x.area() ? -1 : 1;});
    }

    public void print() {
        for (Shape elm : arr)
            System.out.println(elm.perimeter());
    }
    
}
