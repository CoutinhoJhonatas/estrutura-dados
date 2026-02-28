import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWithRecursion(List.of("azul", "verde", "preto", "rosa")));
    }

    public static List<String> reverseWithRecursion(List<String> list) {
        if (list.size() <= 1) {
            return new ArrayList<>(list);
        }

        String head = list.get(0);
        List<String> tail = list.subList(1, list.size());

        List<String> newList = reverseWithRecursion(tail);
        newList.add(head);

        return newList;
    }

    public static List<String> reverse(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }

        return newList;
    }
}