package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Jan");
        User yGen = new YGeneration("Kate");
        User zGen = new ZGeneration("John");

        //When
        String assignedSocialPublisherForJan = millenials.sharePost();
        String assignedSocialPublisherForKate = yGen.sharePost();
        String assignedSocialPublisherForJohn = zGen.sharePost();

        //Then
        assertEquals("Snapchat", assignedSocialPublisherForJan);
        assertEquals("Facebook", assignedSocialPublisherForKate);
        assertEquals("Twitter", assignedSocialPublisherForJohn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Jan");

        //When
        String assignedSocialPublisherForJan = millenials.sharePost();
        millenials.setSocialPublisher(new FacebookPublisher());
        String assignedNewSocialPublisherForJan = millenials.sharePost();

        //Then
        assertEquals("Snapchat", assignedSocialPublisherForJan);
        assertEquals("Facebook", assignedNewSocialPublisherForJan);
    }
}
