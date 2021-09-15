package com.kodilla.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskList0;
    @Autowired
    @Qualifier("inProgress")
    TaskList taskList1;
    @Autowired
    @Qualifier("doneList")
    TaskList taskList2;

    @Bean
    public Board getBoard() {
        return new Board(taskList0, taskList1, taskList2);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList createToDoList() {
        TaskList toDoList = new TaskList();

        toDoList.task.add("Zakupy");
        toDoList.task.add("Pranie");
        toDoList.task.add("Odebrać samochod od mechanika");
        return toDoList;
    }

    @Bean("inProgress")
    @Scope("prototype")
    public TaskList inProgressList() {
        TaskList inProgressList = new TaskList();

        inProgressList.task.add("Sprzątanie domu");
        inProgressList.task.add("Kurs grania na gitarze");
        inProgressList.task.add("Organizacja przyjecia urodzinowego");
        return inProgressList;
    }

    @Bean("doneList")
    @Scope("prototype")
    public TaskList createDoneList() {
        TaskList doneList = new TaskList();

        doneList.task.add("Odebrano paczke od kuriera");
        doneList.task.add("Ugotowano obiad");
        doneList.task.add("Odrobiono zadania domowe");
        return doneList;
    }
}
