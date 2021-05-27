package com.kodilla.testing.shape;

public class Triangle implements Shape{


        // Dla uproszczenia zakładamy  że tójkąt jest prostątny a Pole trójkąta obliczamy ze wzoru a*b/2 gdzie a jest to długość podstawy b wysokość First_side_of_figure*second_side_if_figure/2
        int base_lenght_side_of_figure;
        int high_lenght_side_of_figure;
        String figure_name="Triangle";

        Triangle(int base_lenght_side_of_figure, int high_lenght_side_of_figure){
            this.base_lenght_side_of_figure = base_lenght_side_of_figure;
            this.high_lenght_side_of_figure= high_lenght_side_of_figure;
        }

        @Override
        public String getShape() {
            return figure_name;
        }

        @Override
        public double getField() {
            return this.base_lenght_side_of_figure* this.high_lenght_side_of_figure/2.0;
        }
    }







