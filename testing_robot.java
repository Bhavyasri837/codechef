import java.util.*;
import java.lang.*;
class testing_robot.java
{
public static void main(String args[])    
{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int x=m;
		    String str=sc.next();
		    int arr[]=new int[n+1];
		    for(int j=0;j<n;j++)
		    {
		        if(str.charAt(j)=='R')
		        {
		            m++;
		            arr[j]=m;
		            
		        }
		        else if(str.charAt(j)=='L')
		        {
		            m--;
		            arr[j]=m;
		        }
		    }
		    arr[n]=x;
		    Arrays.sort(arr);
		    int count1=0;
		    for(int j=1;j<=n;j++)
		    {
		        if(arr[j-1]==arr[j])
		        {
		            count1++;
		        }
		    }
		    System.out.println(n+1-count1);
		}
	}
}
