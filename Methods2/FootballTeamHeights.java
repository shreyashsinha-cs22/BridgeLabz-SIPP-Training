import java.util.Random;

public class FootballTeamHeights {

    //  Calculate sum of array elements
    static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    //  Calculate mean of array elements
    static double meanHeights(int[] heights) {
        int sum = sumHeights(heights);
        return (double) sum / heights.length;
    }

    // Find the shortest height
    static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Find the tallest height
    static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate 3-digit random heights for each player (150-250)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // range 150-250
        }

        // Display the heights
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int sum = sumHeights(heights);
        double mean = meanHeights(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
