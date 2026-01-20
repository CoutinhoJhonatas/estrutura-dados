import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isValid = validatePassword("amrca154682");
        System.out.println(isValid ? "VALIDA" : "INVALIDA");

        System.out.println("--- Clean Code Version ---");
        boolean isValid2 = validatePasswordClean("amerca1@");
        System.out.println(isValid2 ? "VALIDA" : "INVALIDA");

        System.out.println("--- Alternative Version ---");
        boolean isValid3 = validatePasswordAlternative("amerca1@");
        System.out.println(isValid3 ? "VALIDA" : "INVALIDA");
    }

    public static boolean validatePassword(String password) {
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#&]).{8,}$";
        return password.matches(regex);
    }

    public static boolean validatePasswordClean(String password) {
        boolean hasMinLength = password.length() >= 8;
        boolean hasLetter = password.matches(".*[A-Za-z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[@#&].*");

        return hasMinLength && hasLetter && hasDigit && hasSpecialChar;
    }

    public static boolean validatePasswordAlternative(String str) {
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@&#]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}