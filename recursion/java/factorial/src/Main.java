public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial with recursion");
        System.out.println(factorialWithRecursion(0));
        System.out.println(factorialWithRecursion(3));
        System.out.println(factorialWithRecursion(4));
        System.out.println("Factorial with tail recursion");
        System.out.println(factorialWithTailRecursion(0));
        System.out.println(factorialWithTailRecursion(5));
        System.out.println(factorialWithTailRecursion(4));
        System.out.println("Factorial without recursion");
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

    public static int factorialWithTailRecursion(int n) {
        return factorialTailRecursive(n, 1);
    }

    public static int factorialTailRecursive(int n, int total) {
        if (n == 0) {
            return total;
        }

        return factorialTailRecursive(n - 1, n * total);
    }

    public static int factorialWithoutRecursion(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        return total;
    }
}