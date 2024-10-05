package ntut.posd2024f.shapes;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.ArrayList;







public class TriangleTest {
    @Test
    void TriangleCreate1() {
        ShapeException excep = assertThrows(ShapeException.class, ()->{new Triangle(3.0, 4.0, 5.0, 6.0);});
        assertEquals("It's not a triangle!", excep.toString());     
    }

    void TriangleCreate2() {
        TwoDimensionalVector v1 = new TwoDimensionalVector(3.0, 0.0);
        TwoDimensionalVector v2 = new TwoDimensionalVector(0.0, 4.0);
        
        List<TwoDimensionalVector> l = new ArrayList<TwoDimensionalVector>(Arrays.asList(v1, v2));


        ShapeException excep = assertThrows(ShapeException.class, ()->{new Triangle(l);});
        assertEquals("It's not a triangle!", excep.toString());     
    }


    @Test
    void TrianglePerimeterArea1() {
        try {
            Triangle c = new Triangle(3.0, 4.0, 5.0);
            assertEquals(12.0, c.perimeter());
            assertEquals(6.0, c.area());
            } catch (ShapeException e) {
                System.out.println(e);
            }
    }

    @Test
    void TrianglePerimeterArea2() {
        try {
            TwoDimensionalVector v1 = new TwoDimensionalVector(3.0, 0.0);
            TwoDimensionalVector v2 = new TwoDimensionalVector(0.0, 3.0);
            TwoDimensionalVector v3 = new TwoDimensionalVector(0.0, 0.0);    

            List<TwoDimensionalVector> l = new ArrayList<TwoDimensionalVector>(Arrays.asList(v1, v2, v3));



            Triangle c = new Triangle(l);
            assertEquals(6 + Math.sqrt(18), c.perimeter());
            assertEquals(4.5, Math.round(c.area() * 100)/100.0);
            } catch (ShapeException e) {
                System.out.println(e);
            }
    }




}
