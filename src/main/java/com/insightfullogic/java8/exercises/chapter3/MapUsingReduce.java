package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * (Optional) Advanced
 * Write an implementation of the Stream function map using only reduce and lambda
 * expressions. You can return a List instead of a Stream if you want.
 */
public class MapUsingReduce {

    public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
        return Exercises.replaceThisWithSolution();
    }

}
