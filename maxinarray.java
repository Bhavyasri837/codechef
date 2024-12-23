import java.util.*;
import java.lang.*;
import java.io.*;

class maxinarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
             int max=arr[0];
            for(int j=1;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
        System.out.println(max);
	}
}
}
