package collectionsequalshash;

import java.util.Objects;

public class Company {

    private String name;
    private String taxNumber;

    public Company(String name, String taxNumber) {
        this.name = name;
        this.taxNumber = taxNumber;
    }

    public static void main(String[] args) {
        Company company1 = new Company("Hermina Kft.", "12345678-2-1");
        Company company2 = new Company("Dobó Zrt.", "12345678-2-1");
        Company company3 = new Company("Hermina Kft.", "12345678-2-1");

        System.out.println(company1.equals(company2));

        System.out.println(company1.equals(company3));
        System.out.println(company3.equals(company1));

        System.out.println(company1.hashCode());
        System.out.println(company2.hashCode());
        System.out.println(company3.hashCode());
    }

    public String getName() {
        return name;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Company company = (Company) other;
        return name.equals(company.name) && taxNumber.equals(company.taxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taxNumber);
    }



}
