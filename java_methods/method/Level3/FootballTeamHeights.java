import java.util.Random;

public class FootballTeamHeights {

    // Method to find the sum of all elements in the array
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }

        // Display heights
        System.out.print("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
