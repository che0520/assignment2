package ntut.posd2024f.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ConvexPolygonTest {
    @Test 
    public void ConvexPolygonCreate() {
        TwoDimensionalVector v1 = new TwoDimensionalVector(0.0, 3.0);
        TwoDimensionalVector v2 = new TwoDimensionalVector(4.0, 0.0);
        TwoDimensionalVector v3 = new TwoDimensionalVector(0.0, 0.0);

        try {
        ConvexPolygon cp = new ConvexPolygon(v1, v2, v3);
        } catch (ShapeException e) {
            System.out.println(e);
        }

    }


    @Test
    public void ConvexPolygonPerimeter() {
        TwoDimensionalVector v1 = new TwoDimensionalVector(4.0, 0.0);
        TwoDimensionalVector v2 = new TwoDimensionalVector(4.0, 4.0);
        TwoDimensionalVector v3 = new TwoDimensionalVector(0.0, 4.0);
        TwoDimensionalVector v4 = new TwoDimensionalVector(0.0, 0.0);
        try {
        ConvexPolygon cp = new ConvexPolygon(v1, v2, v3, v4);
        assertEquals(16.0, cp.perimeter());
        } catch (ShapeException e) {
            System.out.println(e);
        }
    }


    @Test
    public void ConvexPolygonArea() {
        TwoDimensionalVector v1 = new TwoDimensionalVector(2.0, 5.0);
        TwoDimensionalVector v2 = new TwoDimensionalVector(-4.0, 3.0);
        TwoDimensionalVector v3 = new TwoDimensionalVector(5.0, 1.0);
   
        try {
        ConvexPolygon cp = new ConvexPolygon(v1, v2, v3);
        assertEquals(15, cp.area());
        } catch (ShapeException e) {
            System.out.println(e);
        }
    }




}
