import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                int t=in.nextInt();
                if(t>=-100&&t<=100)
                {
                a[a_i][a_j] = t;
                }
            }
        }
       
        System.out.println(sum(a));
    }
    static int sum(int a[][])
    {int f=0,b=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==j)
                {
                f=f+a[i][j];
                }
            
            }
        
        }
        int i=0;
        int j=0;
        for(i=0,j=a.length-1;i<a.length&&j>=0;i++,j--)
        {
            b=b+a[i][j];
        }
    
      int ans=f-b;
      if(ans<0)
      {
          ans=ans*(-1);
      }
        return ans;
    }

}
