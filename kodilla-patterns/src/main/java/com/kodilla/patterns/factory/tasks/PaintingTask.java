package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuteTask=false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println(" Task painting "+ whatToPaint+" color "+ color+" is realized ");
        isExecuteTask=true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuteTask;
    }
}
