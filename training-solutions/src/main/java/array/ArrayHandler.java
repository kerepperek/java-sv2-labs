package array;

public class ArrayHandler {

      public void addIndexToNumber(int[] source) {
        for (int counter = 0; counter < source.length; counter++) {
            source[counter] += counter;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int counter = 0; counter < source.length; counter++) {
            source[counter] = counter + "." + source[counter];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] szamok = new int[]{10, 20, 30, 40, 50, 60, 70};
        String[] szavak = new String[]{"juhar", "pásztor", "süket", "denevér", "nővér"};

        arrayHandler.addIndexToNumber(szamok);
        for (int szam : szamok) {System.out.println(szam);}
        for (int szam : szamok) { System.out.print(szam + ",");}
        System.out.println();

        arrayHandler.concatenateIndexToWord(szavak);
        for (String szo : szavak) { System.out.println(szo); }
        for (String szo : szavak) { System.out.print(szo + ",");}
    }
}