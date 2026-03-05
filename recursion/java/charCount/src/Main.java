public class Main {
    public static void main(String[] args) {
        System.out.println(charCount('b', "Batata para o bebê"));
    }

    public static int charCount(char ch, String text) {
        return charCountAuxiliary(Character.toLowerCase(ch), text.toLowerCase(), 0, 0);
    }

    public static int charCountAuxiliary(char ch, String text, int total, int index) {
        if (index >= text.length()) {
            return total;
        }

        int newTotal = (text.charAt(index) == ch) ? total + 1 : total;
        return charCountAuxiliary(ch, text, newTotal, index + 1);
    }
}