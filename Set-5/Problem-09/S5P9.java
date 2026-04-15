// create Invalid passoword exception
class PasswordException extends Exception {
    String password;

    PasswordException(String p) {
        password = p;
    }

    void getPassword() {
        try {
            if (password.length() < 8) {
                throw new Exception("Invalid password. Must be at least 8 characters long.");
            }
            System.out.println("Valid password");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class S5P9 {
    public static void main(String[] args) {
        PasswordException pwd1 = new PasswordException("short");
        pwd1.getPassword();
    }
}
