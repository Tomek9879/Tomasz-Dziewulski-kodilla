package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        User user0 = new Millenials("Jan Nowak");
        User user1 = new YGeneration("Ola Zamoyska");
        User user2 = new ZGeneration("Przemysław Strąk");

        String userSocialPublisher = user0.sharePost();
        assertEquals("This User use  Facebook", userSocialPublisher);

        userSocialPublisher = user1.sharePost();
        assertEquals("This User use Snapchat", userSocialPublisher);

        userSocialPublisher = user2.sharePost();
        assertEquals("This User use a Twitter", userSocialPublisher);

    }

    @Test
    void testIndividualSharingStrategy() {

        User user0 = new Millenials("Jan Nowak");
        assertEquals("This User use  Facebook", user0.sharePost());

        user0.setSocialPublisher(new SnapchatPublisher());
        assertEquals("This User use Snapchat", user0.sharePost());

    }
}
