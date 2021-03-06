package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted = false;

    ShoppingTask(String taskName, String whatToBuy, double quantity) {

        this.taskName=taskName;
        this.whatToBuy=whatToBuy;
        this.quantity=quantity;
    }

    @Override
    public void executeTask() {

        System.out.println("Task " + taskName+" is realized ");
        isExecuted=true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
