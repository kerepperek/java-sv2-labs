package defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {

    private List<Team> teams;

    public ChessTournament() {
        this.teams = Arrays.asList(
                new Team(),
                new Team(),
                new Team());
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int counter = 0; counter < playersRegistrated.size()-1; counter++) {
                if (counter % 2 == 0) {
                    teams.get(counter / 2).setPlayerOne(playersRegistrated.get(counter));
                } else {
                    teams.get(counter / 2).setPlayerTwo(playersRegistrated.get(counter));
                }

        }
    }

    public List<Team> getTeams() {
        return teams;
    }
}
