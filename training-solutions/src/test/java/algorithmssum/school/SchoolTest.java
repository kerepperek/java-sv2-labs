package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {

        School school = new School();
        int sum = school.getNumberOfStudents(Arrays.asList(13, 13, 18, 19, 25, 21, 20, 32, 32, 28, 13, 15));

        assertEquals(249, sum);
    }

}