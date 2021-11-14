package com.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    Square squareObj = new Square(5);

    @Test
    void calculateSquareArea() {
        assertEquals(25, squareObj.area());
    }

    @Test
    void calculateSquarePerimeter() {
        assertEquals(20, squareObj.perimeter());
    }

}