package com.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    Rectangle rectObj = new Rectangle(2.5,3.0);
    @Test
    void calculateRectangleArea() {
        assertEquals(7.5, rectObj.area());
    }

    @Test
    void calculateRectanglePerimeter(){
        assertEquals(10, rectObj.perimeter());
    }
}
