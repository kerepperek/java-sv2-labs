package catalog;

public class SearchCriteria {
    private String contributor;
    private String title;

    static SearchCriteria createByBoth(String title, String contributor) {
        if(Validators.isBlank(contributor)||Validators.isBlank(title)){
            throw new IllegalArgumentException("Not valid attribute.");
        }
        SearchCriteria sc = new SearchCriteria();
        sc.contributor = contributor;
        sc.title = title;
        return sc;
    }

    static SearchCriteria createByContributor(String contributor) {
        if(Validators.isBlank(contributor)){
            throw new IllegalArgumentException("Not valid attribute.");
        }
        SearchCriteria sc = new SearchCriteria();
        sc.contributor = contributor;
        return sc;
    }

    static SearchCriteria createByTitle(String title) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Not valid attribute.");
        }
        SearchCriteria sc = new SearchCriteria();
        sc.title = title;
        return sc;
    }

    public boolean hasContributor() {
        if(Validators.isBlank(contributor)){
            return false;
        };
        return true;
    }

    public boolean hasTitle() {

        if(Validators.isBlank(title)){
            return false;
        };
        return true;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
