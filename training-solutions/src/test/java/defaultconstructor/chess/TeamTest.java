package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void testCreate() {
        Team team = new Team();

        assertNull(team.getPlayerOne());
        assertNull(team.getPlayerTwo());
    }

    @Test
    void testSetPlayers() {
        Team team = new Team();
        Player player = new Player();
        player.setName("Kerep Perek");
        player.setEmail("kerep@perek.com");
        team.setPlayerOne(player);

        player = new Player();
        player.setName("Garga Jani");
        player.setEmail("jani@garga.com");
        team.setPlayerTwo(player);

        assertEquals("Kerep Perek", team.getPlayerOne().getName());
        assertEquals("kerep@perek.com", team.getPlayerOne().getEmail());
        assertEquals("jani@garga.com", team.getPlayerTwo().getEmail());
    }
}