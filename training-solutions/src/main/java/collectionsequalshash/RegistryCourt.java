package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add( new Company("Hermina Kft.", "12345678-2-1"));
        companies.add( new Company("Dobó Zrt.", "12345678-2-1"));
        companies.add( new Company("Hermina Kft.", "12345678-2-1"));
        companies.add( new Company("Hermina Kft.", "22222222-2-1"));

        System.out.println(companies.contains(new Company("Hermina Kft.", "12345678-2-1")));
    }
}
