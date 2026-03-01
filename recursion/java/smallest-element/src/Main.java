import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minor(Arrays.asList(10.0, 15.0, 20.0, 8.0, 30.0, 17.0)));
    }

    public static double minor(List<Double> list) {
        if (list.size() == 1) {
            return list.get(0);
        }

        double head = list.get(0);
        List<Double> tail = list.subList(1, list.size());

        double tailMinor = minor(tail);

        return (head < tailMinor) ? head : tailMinor;
    }
}