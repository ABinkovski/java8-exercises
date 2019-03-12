package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;
/**
 * Iteration. Convert this code sample from using external iteration to internal iteration:
    int totalMembers = 0;
    for (Artist artist : artists) {
    Stream<Artist> members = artist.getMembers();
    totalMembers += members.count();
}*/
public class Question2 {

    public static int countBandMembersInternal(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }
}
