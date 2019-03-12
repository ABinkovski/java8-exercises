package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Given a Stream where each element is a word, count the number of times each
 * word appears. So, if you were given the following input, you would return a Map
 * of [John → 3, Paul → 2, George → 1]:
 * Stream<String> names = Stream.of("John", "Paul", "George", "John",
 * "Paul", "John");
 * */
public class WordCount {

    public static Map<String, Long> countWords(Stream<String> names) {
        return Exercises.replaceThisWithSolution();
    }

}
