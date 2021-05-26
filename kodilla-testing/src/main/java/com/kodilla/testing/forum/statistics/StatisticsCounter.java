package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostForUser() {
        return averageNumberOfPostForUser;
    }

    public double getAverageNumberOfCommentsForUser() {
        return averageNumberOfCommentsForUser;
    }

    public double getAverageNumberOfCommentsForPost() {
        return averageNumberOfCommentsForPost;
    }

    //private Statistics statistics;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostForUser;
    private double averageNumberOfCommentsForUser;
    private double averageNumberOfCommentsForPost;

    //public StatisticsCounter (Statistics statistics) {this.statistics = statistics;}

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(statistics.usersNames().size() == 0){
            averageNumberOfPostForUser = 0;
            averageNumberOfCommentsForUser = 0;
        } else {
            averageNumberOfPostForUser = (double) numberOfPosts/statistics.usersNames().size();
            averageNumberOfCommentsForUser = (double) numberOfComments/statistics.usersNames().size();
        }
        if(numberOfPosts == 0){
            averageNumberOfCommentsForPost = 0;
        } else {
            averageNumberOfCommentsForPost = (double) numberOfComments/numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Statistics:" + "\nNumber of posts:" + numberOfPosts
                + "\nNumber of comments:" + numberOfComments
                + "\nAverage number of post for user:" + averageNumberOfPostForUser
                + "\nAverage number of comments for user:" + averageNumberOfCommentsForUser
                + "\nAverage number of comments for post:" + averageNumberOfCommentsForPost);
    }

}
