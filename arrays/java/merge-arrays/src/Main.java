import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3,0,0,0};
        mergeArrays(array1, 3, new int[] {2,5,6}, 3);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[] {1};
        mergeArrays(array2, 1, new int[] {}, 0);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[] {0};
        mergeArrays(array3, 0, new int[] {1}, 1);
        System.out.println(Arrays.toString(array3));

        int[] array4 = new int[] {4,5,6,0,0,0};
        mergeArrays(array4, 3, new int[] {1,2,3}, 3);
        System.out.println(Arrays.toString(array4));
    }

    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            int smallestNumber = nums1[i];
            int smallestNumberIndex = i;

            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] < smallestNumber) {
                    smallestNumber = nums1[j];
                    smallestNumberIndex = j;
                }
            }

            nums1[smallestNumberIndex] = nums1[i];
            nums1[i] = smallestNumber;
        }
    }

    public static void alternativeMergeArrays(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}