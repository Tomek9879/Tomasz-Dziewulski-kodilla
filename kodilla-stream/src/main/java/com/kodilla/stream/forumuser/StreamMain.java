package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String [] args){
        Forum forum = new Forum ();

        Map<Integer, ForumUser> par= forum.getUserList().stream().filter(forumUser->forumUser.getSex()=='M').filter(forumUser-> ChronoUnit.YEARS.between(forumUser.getBirthDate(), LocalDate.now())>20).filter(forumUser->forumUser.getPostsCounts()>=1)

       .collect(Collectors.toMap(forumuser->forumuser.getPeselId(),forumUser ->forumUser ));








        par.entrySet().stream().map(entry->entry.getKey()+":"+entry.getValue()).forEach(System.out::println);


    }
}
