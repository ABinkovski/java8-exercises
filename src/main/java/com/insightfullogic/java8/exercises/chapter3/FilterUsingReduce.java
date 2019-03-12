package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * (Optional) Advanced
 * Write an implementation of the Stream function filter using only reduce and
 * lambda expressions. Again, you can return a List instead of a Stream if you want.
 */
public class FilterUsingReduce {

    public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
        return Exercises.replaceThisWithSolution();
    }

}
