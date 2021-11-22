package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mozijegy vásárlás:");
        System.out.println("------------------");
        System.out.print("Kérem, adja meg a nevét:");
        String name = scanner.nextLine();

        System.out.print("Melyik filmre szeretne jegyet venni?");
        String film = scanner.nextLine();

        System.out.print("Hány jegyet kér?");
        int tickets = scanner.nextInt();
        scanner.nextLine();
        if(tickets>0) {
            System.out.println("Melyik sorba kéri a jegyeit?");
            String line = scanner.nextLine();

            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n ");
            stringBuilder.append("Vásárló neve: ").append(name).append("\n");
            stringBuilder.append("Film címe: ").append(film).append("\n");
            stringBuilder.append("Lefoglalt helyek: ");
            for (int counter = 1; counter <= tickets; counter++) {
                stringBuilder.append(line).append(". sor ").append(counter).append(". szék");
                if (counter < tickets) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("\n").append("Jó szórakozást!");

            System.out.println(stringBuilder);
        }else{
            System.out.println("Ön nem vásárolt jegyet. Köszönjük, hogy ellátogatott hozzánk!");
        }
    }
}
/*
Ha a számok bevitele helyett szöveget visznek be, akkor hibát dob a program.
 */