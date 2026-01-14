//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Example 1
        System.out.println(removeNonDigits("87409217293"));
        //Example 2
        System.out.println(removeNonDigits("874092172-93"));
        //Example 3
        System.out.println(removeNonDigits("874.092.172-93"));

        //Alternative method
        System.out.println();

        //Example 1
        System.out.println(removeNonDigitsAlternative("87409217293"));
        //Example 2
        System.out.println(removeNonDigitsAlternative("874092172-93"));
        //Example 3
        System.out.println(removeNonDigitsAlternative("874.092.172-93"));

    }

    public static String removeNonDigits(String str) {
        String regex = "\\D";
        return str.replaceAll(regex, "");
    }

    public static String removeNonDigitsAlternative(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}