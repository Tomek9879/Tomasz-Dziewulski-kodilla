package com.kodilla.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;

    ForumUser(){
        userName="John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
