package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    public static TaskFactory taskFactory;

    @BeforeAll
    static void  makeTaskFactory() {
        taskFactory = new TaskFactory();
    }

    @Test
    void DrivingTask(){
      Task task = taskFactory.makeTask(TaskFactory.DrivingTask);
      assertEquals("GoToTask",task.getTaskName());
      task.executeTask();
      assertEquals(true,task.isTaskExecuted());
    }

    @Test
    void PaintingTask(){
        Task task = taskFactory.makeTask(TaskFactory.PaintingTask);
        assertEquals("TreeTask",task.getTaskName());
        task.executeTask();
        assertEquals(true,task.isTaskExecuted());
    }

    @Test
    void shoppingTask(){
        Task task = taskFactory.makeTask(TaskFactory.ShoppingTask);
        assertEquals("TelephoneBuyTask",task.getTaskName());
        task.executeTask();
        assertEquals(true,task.isTaskExecuted());
    }


}
