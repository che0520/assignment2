package ntut.posd2024f.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDimensionalVectorTest {
    @Test
    void TwoDimensionalVectorLengthTest() {
        TwoDimensionalVector vec = new TwoDimensionalVector(3.0, 4.0);
        assertEquals(5.0, vec.length());

    }


    @Test
    void TwoDimensionalVectorDotTest() {
        TwoDimensionalVector vec1 = new TwoDimensionalVector(3.0, 4.0);
        TwoDimensionalVector vec2 = new TwoDimensionalVector(3.0, 4.0);
        assertEquals(25.0, vec1.dot(vec2));

    }
    
}
