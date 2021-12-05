package algorithmsfilter.movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testCreate() {
        Movie movie = new Movie("Star Trek", Category.SCIFI, 5);

        assertEquals("Star Trek", movie.getTitle());
        assertEquals(Category.SCIFI, movie.getCategory());
        assertEquals(5, movie.getRating());
    }
}