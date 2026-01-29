import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] arr2 = new int[] {1,2,3};
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[i + 1] = 0;
                i = i + 1;
            }
        }
    }
}