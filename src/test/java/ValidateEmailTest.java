public class ValidateEmailTest {
    private static ValidateEmail emailEg;
    public static final String[] validEmail = new String[]{"codegym@gmail.com", "codegym@yahoo.com", "codegym@outlook.com"};
    public static final String[] invailidEmai = new String[]{"@gmail.com", "2class@gmail.", "^%$@gmail.com"};

    public static void main(String[] args) {
        emailEg = new ValidateEmail();
        for (String email : validEmail) {
            boolean isValid = emailEg.validate(email);
            System.out.println("Email is " + email + "is valid :" + isValid);
        }

        for (String email : invailidEmai) {
            boolean isValid = emailEg.validate(email);
            System.out.println("Email is" + email + "is valid: " + isValid);
        }
    }
}
