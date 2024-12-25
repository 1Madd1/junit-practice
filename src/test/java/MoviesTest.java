import org.example.Movies;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class MoviesTest {

    private final Movies movies = new Movies();

    @Test
    public void givenMoviesList_whenListingThroughList_thenReturnMovies() {
        Assertions.assertFalse(movies.getMovies().isEmpty(), () -> "Movies should not be empty");
    }

    @Test
    public void givenMoviesList_whenListingThroughMovies_thenReturnEmptyMovies() {
        Assertions.assertTrue(movies.getEmptyMovies().isEmpty(), () -> "Movies should be empty");
    }

}