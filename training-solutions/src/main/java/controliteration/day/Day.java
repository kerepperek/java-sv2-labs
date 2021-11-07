package controliteration.day;

import java.util.List;

public class Day {
    List<Hour> hoursOfDay;

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }
    public void setDayPeriod(){
        for(Hour hour:hoursOfDay){
            hour.setPeriod((hour.getHourNumber()>=6 && hour.getHourNumber()<=22)?DayPeriod.DAYTIME:DayPeriod.NIGHTTIME);
        }

    }
}
