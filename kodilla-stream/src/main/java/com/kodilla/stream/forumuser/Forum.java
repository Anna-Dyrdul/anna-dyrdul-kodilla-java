package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser("kasia223", 0001, 'F', LocalDate.of(2017, 1, 23), 0));
        theUserList.add(new ForumUser("basia22", 0002, 'M', LocalDate.of(2000, 7, 14), 1));
        theUserList.add(new ForumUser("karol2", 0003, 'M', LocalDate.of(2002, 11, 23), 30));
        theUserList.add(new ForumUser("zosia", 0004, 'N', LocalDate.of(2001, 4, 1), 0));
        theUserList.add(new ForumUser("misiek", 0005, 'M', LocalDate.of(2017, 1, 13), 0));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList(theUserList);
    }
}
