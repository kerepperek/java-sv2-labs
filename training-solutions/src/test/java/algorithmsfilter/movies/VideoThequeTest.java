package algorithmsfilter.movies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

     @Test
    void testGetGoodMoviesWithCategoryGiven() {
         VideoTheque videoTheque= new VideoTheque();
        videoTheque.addMovie(new Movie("Star Trek", Category.SCIFI, 5));
        videoTheque.addMovie(new Movie("The Seven Samurai", Category.ACTION, 2));
        videoTheque.addMovie(new Movie("Bonnie and Clyde", Category.FANTASY, 2));
        videoTheque.addMovie(new Movie("Reservoir Dogs", Category.ACTION, 2));
        videoTheque.addMovie(new Movie("Airplane!", Category.FANTASY, 4));
        videoTheque.addMovie(new Movie("Star Wars", Category.SCIFI, 5));
        videoTheque.addMovie(new Movie("Doctor Zhivago", Category.ACTION, 4));

        List<Movie> result = videoTheque.getGoodMoviesWithCategoryGiven(Category.SCIFI);

        assertEquals(2, result.size());
    }

}