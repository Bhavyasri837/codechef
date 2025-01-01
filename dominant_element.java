import java.util.*;
import java.lang.*;
import java.io.*;

class dominant_element.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        while (T-- > 0) {
            // Read the size of the array
            int N = sc.nextInt();
            
            // Read the array elements
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Use a HashMap to store the frequency of each element
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int num : A) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            
            // Find the maximum frequency
            int maxFreq = Collections.max(freq.values());
            
            // Count how many elements have the maximum frequency
            int countMaxFreq = 0;
            for (int f : freq.values()) {
                if (f == maxFreq) {
                    countMaxFreq++;
                }
            }
            
            // If only one element has the max frequency, it's dominant
            if (countMaxFreq == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
