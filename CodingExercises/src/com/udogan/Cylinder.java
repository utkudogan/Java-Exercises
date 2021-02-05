package com.udogan;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getVolume(){
        return (height * (super.getArea()));
    }
}
