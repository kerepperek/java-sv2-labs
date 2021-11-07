package controlselection.week;

public class DayOfWeeks {

  /*  public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.rangeofWeek("kedd"));
        System.out.println(dayOfWeeks.rangeofWeek("szombat"));
    }
*/
    public String rangeofWeek(String day) {
        switch (day.toLowerCase()) {
            case "hétfő":
                return "hét eleje";
            case "kedd", "szerda", "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat", "vasárnap":
                return "hét vége";
            default:
                return "ismeretlen nap";
        }
    }
}
