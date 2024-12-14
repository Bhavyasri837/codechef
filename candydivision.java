import java.util.*;
import java.lang.*;
import java.io.*;

class Candydivision
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)
		{
		    int N=sc.nextInt();
		    if(N%3==0)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		
		

	}
}
