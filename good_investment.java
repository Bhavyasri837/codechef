import java.util.*;
import java.lang.*;
import java.io.*;

class good_investment
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>=(2*y))
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}

	}
}
