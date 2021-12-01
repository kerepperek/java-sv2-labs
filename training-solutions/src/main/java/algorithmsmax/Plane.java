package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {

        int maxOcean = 0;
        int sumOcean = 0;
        for (char c : map.toCharArray()) {
            switch(c){
                case '0':
                    sumOcean++;
                    break;
                case '1':
                    if (sumOcean > maxOcean) {
                        maxOcean = sumOcean;
                    }
                    sumOcean = 0;
                    break;
            }
        }
        return maxOcean;
    }
}
