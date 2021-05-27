package com.kodilla.testing.shape;

public class Cirkle implements Shape {

    int radius;
    String figure_name = "Cirkle";
    Cirkle(int radius){
        this.radius=radius;
    }
    @Override
    public String getShape() {
        return figure_name;
    }

    @Override
    public double getField() {
        return 3.0 *this.radius*this.radius;
    }
}
