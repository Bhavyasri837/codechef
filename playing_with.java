import java.util.*;
import java.lang.*;
import java.io.*;
class playing_with
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		String a=sc.next();
		String b=sc.next();
		int a0=0,a1=0,b0=0,b1=0;
		for(int i=0;i<n;i++)
		{
		if(a.charAt(i)!='0')
		{
		  a0++;
		}
		else
		{ 
		  a1++;
		}
		if(b.charAt(i)!='0')
		{
		  b0++;
		}
		else
		{
		  b1++;
		}
		}
		if(a0==b0 && a1==b1)
		{
		  System.out.println("YES");
		}
		else
		{
		  System.out.println("NO");
		}
		}
	}
}
	
