package com.kodilla.good.patterns.challenges;

public class User {
  final  private String name;
  final  private String surname;

    User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getUser() {
        return name + " " + surname;
    }

}
