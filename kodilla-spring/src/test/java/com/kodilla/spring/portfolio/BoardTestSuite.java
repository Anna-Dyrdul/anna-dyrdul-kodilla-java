package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("First task to do");
        board.getInProgressList().getTasks().add("First task in progress");
        board.getDoneList().getTasks().add("First task done");

        //Then
        Assertions.assertEquals("First task to do", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("First task in progress", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("First task done",  board.getDoneList().getTasks().get(0));
    }
}

