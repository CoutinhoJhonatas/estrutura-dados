//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DateInfo dateInfo = extractDateData("21/07/2010");

        System.out.println("Dia: " + dateInfo.day);
        System.out.println("Mês: " + dateInfo.month);
        System.out.println("Ano: " + dateInfo.year);
    }

    public static DateInfo extractDateData(String date) {
        String[] dateParts = date.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        return new DateInfo(day, month, year);
    }
}

class DateInfo {
    int day;
    int month;
    int year;

    public DateInfo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}