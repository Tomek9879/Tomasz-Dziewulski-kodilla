package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        TaskList taskList = new TaskList("Ludzie w miescie","Opowiesc o ludziach w miescie");
        taskListDao.save(taskList);
        String lastName = taskList.getListName();
        List<TaskList> readTask= taskListDao.findByListName(lastName);

        assertEquals(1,readTask.size());
        taskListDao.deleteAll();
    }
}
