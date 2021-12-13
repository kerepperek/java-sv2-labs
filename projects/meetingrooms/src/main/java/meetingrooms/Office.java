package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        if (meetingRooms.size() > 0) {
            System.out.println("Tárgyalók listája bevitel szerint:");
            for (MeetingRoom room : meetingRooms) {
                System.out.println(room.getName());
            }
            System.out.println();
        } else {
            System.out.println("Még nincs tárgyaló rögzítve!");
            System.out.println();
        }
    }

    public void printNamesReverse() {
        if (meetingRooms.size() > 0) {
            System.out.println("Tárgyalók listája bevitel szerint visszafelé1:");
            for (int counter = meetingRooms.size() - 1; counter >= 0; counter--) {
                System.out.println(meetingRooms.get(counter).getName());
            }
            System.out.println();
        } else {
            System.out.println("Még nincs tárgyaló rögzítve!");
            System.out.println();
        }
    }

    public void printEvenNames() {
        if (meetingRooms.size() > 1) {
            System.out.println("Minden második tárgyaló listája:");
            for (int counter = 1; counter < meetingRooms.size(); counter += 2) {
                System.out.println(meetingRooms.get(counter).getName());
            }
            System.out.println();
        } else {
            System.out.println("Nincs 2 db tárgyaló rögzítve!");
            System.out.println();
        }
    }

    public void printAreas() {
        if (meetingRooms.size() > 0) {
            System.out.println("Tárgyalók területi listája:");
            for (MeetingRoom room : meetingRooms) {
                System.out.println(room.getName() + " Hossza:" + room.getLength() + " Szélessége:" + room.getWidth() + " Területe:" + room.getArea());
            }
            System.out.println();
        } else {
            System.out.println("Még nincs tárgyaló rögzítve!");
            System.out.println();
        }
    }

    public void printMeetingRoomsWithNAme(String name) {
        if (meetingRooms.size() > 0) {
            System.out.println("A '"+name+"' nevű tárgyalók listája:");
            for (MeetingRoom room : meetingRooms) {
                if (room.getName().equals(name)) {
                    System.out.println(room.getName() + " Hossza:" + room.getLength() + " Szélessége:" + room.getWidth() + " Területe:" + room.getArea());
                }
            }
            System.out.println();
        } else {
            System.out.println("Még nincs tárgyaló rögzítve!");
            System.out.println();
        }
    }

    public void printMeetingRoomsContains(String part) {
        if (meetingRooms.size() > 0) {
            System.out.println("A '"+part+"' névrészletű tárgyalók listája:");
            for (MeetingRoom room : meetingRooms) {
                if (room.getName().toLowerCase().contains(part.toLowerCase())) {
                    System.out.println(room.getName() + " Hossza:" + room.getLength() + " Szélessége:" + room.getWidth() + " Területe:" + room.getArea());
                }
            }
            System.out.println();
        } else {
            System.out.println("Még nincs tárgyaló rögzítve!");
            System.out.println();
        }
    }

    public void printAreasLargerThan(int area) {
        if (meetingRooms.size() > 0) {
            System.out.println("A "+area+"-ná(é)l nagyobb területű tárgyalók listája:");
            for (MeetingRoom room : meetingRooms) {
                if (room.getArea() > area) {
                    System.out.println(room.getName() + " Hossza:" + room.getLength() + " Szélessége:" + room.getWidth() + " Területe:" + room.getArea());
                }
            }
            System.out.println();
        } else {
            System.out.println("Még nincs tárgyaló rögzítve!");
            System.out.println();
        }
    }
}
