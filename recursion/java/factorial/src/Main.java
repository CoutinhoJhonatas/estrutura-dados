public class Main {
    public static void main(String[] args) {
        System.out.println(factorialWithRecursion(0));
        System.out.println(factorialWithRecursion(3));
        System.out.println(factorialWithRecursion(4));
        System.out.println();
        System.out.println(factorialWithoutRecursion(0));
        System.out.println(factorialWithoutRecursion(3));
        System.out.println(factorialWithoutRecursion(4));
    }

    public static int factorialWithRecursion(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialWithRecursion(n - 1);
    }

    public static int factorialWithoutRecursion(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        return total;
    }
}