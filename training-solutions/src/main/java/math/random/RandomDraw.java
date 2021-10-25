package math.random;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> drawers= new ArrayList<>(List.of("Fekete Sándor","Fehér Pál","Gór Nagy Mária","Kis Ködmön",
                "Friss Péter","Molnár Dezső","Eredeti Hugó","Gerei Szilvia","Kiss Árpád","Nagy Gergely"));
        RandomDraw randomDraw=new RandomDraw();
        System.out.println("Első nyertes: " + drawers.get(randomDraw.Rand(1,5)-1));
        System.out.println("Második nyertes: " + drawers.get(randomDraw.Rand(6,10)-1));
    }

    public int Rand(int min,int max){
        Random rnd = new Random();
        return min+rnd.nextInt(max-min);
    }
}
