package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {

        Winner winner = new Winner();

        try {
            System.out.println("A kisorsolt nyertes: " + winner.getWinner());
        } catch (NullPointerException e) {
            System.out.println("A kisorsolt jelentkező nem adott meg nevet, így a sorsolás érvénytelen!");
        }
    }
}
