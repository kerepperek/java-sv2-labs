package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        String[] split = email.split("@");
        if (split.length != 2) {
            return false;
        } else {
            split = email.split("\\.");
            if (split.length != 2) {
                return false;
            } else {
                if (split[1].length() == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
