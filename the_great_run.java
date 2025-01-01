import java.util.*;
import java.lang.*;
import java.io.*;
class the_great_run
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();  // Length of the track (N kilometers)
            int K = sc.nextInt();  // Maximum continuous distance Vishal can run
            int[] a = new int[N];  // Array to hold the number of girls at each kilometer
            
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();  // Number of girls at the i-th kilometer
            }

            // Using sliding window to find the maximum number of girls Vishal can impress
            int currentSum = 0;
            for (int i = 0; i < K; i++) {
                currentSum += a[i];  // Sum the first K elements
            }
            
            int maxGirls = currentSum;  // Initialize maxGirls with the sum of the first window

            // Slide the window across the array
            for (int i = K; i < N; i++) {
                currentSum += a[i] - a[i - K];  // Add the new element, subtract the element that went out of the window
                maxGirls = Math.max(maxGirls, currentSum);  // Keep track of the maximum sum
            }

            // Output the result for this test case
            System.out.println(maxGirls);
        }

        sc.close();  // Close the scanner
    }
}

		  
