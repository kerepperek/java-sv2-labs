package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{
    private List<String> authors=new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages,List<String> authors) {
        if(!isValidTitle(title)) {
            throw new IllegalArgumentException("Empty title");}
        if(!isValidPages(numberOfPages)) {
            throw new IllegalArgumentException("Not valid number of pages.");}
        if(authors ==null) {
            throw new IllegalArgumentException("No author declared.");}
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }
    private boolean isValidTitle(String s){
        if(s==null ||s.length()==0){
            return false;
        }
        return true;
    }
    private boolean isValidPages(int i){
        if(i<=0){
            return false;
        }
        return true;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public List<String> getContributors(){
        List<String> result=new ArrayList<>();
        result.addAll(authors);
        return result;
    };

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
