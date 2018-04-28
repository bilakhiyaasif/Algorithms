import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        long d=0;
        for(int i=0;i<n;i++)
        {
            d=d+ar[i];
            
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=1&&n<=10)
        {
            
        
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
          long t=in.nextLong();
          if(t>=1)
          {
                if (t<=10000000000.0) {
                    ar[ar_i] =t;
                }
          }
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
        }
    }
}
