

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class largestandsecondlargest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T-- > 0){
	    int  N = sc.nextInt();
	    int arr[] = new int[N];
	    for(int i = 0;i< N ; i++){
	        arr[i] = sc.nextInt();
	    }
	     Arrays.sort(arr);
	     for(int i = N -1;i>=0;){
	         if(arr[i] != arr[i-1] ){
	             System.out.println(arr[i] +arr[i-1]);
	             break;
	         }
	         else{
	             i--;
	         }
	     }
	   

	}
	}
}
