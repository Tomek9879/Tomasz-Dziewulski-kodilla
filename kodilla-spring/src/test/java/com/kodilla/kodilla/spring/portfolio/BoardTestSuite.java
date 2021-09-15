package com.kodilla.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void TestTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext("Com.kodilla.kodilla.spring.portfolio");
        Board board = (Board)context.getBean("getBoard");

        board.toDoList.task.add("Obejrzenie meczu o 19");
        board.inProgress.task.add("Sprzatanie w garażu");
        board.doneList.task.add("Mycie naczyń");

        assertEquals("Obejrzenie meczu o 19", board.toDoList.task.get(3));
        assertEquals("Sprzatanie w garażu", board.inProgress.task.get(3));
        assertEquals("Mycie naczyń", board.doneList.task.get(3));

    }
}
