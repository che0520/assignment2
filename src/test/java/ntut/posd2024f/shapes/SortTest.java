package ntut.posd2024f.shapes;

import org.junit.jupiter.api.Test;


public class SortTest {

    @Test
    void SortTest1() throws ShapeException {
        Circle o1 = new Circle(1.0);
        Circle o2 = new Circle(2.0);
        Sort s = new Sort(o1, o2);
        s.sort();
        s.print();
    }


}
