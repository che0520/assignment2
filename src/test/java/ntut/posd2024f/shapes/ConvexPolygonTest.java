package ntut.posd2024f.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ConvexPolygonTest {
    @Test 
    public void ConvexPolygonCreate() {
        TwoDimensionalVector v1 = new TwoDimensionalVector(0.0, 3.0);
        TwoDimensionalVector v2 = new TwoDimensionalVector(4.0, 0.0);
        TwoDimensionalVector v3 = new TwoDimensionalVector(0.0, 0.0);

        ArrayList<TwoDimensionalVector> input = new ArrayList<TwoDimensionalVector>();
        input.add(v1);
        input.add(v2);
        input.add(v3);
        

        try {
        ConvexPolygon cp = new ConvexPolygon(input);
        } catch (ShapeException e) {
            System.out.println(e);
        }

    }

    @Test 
    public void ConvexPolygonCreateDirection() {
        TwoDimensionalVector v1 = new TwoDimensionalVector(0.5, 0.5);
        TwoDimensionalVector v2 = new TwoDimensionalVector(-0.5, 0.5);
        TwoDimensionalVector v3 = new TwoDimensionalVector(-0.5, -0.5);
        TwoDimensionalVector v4 = new TwoDimensionalVector(0.5, -0.5);

        ArrayList<TwoDimensionalVector> input = new ArrayList<TwoDimensionalVector>();
        input.add(v1);
        input.add(v2);
        input.add(v3);
        input.add(v4);


        try {
        ConvexPolygon cp = new ConvexPolygon(input);
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
        ArrayList<TwoDimensionalVector> input = new ArrayList<TwoDimensionalVector>();
        input.add(v1);
        input.add(v2);
        input.add(v3);
        input.add(v4);

        ConvexPolygon cp = new ConvexPolygon(input);
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
   
        ArrayList<TwoDimensionalVector> input = new ArrayList<TwoDimensionalVector>();
        input.add(v1);
        input.add(v2);
        input.add(v3);
        

        try {
        ConvexPolygon cp = new ConvexPolygon(input);
        assertEquals(15, cp.area());
        } catch (ShapeException e) {
            System.out.println(e);
        }
    }




}
