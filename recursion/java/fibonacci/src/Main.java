public class Main {
    public static void main(String[] args) {
        System.out.println(fibonnaci(45));
        System.out.println(fibonnaci(0));
        System.out.println(fibonnaci(1));
        System.out.println(fibonnaci(7));
        System.out.println(fibonnaci(2));
    }

    public static int fibonnaci(int n) {
        return fibonnaciTailRecursive(n, 0, 1);
    }

    public static int fibonnaciTailRecursive(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibonnaciTailRecursive(n - 1, b, a + b);
    }

    public static int fibonnaciInefficient(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonnaciInefficient(n - 1) + fibonnaciInefficient(n - 2);
    }
}