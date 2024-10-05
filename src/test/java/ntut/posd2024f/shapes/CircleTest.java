package ntut.posd2024f.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void CircleCreate() 
    {
        ShapeException excep = assertThrows(ShapeException.class, ()->{new Circle(1.0, 1.0);});
        assertEquals("ntut.posd2024f.shapes.ShapeException: " + "It's not a circle!", excep.toString());
        
      
     
    }
    @Test
    void CirclePerimeterArea() {

        try {
            Circle c = new Circle(1.0);
            assertEquals(6.28, c.perimeter());
            assertEquals(3.14, c.area());
            } catch (ShapeException e) {
                System.out.println(e);
            }


    }
}
