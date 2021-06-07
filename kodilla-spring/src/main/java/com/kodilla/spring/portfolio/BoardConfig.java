package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(taskListToDo(), taskListInProgress(), taskListDone());
    }

    @Bean
    @Scope("prototype")
    public TaskList taskListToDo() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList taskListInProgress() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList taskListDone() {
        return new TaskList();
    }
}
