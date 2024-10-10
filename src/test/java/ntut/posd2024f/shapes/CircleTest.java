package ntut.posd2024f.shapes;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class CircleTest {
    @Test
    void CircleCreateException1() 
    {
        double b = -1;
        // Circle c = new Circle(arr);
        ShapeException excep = assertThrows(ShapeException.class, () -> {new Circle(b);});
        assertEquals("ntut.posd2024f.shapes.ShapeException: " + "It's not a circle!", excep.toString());      
    }


    @Test
    void CircleCreateException2() 
    {
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(1.0);
        arr.add(1.0);
        // Circle c = new Circle(arr);
        ShapeException excep = assertThrows(ShapeException.class, () -> {new Circle(arr);});
        assertEquals("ntut.posd2024f.shapes.ShapeException: It's not a circle!", excep.toString());      
    }


    @Test
    void CirclePerimeter() {

        try {
            Circle c = new Circle(1.0);
            assertEquals(6.28, c.perimeter());
            } catch (ShapeException e) {
                System.out.println(e);
            }


    }

    @Test
    void CircleArea() {

        try {
            Circle c = new Circle(1.0);
            assertEquals(3.14, c.area());
            } catch (ShapeException e) {
                System.out.println(e);
            }
    }


    @Test
    void CircleAdd() {

        try {
            Circle c1 = new Circle(1.0);
            Circle c2 = new Circle(1.0);
            ShapeException excep = assertThrows(ShapeException.class, () -> {c1.add(c2);});
            assertEquals("ntut.posd2024f.shapes.ShapeException: Illegal Operation", excep.toString());
            } catch (ShapeException e) {
                System.out.println(e);
            }
    }

    @Test
    void CircleIterator() {

        try {
            Circle c1 = new Circle(1.0);
            Iterator<Shape> it = c1.iterator();
            assertTrue(it instanceof NullIterator);
            } catch (ShapeException e) {
                System.out.println(e);
            }
    }
}
