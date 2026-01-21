import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefixMine(new String[]{"flowers", "flow", "flight"}));
        System.out.println(longestCommonPrefixMine(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefixMine(new String[]{"ab", "ab", "ab"}));
        System.out.println(longestCommonPrefixMine(new String[]{"abcde", "tre", "abcde"}));
        System.out.println(longestCommonPrefixMine(new String[]{"java", "java", "java"}));
    }

    public static String longestCommonPrefixMine(String[] v) {
        if (v.length == 1) return v[0];

        StringBuilder commonPrefix = new StringBuilder();
        String shortest = v[0];
        for (int i = 1; i < v.length; i++) {
            if (shortest.length() > v[i].length()) {
                shortest = v[i];
            }
        }
        if (shortest.isEmpty()) return "";

        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (String s: v) {
                if (s.charAt(i) != c) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(c);
        }

        return commonPrefix.toString();
    }

    public static String longestCommonPrefixMineBetterWithChatGPT(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String shortest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }
        if (shortest.isEmpty()) return "";

        int limit = shortest.length();
        int i = 0;

        for (; i < limit; i++) {
            char c = shortest.charAt(i);
            for (String s: strs) {
                if (s.charAt(i) != c) {
                    return shortest.substring(0, i);
                }
            }
        }

        return shortest;
    }

    public static String longestCommonPrefixProfessor(String[] v) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return result.toString();
            }
            result.append(first.charAt(i));
        }

        return result.toString();
    }
}