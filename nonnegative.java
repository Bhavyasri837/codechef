// this code has some logical error - debug this code to solve the problem
import java.util.*;

class nonnegative
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		for(int j=0; j<n; j++){
    		    ele = read.nextInt();
    		    a.add(ele);
    		}
    		
    		int count_neg = 0;
    		// count the occurence of '0' in the ArrayList
    		int count_zero = Collections.frequency(a, 0);
    		
    		if(count_zero > 0){
    		    System.out.println(0);
    		}
    		else{
    		    int l = 0;
    		    while(l<n){
    		        if(a.get(l) < 0){
    		            count_neg = count_neg + 1;
    		        }
    		        l = l + 1;
    		    }
    		    if(count_neg%2 == 0){
    		        System.out.println(0);
    		    }
    		    else{
    		        System.out.println(1);
    		    }
    		    
    		}
		}
	}
}
