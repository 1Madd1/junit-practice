package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies {
    public List<String> getEmptyMovies() {
        return Collections.emptyList();
    }

    public List<String> getMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("The Hitchhiker's Guide to the Galaxy");
        movies.add("Avengers");
        movies.add("Up");
        return movies;
    }
}
