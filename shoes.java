import java.util.Scanner;

class shoes
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		int m = read.nextInt();
    		// Update your code below this line to solve the problem
    		if(n<=m)
    		{
    		    System.out.println(n);
    		}
    		else
    		System.out.println(2*n-m);

    		
    		
		}
	}
}
