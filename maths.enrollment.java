import java.util.*;
import java.lang.*;
import java.io.*;

class maths_enrollment
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
		    if(x>=y)
		    System.out.println(0);
		    else
		    System.out.println(y-x);
		}

	}
}
