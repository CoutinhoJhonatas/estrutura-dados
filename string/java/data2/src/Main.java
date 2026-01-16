//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String formatedDate = formatDate(21, 7, 2020);
        System.out.println(formatedDate);
    }

    public static String formatDate(int day, int month, int year) {
        String formatDay = String.format("%02d", day);
        String formatMonth = String.format("%02d", month);

        return formatDay + "/" + formatMonth + "/" + year;
    }
}