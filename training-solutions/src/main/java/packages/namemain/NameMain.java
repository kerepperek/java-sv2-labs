package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {

        Prefix prefix = new Prefix("Phd.");
        FirstName firstName = new FirstName("Sara");
        LastName lastName = new LastName("Lukovics");

        System.out.println(prefix.getPrefix()+" "+firstName.getFirstName()+" "+lastName.getLastName());
    }
}
