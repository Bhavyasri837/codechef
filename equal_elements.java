import java.util.*;
import java.lang.*;
import java.io.*;
class equal_elements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n+1];
		    for(int i=0;i<n;i++)
		    {
		        int b=sc.nextInt();
		        ar[b]++;
		    }
		    int sum=0;
		    for(int i=0;i<n+1;i++)
		    {
		       if(ar[i]>sum)
		       sum=ar[i];
		    }
		    System.out.println(n-sum);
		}
	}
}
	
