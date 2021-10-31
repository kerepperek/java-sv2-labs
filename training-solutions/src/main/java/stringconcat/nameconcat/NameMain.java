package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        System.out.println(new Name("Kerep", "", "Perek", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Kerep", "Gábor", "Perek", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Kerep", null, "Perek", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Kerep", null, "Perek").concatNameWesternStyle());

        System.out.println(new Name("Kerep", "", "Perek", Title.MR).concatNameHungarianStyle());
        System.out.println(new Name("Kerep", "Gábor", "Perek", Title.MR).concatNameHungarianStyle());
        System.out.println(new Name("Kerep", null, "Perek", Title.MR).concatNameHungarianStyle());;
        System.out.println(new Name("Kerep", null, "Perek").concatNameHungarianStyle());

    }
}
