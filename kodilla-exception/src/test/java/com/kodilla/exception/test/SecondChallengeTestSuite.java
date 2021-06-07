package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import com.kodilla.exception.test.SecondChallenge;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {


  @Test
    void secondChallengeTest(){


    SecondChallenge secondChallenge = new SecondChallenge();


    assertDoesNotThrow(()->secondChallenge. probablyIWillThrowException(1,5));


  }
  @Test
  void secondChallengeTest2(){


    SecondChallenge secondChallenge = new SecondChallenge();


   assertThrows(Exception.class, ()->secondChallenge. probablyIWillThrowException(2,5));
   assertThrows(Exception.class, ()->secondChallenge. probablyIWillThrowException(0,5));
   assertThrows(Exception.class, ()->secondChallenge. probablyIWillThrowException(6,1.5));

  }



}
