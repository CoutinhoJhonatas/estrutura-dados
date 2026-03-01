import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumList(Arrays.asList(4.0, 5.0, 3.0)));
    }

    public static double sumList(List<Double> list) {
        if (list.isEmpty()) {
            return 0;
        }

        double head = list.get(0);
        List<Double> tail = list.subList(1, list.size());

        return head + sumList(tail);
    }
}