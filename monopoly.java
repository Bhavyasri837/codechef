import java.util.*;
import java.lang.*;
import java.io.*;

class monopoly
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		    int s=sc.nextInt();
		    if((p>(q+r+s))||(q>(p+r+s))||(r>(p+q+s))||(s>(p+q+r)))
		    System.out.println("YES");
		   else
		   System.out.println("NO");
		}

	}
}
