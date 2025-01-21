import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int maxVal = Math.max(a, Math.max(b, c)); // Finding the maximum value
            int minVal = Math.min(a, Math.min(b, c)); // Finding the minimum value
            
            // Print the difference between the maximum and minimum values
            System.out.println(maxVal - minVal);
		    }

	}
}
