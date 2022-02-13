package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Activities {
    private List<Activity> activities=new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes(){
        List<Report> result=new ArrayList<>();
        for(ActivityType activityType:ActivityType.values()){
            double distance=activities.stream()
                            .filter(activity->activity.getType()==activityType)
                    .mapToDouble(i->i.getDistance())
                    .reduce(0, (a, b) -> a + b);
            result.add(new Report(activityType,distance));
        }

        return result;
    }

    public int numberOfTrackActivities(){
     int result=0;
     for(Activity activity:activities){
         if(activity.getClass()==ActivityWithTrack.class){
             result++;
         }
     }
     return result;
    }

    public int numberOfWithoutTrackActivities(){
        int result=0;
        for(Activity activity:activities){
            if(activity.getClass()==ActivityWithoutTrack.class){
                result++;
            }
        }
        return result;
    }
}
