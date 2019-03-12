package com.insightfullogic.java8.exercises.chapter6;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.stream.IntStream;

/**
 * The code in sequentialSumOfSquares sequentially sums the squares of numbers in a Stream. Make it run in parallel using streams.
 */
public class SerialToParallel {

    public static int sumOfSquares(IntStream range) {
        return Exercises.replaceThisWithSolution();
    }

    public static int sequentialSumOfSquares(IntStream range) {
        return range.map(x -> x * x)
            .sum();
    }

}
