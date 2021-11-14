package com.shapes;

public class Rectangle {

    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (length + width);

    }
}