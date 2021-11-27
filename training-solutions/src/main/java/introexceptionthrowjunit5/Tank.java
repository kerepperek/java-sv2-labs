package introexceptionthrowjunit5;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber){
        angle+=angleNumber;
        if(angle>360){
            angle-=360;
        }
        if(angle<0){
            angle+=360;
        }

        if(Math.abs(angleNumber)>160||(angle>80&&angle<280)){
            throw new IllegalArgumentException("Illegal cannon position!");
        }
    }
    public int getAngle() {
        return angle;
    }
}
