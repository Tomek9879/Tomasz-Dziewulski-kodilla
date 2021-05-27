package com.kodilla.testing.shape;

public class Square implements Shape{

        int high;
        int width;
        String figure_name="Square";

        Square(int high, int width){
            this.high = high;
            this.width= width;
        }



        @Override
        public String getShape() {
            return figure_name;

        }

        @Override
        public double getField() {
            return high*width*1.0;
        }
    }




