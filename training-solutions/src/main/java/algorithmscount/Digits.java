package algorithmscount;

public class Digits {

    public int getCountOfNumbers(){
        int count=0;
        for(int counter=11;counter<100;counter++){
            if(isMetCondition(counter)){
                count++;
            }
        }
        return count;
    }

    private boolean isMetCondition(int number){
        String s=String.valueOf(number);
       if(Math.abs(Integer.parseInt(s.substring(0,1))-Integer.parseInt(s.substring(1,2)))==5){
           return true;
        }
       return false;
    }
}
