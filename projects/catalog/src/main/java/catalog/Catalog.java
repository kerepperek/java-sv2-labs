package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogitem) {

        catalogItems.add(catalogitem);
    }

    public double averagePageNumberOver(int i) {
        if(!isValidLength(i)) {
            throw new IllegalArgumentException("Page number must be positive");}
        int items=0;
        int pages=0;
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof PrintedFeatures) {
                    if(((PrintedFeatures) feature).getNumberOfPages()>=i) {
                        items++;
                        pages += ((PrintedFeatures) feature).getNumberOfPages();
                    }
                }
            }
        }
        if(items==0){
            throw new IllegalArgumentException("No page");
        }
        return pages/items;
    }

    public void deleteItemByRegistrationNumber(String s) {
        CatalogItem result = null;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(s)) {
                result = catalogItem;
            }
        }
        if (result != null) {
            catalogItems.remove(result);
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria sc) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (isFilterable(catalogItem, sc)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    private boolean isFilterable(CatalogItem ci, SearchCriteria sc) {
        boolean result = true;
        if (sc.hasContributor()) {
            result =  result && ci.getContributors().contains(sc.getContributor());
        }
        if (sc.hasTitle()) {
            result =  result && ci.getTitles().contains(sc.getTitle());
        }
        return result;
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.numberOfPagesAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof AudioFeatures) {
                    result.add(catalogItem);
                }
            }
        }
        return result;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.fullLengthAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (feature instanceof PrintedFeatures) {
                    result.add(catalogItem);
                }
            }
        }
        return result;
    }
    private boolean isValidLength(int i){
        if(i<=0){
            return false;
        }
        return true;
    }
}
