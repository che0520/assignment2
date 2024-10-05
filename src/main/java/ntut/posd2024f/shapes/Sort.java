package ntut.posd2024f.shapes;

//import java.util.ArrayList;

import java.util.Comparator;

public class Sort {

    public static Comparator<Shape> BY_AREA_ASCENDING = new ByAreaAscending();
    public static Comparator<Shape> BY_AREA_DESCENDING = new ByAreaDescending();

    public static Comparator<Shape> BY_PERIMETER_ASCENDING = new ByPerimeterAscending();
    public static Comparator<Shape> BY_PERIMETER_DESCENDING = new ByPerimeterDescending();



    private static class ByAreaAscending implements Comparator<Shape> {
        public int compare(Shape left, Shape right) {return 0;}
    }

    private static class ByAreaDescending implements Comparator<Shape> {
        public int compare(Shape left, Shape right) {return 0;}
    }



    private static class ByPerimeterDescending implements Comparator<Shape> {
        public int compare(Shape left, Shape right) {return 0;}
    }



    private static class ByPerimeterAscending implements Comparator<Shape> {
        public int compare(Shape left, Shape right) {return 0;}
    }






    // private ArrayList<Shape> arr;
    // public Sort(Shape... s) {
    //     arr = new ArrayList<Shape>();
    //     for (Shape elem : s)
    //         arr.add(elem);
    // }

    // public void sort() {
    //     arr.sort((Shape x,  Shape y) -> { return y.area() > x.area() ? -1 : 1;});
    // }

    // public void print() {
    //     for (Shape elm : arr)
    //         System.out.println(elm.perimeter());
    // }
    
}
