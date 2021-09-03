package com.kodilla.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kodilla.kodilla.spring.forum.ForumUser;

import static org.junit.jupiter.api.Assertions.assertEquals;



    @SpringBootTest
    class ForumUserTestSuite {

        @Test
        void testGetUsername(){

            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodilla.spring.forum");
            ForumUser forumUser = context.getBean(ForumUser.class);

            String surname = forumUser.getUserName();
            assertEquals("John Smith", surname);

        }

    }


