import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaRectangleTest {
    @Test
    void calculateRectangleArea() {
        assertEquals(6, AreaRectangle.getArea(2, 3));
    }

}
