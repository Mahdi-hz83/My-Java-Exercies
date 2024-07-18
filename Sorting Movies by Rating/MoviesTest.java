package org.example;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MoviesTest {

    @Test
    public void testCompare() {
        Movies movie1 = new Movies("Inception", 8.8);
        Movies movie2 = new Movies("The Dark Knight", 9.0);
        Movies movie3 = new Movies("Interstellar", 8.6);

        List<Movies> movies = Arrays.asList(movie1, movie2, movie3);
        movies.sort(new SortMoviesByRating());

        assertEquals(movie2, movies.get(0));
        assertEquals(movie1, movies.get(1));
        assertEquals(movie3, movies.get(2));
    }
}
