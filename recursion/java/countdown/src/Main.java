public class Main {
    public static void main(String[] args) {
        countdown(20);
    }

    public static void countdown(int n) {
        System.out.println(n);
        if (n > 0) {
            countdown(n - 1);
        }
    }
}