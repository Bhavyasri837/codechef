import java.util.*;
import java.lang.*;
import java.io.*;

class easy_pronounciation.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();
        sc.nextLine();  // Consume the newline character after the integer input
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Read the length of the string (we don't actually need this value)
            int N = sc.nextInt();
            sc.nextLine();  // Consume the newline character after the integer input
            
            // Read the string
            String S = sc.nextLine();

            // Variable to count consecutive consonants
            int consonantCount = 0;
            boolean isEasy = true;
            
            // Loop through the string to check for consecutive consonants
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);

                // Check if the character is a consonant
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    consonantCount++;
                    
                    // If we find 4 or more consecutive consonants, mark it as hard to pronounce
                    if (consonantCount >= 4) {
                        isEasy = false;
                        break;  // No need to continue checking once we know it's hard to pronounce
                    }
                } else {
                    consonantCount = 0;  // Reset the counter if it's a vowel
                }
            }

            // Output the result based on the value of isEasy
            if (isEasy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        // Close the scanner
        sc.close();
    }
}
