package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

  public final  List<ForumUser> forumUsers = new ArrayList<>();


   public Forum() {
        forumUsers.add(new ForumUser(124,"Janek",'M',5,10,2023,5));
        forumUsers.add(new ForumUser(13,"Ola",'F',5,4,2000,2));
        forumUsers.add(new ForumUser(119,"Zenek",'M',3,9,1996,20));
        forumUsers.add(new ForumUser(108,"Krzysiek",'M',9,15,1993,7));
        forumUsers.add(new ForumUser(142,"Ania",'F',1,11,1968,47));
        forumUsers.add(new ForumUser(123,"Ela",'F',9,17,1985,65));
        forumUsers.add(new ForumUser(118,"Franek",'M',11,22,2003,20));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);





    }
}
