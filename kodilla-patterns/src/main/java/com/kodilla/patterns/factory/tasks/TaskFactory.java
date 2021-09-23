package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public Task makeTask(String task){
        switch(task){
            case ShoppingTask:
                return new ShoppingTask("TelephoneBuyTask","Telephone",1.0);
            case PaintingTask:
                return new PaintingTask("TreeTask","green","Tree");
            case DrivingTask:
                    return new DrivingTask("GoToTask","Krakow","Car");
            default:
                return null;
        }
    }
}
