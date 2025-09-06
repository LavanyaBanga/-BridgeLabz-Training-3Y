import java.util.Arrays;

public class extend {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to get digits array
    public static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check duck number
    public static boolean isDuck(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) return true; // contains zero
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Method to find largest and second largest
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 153; // you can change and test with other numbers
        int[] digits = getDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of Digits: " + countDigits(number));
        System.out.println("Duck Number: " + isDuck(number));
        System.out.println("Armstrong Number: " + isArmstrong(number));

        int[] largestPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestPair[0] + ", Second Largest: " + largestPair[1]);

        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestPair[0] + ", Second Smallest: " + smallestPair[1]);
    }
}
