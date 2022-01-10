package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature{
    private List<String> composer=new ArrayList<>();
    private int length;
    private List<String> performers=new ArrayList<>();
    private String title;

    public AudioFeatures( String title,int length,List<String> performers) {
        if(!(isValidTitle(title)&&isValidLength(length))) {
            throw new IllegalArgumentException("Not valid parameters");}

            this.performers = performers;
            this.length = length;
            this.title = title;

    }
    public AudioFeatures( String title,int length,List<String> performers,List<String> composer) {
        if(!(isValidTitle(title)&&isValidLength(length))) {
            throw new IllegalArgumentException("Not valid parameters");}

            this.composer = composer;
            this.length = length;
            this.title = title;
            this.performers = performers;

    }
   private boolean isValidTitle(String s){
        if(s==null ||s.length()==0){
            return false;
        }
        return true;
   }
    private boolean isValidLength(int i){
        if(i<=0){
           return false;
        }
        return true;
    }
    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public List<String> getContributors(){
        List<String> result=new ArrayList<>();
        result.addAll(composer);
        result.addAll(performers);
        return result;
    };

}
