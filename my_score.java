import java.util.*;
import java.lang.*;
import java.io.*;

class my_score
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int []arr = new int[12];
		    for (int i=0;i<n;i++){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        if(b>arr[a])
		            arr[a]=b;
		    }
		    int s =0;
		    for (int i=0;i<=8;i++) 
		    s=s+arr[i];
		    System.out.println(s);
		}
	}
}