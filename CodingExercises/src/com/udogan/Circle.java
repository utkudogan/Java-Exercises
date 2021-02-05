package com.udogan;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
