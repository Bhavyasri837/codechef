import java.util.*;
import java.lang.*;
import java.io.*;

class legspace
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if(n<m)
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
	}
}
