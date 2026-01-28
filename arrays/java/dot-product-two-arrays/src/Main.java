public class Main {
    public static void main(String[] args) {
        System.out.println(dotProductTwoArrays(
                new int[] {1,0,0,2,3},
                new int[] {0,3,0,4,0}));
        System.out.println(dotProductTwoArrays(
                new int[] {0,1,0,0,0},
                new int[] {0,1,0,0,0}));
        System.out.println(dotProductTwoArrays(
                new int[] {0,1,0,0,2,0,0},
                new int[] {1,0,0,0,3,0,4}));
        System.out.println(dotProductTwoArrays(
                new int[] {0,1,0,0,0},
                new int[] {0,0,0,0,2}));
    }

    public static int dotProductTwoArrays(int[] nums1, int[] nums2) {
        int total = 0;
        for (int i = 0; i < nums1.length; i++) {
            total += nums1[i] * nums2[i];
        }

        return total;
    }
}