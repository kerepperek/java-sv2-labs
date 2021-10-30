package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {
        Address address = new Address("Budapest", "1103", "Harmat utca", 74);
        System.out.println(address);

        Details details = new Details("Kőbányai csoda az Óhegy parknál.", address, 56, 1);
        System.out.println(details);

        RealEstate realEstate = new RealEstate("Kőbányai lakás", 18_000_000, details);
        System.out.println(realEstate);
    }
}
