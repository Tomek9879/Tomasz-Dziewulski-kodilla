package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String userName;
    private int updateCount=0;

    public Mentor(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public int getUpdateCount(){
        return updateCount;
    }

    @Override
    public void update(Student student) {
        System.out.println(userName+"New message"+student.getUserName()+ student.getExercies().size());
        updateCount++;
    }
}
