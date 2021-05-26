package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsCouterTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateUserNames(int numberOfUsers) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String userName =("User." + n);
            resultList.add(userName);
        }
        return resultList;
    }

    //    gdy liczba postów = 0,
    //    gdy liczba komentarzy = 0,
    //    gdy liczba użytkowników = 0,
    @Test
    void testCalculateAdvStatisticsWhen0 (){
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> resultListUserName = generateUserNames(0);
        when(statisticsMock.usersNames()).thenReturn(resultListUserName);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostForUser = statisticsCounter.getAverageNumberOfPostForUser();
        double averageCommentForUser = statisticsCounter.getAverageNumberOfCommentsForUser();
        double averageCommentForPost = statisticsCounter.getAverageNumberOfCommentsForPost();
        //Then
        assertEquals(0, averagePostForUser);
        assertEquals(0, averageCommentForUser);
        assertEquals(0, averageCommentForPost);
    }


    //    gdy liczba postów = 1000,
    //    gdy liczba komentarzy < liczba postów,
    //    gdy liczba użytkowników = 100.
    @Test
    void testCalculateAdvStatisticsWhenMany (){
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> resultListUserName = generateUserNames(100);
        when(statisticsMock.usersNames()).thenReturn(resultListUserName);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostForUser = statisticsCounter.getAverageNumberOfPostForUser();
        double averageCommentForUser = statisticsCounter.getAverageNumberOfCommentsForUser();
        double averageCommentForPost = statisticsCounter.getAverageNumberOfCommentsForPost();
        //Then
        assertEquals(10, averagePostForUser);
        assertEquals(0.1, averageCommentForUser);
        assertEquals(0.01, averageCommentForPost);
    }

    //    gdy liczba komentarzy > liczba postów,
    @Test
    void testCalculateAdvStatisticsWhenMoreComments (){
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> resultListUserName = generateUserNames(5);
        when(statisticsMock.usersNames()).thenReturn(resultListUserName);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostForUser = statisticsCounter.getAverageNumberOfPostForUser();
        double averageCommentForUser = statisticsCounter.getAverageNumberOfCommentsForUser();
        double averageCommentForPost = statisticsCounter.getAverageNumberOfCommentsForPost();
        //Then
        assertEquals(2, averagePostForUser);
        assertEquals(20, averageCommentForUser);
        assertEquals(10, averageCommentForPost);
    }

}
