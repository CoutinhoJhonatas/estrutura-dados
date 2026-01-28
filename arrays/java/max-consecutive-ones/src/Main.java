public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
        System.out.println();
        System.out.println(findMaxConsecutiveOnesAlternative(new int[] {1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnesAlternative(new int[] {1,0,1,1,0,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxConsecutiveOnes = 0;

        for (int n : nums) {
            if (n == 0) {
                count = 0;
                continue;
            }

            count++;
            if (count > maxConsecutiveOnes) {
                maxConsecutiveOnes = count;
            }
        }

        return maxConsecutiveOnes;
    }

    public static int findMaxConsecutiveOnesAlternative(int[] nums) {
        int maxOnes = 0;
        int countOnes = 0;

        for (int value : nums) {
            if (value == 1) {
                countOnes++;
            }

            if (value != 1 && countOnes > 0) {
                maxOnes = Math.max(maxOnes, countOnes);
                countOnes = 0;
            }
        }

        maxOnes = Math.max(maxOnes, countOnes);

        return maxOnes;
    }
}