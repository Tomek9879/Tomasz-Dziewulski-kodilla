package com.kodilla.kodilla.spring.portfolio;

public class Board {

    TaskList toDoList;
    TaskList inProgress;
    TaskList doneList;

    Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgress = inProgressList;
        this.doneList = doneList;
    }
}
