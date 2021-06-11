package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.forum.statistic.StatisticClass;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticClass {


   @Mock
   private static Statistics statisticMock=mock(Statistics.class);

   @Test
    void TestPostCount0(){
       StatisticClass statisticClass = new StatisticClass();
       when(statisticMock.postsCount()).thenReturn(0);
       statisticClass.calculateAdvStatistics(statisticMock);
       assertEquals(0,statisticClass.getPostsCount());

   }

   @Test
   void TestPostCount1000(){
      StatisticClass statisticClass = new StatisticClass();
      when(statisticMock.postsCount()).thenReturn(1000);
      statisticClass.calculateAdvStatistics(statisticMock);
      assertEquals(1000,statisticClass.getPostsCount());
   }
   @Test
   void TestCommentCount0(){
      StatisticClass statisticClass = new StatisticClass();
      when(statisticMock.commentsCount()).thenReturn(0);
      statisticClass.calculateAdvStatistics(statisticMock);
      assertEquals(0,statisticClass.getCommentCount());
   }

   @Test
   void TestCommentCountLessThanPostCount(){
    StatisticClass statisticClass = new StatisticClass();
    List<String> listUsers=new ArrayList<>();
    listUsers.add("Janek");
    when(statisticMock.usersNames()).thenReturn(listUsers);
    when(statisticMock.commentsCount()).thenReturn(2);
    when(statisticMock.postsCount()).thenReturn(8);
    statisticClass.calculateAdvStatistics(statisticMock);
    assertEquals(0.25,statisticClass.getMiddleCommentOfPostCount());
   }
   @Test
   void TestCommentCountMoreThanPostCount(){
      StatisticClass statisticClass= new StatisticClass();
      when(statisticMock.commentsCount()).thenReturn(4);
      when(statisticMock.postsCount()).thenReturn(2);
      statisticClass.calculateAdvStatistics(statisticMock);
      assertEquals(2,statisticClass.getMiddleCommentOfPostCount());
   }
   @Test
   void uesrsCount0(){
      StatisticClass statisticClass = new StatisticClass();
      List<String> listUsers = null;

      when(statisticMock.usersNames()).thenReturn(listUsers);
      statisticClass.calculateAdvStatistics(statisticMock);
      assertEquals(0,statisticClass.getUsersCount());
   }

   List<String>usersList(int i){
      List<String>usersList=new ArrayList<>();
      for(int a=0;a<i;a++){
         usersList.add("Marcin"+a);
      }
      return usersList;
   }
   @Test
   void usersCount100(){
      StatisticClass statisticClass = new StatisticClass();
      List<String>usersList;
      usersList=usersList(100);
      when(statisticMock.usersNames()).thenReturn(usersList);
      statisticClass.calculateAdvStatistics(statisticMock);
      assertEquals(100,statisticClass.getUsersCount());
   }
}
