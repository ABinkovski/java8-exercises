package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


/**
 * Find the artist with the longest name. You should implement this using a Collector
 * and the reduce higher-order function Then compare
 * the differences in your implementation: which was easier to write and which
 * was easier to read? The following example should return "Stuart Sutcliffe":
 * Stream<String> names = Stream.of("John Lennon", "Paul McCartney",
 * "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
 * */
public class LongestName {

    public static Artist byReduce(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }

    public static Artist byCollecting(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }

}
