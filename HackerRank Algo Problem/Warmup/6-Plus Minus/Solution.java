import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        double p=0,n=0,z=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i])>=1)
            {
                //p
                p++;
            }
            
            if((arr[i])<0)
            {
               //n 
                n++;
            }
            if(arr[i]==0)
            {
                //z
                z++;
            }
        }
        double d=arr.length;
        //System.out.println(d);
        
        System.out.println(p/d);
        System.out.println(n/d);
        System.out.println(z/d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
