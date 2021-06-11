package com.kodilla.testing.forum.statistic;

import java.util.List;

public class StatisticClass {

    private int usersCount;
    private int postsCount;
    private int commentCount;
    private int middlePostCount;
    private int middleCommentCount;
    private double middleCommentOfPostCount;
    private double middlePostCountOfUsersCount;
    private double middleCommentsOfUsersCount;
    private List<String> userNames;


    public void calculateAdvStatistics(Statistics statistics){
        this.postsCount=statistics.postsCount();
        this.commentCount = statistics.commentsCount();
        if(statistics.usersNames()==null) {
            this.usersCount = 0;
            this.middleCommentOfPostCount = 0;
            this.middlePostCountOfUsersCount=0;
            this.middleCommentsOfUsersCount=0;

        }
        else {
            this.usersCount = statistics.usersNames().size();

            this.middleCommentOfPostCount = statistics.commentsCount() * 1.0 / statistics.postsCount();
            this.middlePostCountOfUsersCount=statistics.postsCount()*1.0/statistics.usersNames().size();
            this.middleCommentsOfUsersCount=statistics.commentsCount()*1.0/statistics.postsCount();
        }





    }
    public void showStatistics(){
        System.out.println(getUsersCount());
        System.out.println(getPostsCount());
        System.out.println(getCommentCount());
        System.out.println(getMiddleCommentCount());
        System.out.println(getMiddleCommentOfPostCount());

    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getMiddlePostCount() {
        return middlePostCount;
    }

    public int getMiddleCommentCount() {
        return middleCommentCount;
    }

    public double getMiddleCommentOfPostCount() {
        return middleCommentOfPostCount;
    }

    public List<String> getUserNames() {
        return userNames;
    }
}
