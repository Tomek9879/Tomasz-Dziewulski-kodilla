package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
  private final  int peselId;
  private final  String Name;
  private final char sex;
  private final LocalDate birthDate;
  private final int postsCounts;

    public ForumUser(int peselId, String name, char sex, int monthOfBirth,int dayOfBirth,int yearOfBirth, int postsCounts) {
        this.peselId = peselId;
        this.Name = name;
        this.sex = sex;
        this.birthDate =LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postsCounts = postsCounts;
    }

    public int getPeselId() {
        return peselId;
    }

    public String getName() {
        return Name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCounts() {
        return postsCounts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "peselId=" + peselId +
                ", Name='" + Name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsCounts=" + postsCounts +
                '}';

    }
}
