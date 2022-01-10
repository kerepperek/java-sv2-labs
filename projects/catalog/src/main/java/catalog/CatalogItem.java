package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features.addAll(List.of(features));
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int result=0;
        for(Feature feature:features){
            if(feature instanceof AudioFeatures) {
                result += ((AudioFeatures) feature).getLength();
            }
        }
     return result;
    }

    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for(Feature feature:features){
          result.add(feature.getTitle());
        }
        return result;
    }


    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for(Feature feature:features){
            result.addAll(feature.getContributors());
        }
        return result;
    }

    public boolean hasAudioFeature() {
        for(Feature feature:features){
            if(feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for(Feature feature:features){
            if(feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int result=0;
        for(Feature feature:features){
            if(feature instanceof PrintedFeatures) {
                result += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return result;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
