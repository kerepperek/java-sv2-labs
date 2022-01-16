package nestedclasses.soccer;

public class TeamStatistics {


    private String teamName;
    private Games games;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.games = new Games();
    }

    public static class Games {

        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;
        private int points;
    }
    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        this.games.played++;
        if (plusGoalsFor > plusGoalsAgainst) {
            this.games.won++;
        } else if (plusGoalsAgainst == plusGoalsFor) {
            this.games.tied++;
        } else {
            this.games.lost++;
        }
        this.games.goalsFor += plusGoalsFor;
        this.games.goalsAgainst += plusGoalsAgainst;
        this.games.points = this.games.won * 3 + this.games.tied;
    }



    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return games.played;
    }

    public int getWon() {
        return games.won;
    }

    public int getTied() {
        return games.tied;
    }

    public int getLost() {
        return games.lost;
    }

    public int getGoalsfor() {
        return games.goalsFor;
    }

    public int getGoalsAgainst() {
        return games.goalsAgainst;
    }

    public int getPoints() {
        return games.points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return teamName.hashCode();
    }
}
