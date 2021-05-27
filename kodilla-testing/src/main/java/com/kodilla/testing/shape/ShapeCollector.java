package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> figuresList = new ArrayList<>();

    public void addFigure(Shape shape) {
        figuresList.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        boolean figuresContains = false;
        if (figuresList.contains(shape)) {
            figuresList.remove(shape);
            figuresContains = true;
        }
        return figuresContains;

    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < figuresList.size()) {
            return figuresList.get(n);
        }
        return null;
    }

    public String showFigures() {
        String allFiguresName ="";
        Shape shape;

        for (int i = 0; i < figuresList.size(); i++) {
            shape=figuresList.get(i);
            allFiguresName =  allFiguresName+shape.getShape() + " ";
        }
        return allFiguresName;
    }

    public int getFigureQuantity() {
        return figuresList.size();
    }
}
