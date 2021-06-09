package com.kodilla.stream.forumuser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String [] args){
        Forum forum = new Forum ();

        Map<Integer, ForumUser> par= forum.getUserList().stream().filter(forumUser->forumUser.getSex()=='M').filter(forumUser->forumUser.getBirthDate().getYear()<2000).filter(forumUser->forumUser.getPostsCounts()>=1)
//       .collect(Collectors.toMap(ForumUser::getPeselId,forumUser ->forumUser ));
       .collect(Collectors.toMap(forumuser->forumuser.getPeselId(),forumUser ->forumUser ));


        par.entrySet().stream().map(entry->entry.getKey()+":"+entry.getValue()).forEach(System.out::println);

    }
}
