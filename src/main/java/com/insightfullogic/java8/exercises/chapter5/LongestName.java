package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;

public class LongestName {

    public static Artist byReduce(List<Artist> artists) {
        return artists.stream()
//            .max(Comparator.comparing(artist->artist.getName().length()))
//            .reduce((artist, artist2) -> {
//                if(artist.getName().length() > artist2.getName().length()) {
//                    return artist;
//                } else {
//                    return artist2;
//                }
//            })
            .reduce((artist, artist2) ->
                (artist.getName().length() > artist2.getName().length()) ? artist: artist2)
            .orElse(null);
    }

    public static Artist byCollecting(List<Artist> artists) {
        return Exercises.replaceThisWithSolution();
    }

}
