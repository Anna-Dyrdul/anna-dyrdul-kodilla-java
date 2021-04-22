package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String username;
    private final int userID;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final String username, final int userID, final char sex, final LocalDate dateOfBirth, final int numberOfPosts) {
        this.username = username;
        this.userID = userID;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", userID=" + userID +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
