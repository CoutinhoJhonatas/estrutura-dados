public class Main {
    public static void main(String[] args) {
        System.out.println(sumWithoutRecursion(4));
        System.out.println(sumWithoutRecursion(5));
        System.out.println();
        System.out.println(sumWithRecursion(4));
        System.out.println(sumWithRecursion(5));
    }

    public static int sumWithRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumWithRecursion(n - 1);
    }

    public static int sumWithoutRecursion(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }

        return total;
    }
}