import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+$)";

    public void EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public static boolean validate(String regex) {
        matcher = pattern.compile(regex).matcher(regex);
        return matcher.matches();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        validate(email);
        System.out.println(validate(email));

    }



}


