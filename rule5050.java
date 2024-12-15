import java.util.*;
import java.lang.*;
import java.io.*;

class rule5050
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
            if(x<50)
            System.out.println("Z");
            else if(x>=50&&y<50)
            System.out.println("F");
            else
            System.out.println("A");
        }
	}
}
