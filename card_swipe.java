import java.util.*;
import java.lang.*;
import java.io.*;

class card_swipe.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    HashSet<Integer> hs = new HashSet<>();
		    int maxm = 0;

		    for(int i=0; i<n; i++) {
		        int value = sc.nextInt();

		        if(hs.contains(value)) hs.remove(value);
		        else hs.add(value);
		        
		        maxm = Math.max(maxm, hs.size());
		    }
		    
		    System.out.println(maxm);
		}
	}
}
