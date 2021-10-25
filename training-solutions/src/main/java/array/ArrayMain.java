package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int[] hatvany = new int[5];
        hatvany[0] = 1;
        for (int counter = 1; counter < hatvany.length; counter++) {
            hatvany[counter] = hatvany[counter - 1] * 2;
        }
        for (int hatvanyelem:hatvany) {
            System.out.print(hatvanyelem + " ");
        }

        System.out.println();

        boolean[] booleans = new boolean[6];
        for (int counter = 1; counter < booleans.length; counter++) {
            booleans[counter] = !booleans[counter - 1];
        }
        for (boolean bl:booleans) {
            System.out.print(bl+ " ");
        }
    }
}
