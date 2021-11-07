package controlselection.month;

public class DayInMonth {

   /* public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();

        System.out.println(dayInMonth.dayOfMonth(2021, "február"));
        System.out.println(dayInMonth.dayOfMonth(2024, "február"));
        System.out.println(dayInMonth.dayOfMonth(2021, "április"));
    }*/

    public int dayOfMonth(int year, String month) {
        switch (month.toLowerCase()) {
            case "január", "március", "május", "július", "augusztus", "október", "december":
                return 30;
            case "április", "június", "szeptember", "november":
                return 31;
            case "február":
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    return 29;
                }
                return 28;
            default:
                return 0;
        }
    }
}
