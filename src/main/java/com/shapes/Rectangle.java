package com.shapes;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width,double length) {
        this.width=width;
        this.length=length;
    }

    public  double area() {
        double areaOfRectangle = width * length;
        return areaOfRectangle;
    }

    public double perimeter() {
        double perimeterOfRectangle = 2 * (length+width);
        return perimeterOfRectangle;
    }
}
