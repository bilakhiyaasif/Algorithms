import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   int N=Integer.parseInt(br.readLine());
	   if(N>=1&&N<=1000)
	   {
		for (int i=2; i<N; i++)
		{
		for (int j=2; j<=i; j++)   
		{
		if (i == j)  
		System.out.print(i+" ");
		else if (i%j == 0)
		break;
		}
		}
		}		   
		}
		}

		