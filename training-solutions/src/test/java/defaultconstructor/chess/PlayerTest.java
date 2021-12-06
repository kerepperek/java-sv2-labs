package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testCreate() {
        Player player = new Player();

        assertNull(player.getName());
        assertNull(player.getEmail());
    }

    @Test
    void testSets() {
        Player player = new Player();
        player.setName("Kerep Perek");
        player.setEmail("kerep@perek.com");

        assertEquals("Kerep Perek", player.getName());
        assertEquals("kerep@perek.com", player.getEmail());
    }

}