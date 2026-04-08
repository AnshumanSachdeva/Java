class FormValidation {
    String name;
    String email;
    int age;

    FormValidation(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    void validation() {
        try {
            if (name.isEmpty() || email.isEmpty()) {
                throw new Exception("Name and email cannot be empty");
            }

            if (age < 18) {
                throw new Exception("Age must be at least 18");
            }

            if (! email.contains("@")) {
                throw new Exception("Invalid email format");
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation complete");
        }
    }
}

public class S4P4 {
    public static void main(String[] args) {
        FormValidation form1 = new FormValidation("Anshuman", "anshuman@123", 19);
        FormValidation form2 = new FormValidation("Abc", "avhh@", 10);
        FormValidation form3 = new FormValidation("fvhh", "fvhh", 20);
        FormValidation form4 = new FormValidation("", "123@", 20);

        form1.validation();
        form2.validation();
        form3.validation();
        form4.validation();
    }
}
