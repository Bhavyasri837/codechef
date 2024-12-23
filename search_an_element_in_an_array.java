import java.util.*;
import java.lang.*;
import java.io.*;

class searching_an_element_in_an_array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[n];
		boolean flag=false;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
		if(arr[i]==x)
		{
		    flag=true;
	     break;
		}
	}
		if(flag==true)
		System.out.println("YES");
        else
        System.out.println("NO");
		
		

	}
}
