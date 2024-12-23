// Update the '_' in the code below to solve the problem
import java.util.*;

class nonzeroelements
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int ele;
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		int k = read.nextInt();
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		for(int j=0; j<n; j++){
    		    ele = read.nextInt();
    		    a.add(ele);
    		}
    		// Declare and initialise variables - pos, neg and divk
            // Note that we are reinitializing the variables to be 0 for each test case.
    		int pos = 0;
    		int neg = 0;
    		int divk = 0;
    		
    		int l = 0;
    		// Loop through all elements of the array
    		while(l < a.size()){
    		    // Count the negative elements of the array
                if (a.get(l)<0){           
                    neg = neg + 1;
                }
                // Count the positive elements of the array
                else if (a.get(l)>0){     
                    pos = pos + 1;
                }
                // Count if the given element is divisible by k
                if (a.get(l)%k == 0){        
                    divk = divk + 1;
                }
                l = l + 1;
    		}
    		System.out.println(pos + " " + neg + " " + divk);
		}
	}
}
