import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(mergeLists(List.of(10, 20, 30), List.of(5, 8, 7)));
        System.out.println(mergeLists(List.of("ana", "maria"), List.of("joao", "bob", "alex", "leo")));
    }

    public static <T> List<T> mergeLists(List<T> a, List<T> b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }

        T ahead= a.get(0);
        List<T> atail = a.subList(1, a.size());

        T bhead = b.get(0);
        List<T> btail = b.subList(1, b.size());

        List<T> result = new ArrayList<>();
        result.add(ahead);
        result.add(bhead);
        result.addAll(mergeLists(atail, btail));

        return result;
    }
}