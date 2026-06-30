public class Main {
    public static void main(String[] args) {
        System.out.println(sequentialSearch(new int[]{28, 6, -2, 9, 16, 20, 23, 8}, 20));
        System.out.println(sequentialSearch(new int[]{4, 6, -3, 21, 55, 91, 2}, 11));
    }

    private static int sequentialSearch(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
}