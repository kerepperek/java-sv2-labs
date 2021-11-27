package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void testAddNote() {
        student.addNote(3);
        student.addNote(5);
     assertEquals(2,student.getNote().size());
    }

    @Test
    void testAddNoteFail() {
        IllegalArgumentException e=assertThrows(IllegalArgumentException.class,()->
                student.addNote(0));
        assertEquals("Note must be between 1 and 5!",e.getMessage());
    }


}