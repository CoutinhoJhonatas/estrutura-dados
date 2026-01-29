import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquare(new int[] {-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquare(new int[] {-7, -3, 2, 3, 11})));
    }

    public static int[] sortedSquare(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int smallestNumber = nums[i];
            int smallestNumberIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < smallestNumber) {
                    smallestNumber = nums[j];
                    smallestNumberIndex = j;
                }
            }

            nums[smallestNumberIndex] = nums[i];
            nums[i] = smallestNumber;
        }

        return nums;
    }

    public static int[] sortedSquareAlternative(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
