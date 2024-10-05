package ntut.posd2024f.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Iterator;

public class CompoundShapeTest {
    @Test
    public void CompoundShapeTest1() {
        try {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(1.0);
        Circle c3 = new Circle(1.0);
        CompoundShape compound1 = new CompoundShape();
        CompoundShape compound2 = new CompoundShape();

        compound1.add(c1);
        compound1.add(c2);
        compound2.add(c3);
        compound2.add(compound1);
        assertEquals(9.42, compound2.area());

        } catch (ShapeException e) {
            System.out.println(e);
        }
    }

    @Test
    public void CompoundShapeTest2() {
        try {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(2.0);
        Circle c4 = new Circle(1.0);
        Triangle t1 = new Triangle(3.0, 4.0, 5.0);

        CompoundShape compound1 = new CompoundShape();
        CompoundShape compound2 = new CompoundShape();

        compound1.add(c1);
        compound2.add(c2);
        compound2.add(c3);
        compound2.add(t1);
        compound1.add(compound2);
        compound1.add(c4);
        
        Iterator<Shape> s = compound1.iterator();
        while (s.hasNext())
            System.out.println(s.next().area());

        } catch (ShapeException e) {
            System.out.println(e);
        }
    }
}
