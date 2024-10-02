package ntut.posd2024f.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void RectangleCreate() 
    {
        ShapeException excep = assertThrows(ShapeException.class, ()->{new Rectangle(1.0, 1.0, 1.0);});
        assertEquals("It's not a rectangle!", excep.toString());
        
      
     
    }
    @Test
    void RectanglePerimeterArea() {

        try {
            Rectangle r = new Rectangle(1.0, 2.0);
            assertEquals(6.0, r.perimeter());
            assertEquals(2.0, r.area());
            } catch (ShapeException e) {
                System.out.println(e);
            }


    }
}