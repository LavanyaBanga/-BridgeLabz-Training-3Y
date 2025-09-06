import java.util.Arrays;

public class max{

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

    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check palindrome number
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check Duck number
    // A Duck number must contain at least one '0' digit
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        int number1 = 121;  // palindrome test
        int number2 = 1023; // duck number test

        System.out.println("Number: " + number1);
        System.out.println("Count of Digits: " + countDigits(number1));
        System.out.println("Digits: " + Arrays.toString(getDigits(number1)));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseArray(getDigits(number1))));
        System.out.println("Is Palindrome: " + isPalindrome(number1));
        System.out.println("Is Duck Number: " + isDuckNumber(number1));

        System.out.println("\nNumber: " + number2);
        System.out.println("Count of Digits: " + countDigits(number2));
        System.out.println("Digits: " + Arrays.toString(getDigits(number2)));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseArray(getDigits(number2))));
        System.out.println("Is Palindrome: " + isPalindrome(number2));
        System.out.println("Is Duck Number: " + isDuckNumber(number2));
    }
}
