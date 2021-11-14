package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    Office office=new Office();

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runmenu();
    }

    public void runmenu() {
        Scanner scanner = new Scanner(System.in);
        int menuidx = 0;
        do {
            printMenu();
            menuidx = scanner.nextInt();
            scanner.nextLine();
            switch (menuidx) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.print("Adja meg a tárgyaló nevét a kereséshez:");
                    String meetingRoomName=scanner.nextLine();
                    office.printMeetingRoomsWithNAme(meetingRoomName);
                    break;
                case 7:
                    System.out.print("Adja meg a tárgyaló névfoszlányát a kereséshez:");
                    String meetingRoomNamePart=scanner.nextLine();
                    office.printMeetingRoomsContains(meetingRoomNamePart);
                    break;
                case 8:
                    System.out.print("Adja meg a tárgyaló minimum területét:");
                    int meetingRoomArea=scanner.nextInt();
                    office.printAreasLargerThan(meetingRoomArea);
                    break;
            }
        }while(menuidx != 9);
        System.out.println("Program vége.");
    }

    public void printMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keesés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapjám");
        System.out.println("9. Kilépés");
        System.out.println("---------------------------------------");
    }

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a rögzítendő iroda paramétereit.");
        System.out.print("Az iroda neve:");
        String name=scanner.nextLine();
        System.out.print("Az iroda hossza:");
        int length=scanner.nextInt();
        System.out.print("Az iroda szélessége:");
        int width=scanner.nextInt();
        office.addMeetingRoom(new MeetingRoom(name,length,width));
    }

}
