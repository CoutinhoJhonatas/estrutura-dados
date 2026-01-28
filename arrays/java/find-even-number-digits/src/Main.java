public class Main {
    public static void main(String[] args) {
        System.out.println(findEvenNumberDigits(new int[] {12,345,0,6,7896}));
        System.out.println(findEvenNumberDigits(new int[] {555,901,482,1771}));
        System.out.println();
        System.out.println(findEvenNumberDigitsAlternative(new int[] {12,345,2,6,7896}));
        System.out.println(findEvenNumberDigitsAlternative(new int[] {555,901,482,1771}));
    }

    public static int findEvenNumberDigits(int[] nums) {
        int countEven = 0;
        for (int num : nums) {
            int actualNumber = num;
            int digits = 0;

            while (actualNumber != 0) {
                actualNumber = actualNumber / 10;
                digits++;
            }

            if (digits != 0 && digits % 2 == 0) {
                countEven++;
            }
        }

        return countEven;
    }

    public static int findEvenNumberDigitsAlternative(int[] nums) {
        int countEvenNumber = 0;
        for (int value : nums) {
            int numDigits = String.valueOf(value).length();
            if (numDigits % 2 == 0) {
                countEvenNumber++;
            }
        }
        return countEvenNumber;
    }
}