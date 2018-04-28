import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2)
	{
        // Complete this function
		
		int A[]={a0,a1,a2};
		int B[]={b0,b1,b2};
		int Alice=0;
		int Bob=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>B[i])
			{
				Alice=Alice+1;
				
			}
			if(A[i]==B[i])
			{
				//System.out.print("same");
			}
			if(A[i]<B[i])
			{
				Bob=Bob+1;
				
			}
		}
		
		
		//System.out.println(Alice+" "+Bob);
		int ans[]={Alice,Bob};
	   //int a[]=new int[255];
	   return ans;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
		//System.out.println(a0+" "+a1+" "+a2+" "+b0+" "+b1+" "+b2);
		
		if((a0>=1&&a0<=100)&&(a1>=1&&a1<=100)&&(a2>=1&&a2<=100)&&(b0>=1&&b0<=100)&&(b1>=1&&b1<=100)&&(b2>=1&&b2<=100))
		{
          int[] result = solve(a0, a1, a2, b0, b1, b2);
		
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        
		}
		else
		{
			System.out.println("input not match");
		}
    }
}

