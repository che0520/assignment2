package ntut.posd2024f.shapes;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SortTest {


    @Test
    void SortTest1() throws ShapeException {
        Circle o1 = new Circle(1.0);
        Circle o2 = new Circle(2.0);
        Sort s = new Sort();

        ArrayList<Shape> arr = new ArrayList<Shape>();
        arr.add(o1);
        arr.add(o2);

        Collections.sort(arr, Sort.BY_AREA_DESCENDING);
        assertEquals(3.14, arr.get(1).area());



      
    }


}
