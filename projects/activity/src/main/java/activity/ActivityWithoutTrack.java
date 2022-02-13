package activity;

public class ActivityWithoutTrack implements Activity {

    private ActivityType activityType;

    public ActivityWithoutTrack(ActivityType activityType) {
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return 0D;
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }

    ;
}
