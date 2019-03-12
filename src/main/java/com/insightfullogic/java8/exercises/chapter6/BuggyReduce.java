package com.insightfullogic.java8.exercises.chapter6;

import java.util.List;

/**
 * The code in multiplyThrough multiplies every number in a list together and multiplies
 * the result by 5. This works fine sequentially, but has a bug when running in parallel.
 * Make the code run in parallel using streams and fix the bug.
 * */
public class BuggyReduce {

    public static int multiplyThrough(List<Integer> linkedListOfNumbers) {
        return linkedListOfNumbers.stream()
                                  .reduce(5, (acc, x) -> x * acc);
    }

}
