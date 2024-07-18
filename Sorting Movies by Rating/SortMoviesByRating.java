package org.example;

import java.util.Comparator;

public class SortMoviesByRating implements Comparator<Movies> {
    @Override
    public int compare(Movies movie1, Movies movie2) {
        return Double.compare(movie2.getRating(), movie1.getRating());
    }
}
