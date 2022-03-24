package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    String userName;
    List<String> exercies;
    Observer mentor;

    public Student(String userName){
        this.userName = userName;
        exercies = new ArrayList<>();
    }

    public void addExercies(String exercie){
        exercies.add(exercie);
        notifyObserver();
    }

    public String getUserName(){
        return userName;
    }
    public void removeExercies(String exerc){
        exercies.remove(exerc);
    }
    public List<String> getExercies(){
        return exercies;
    }
    public Observer getMentor(){
        return mentor;
    }


    @Override
    public void registerObserver(Observer observer) {
        this.mentor=observer;
    }

    @Override
    public void notifyObserver() {
        mentor.update(this);

    }

    @Override
    public void removeObserver() {
        mentor=null;
    }


}
