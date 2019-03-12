package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
* 1. Common Stream operations. Implement the following:
*   a. A function that adds up numbers, i.e., int addUp(Stream<Integer> numbers)
    b. A function that takes in artists and returns a list of strings with their names and
        places of origin
    c. A function that takes in albums and returns a list of albums with at most three
tracks*/

public class Question1 {
    public static int addUp(Stream<Integer> numbers) {
        return Exercises.replaceThisWithSolution();
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return Exercises.replaceThisWithSolution();
    }
}
