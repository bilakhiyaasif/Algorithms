import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
       Scanner sc=new Scanner(System.in);
       long N=sc.nextLong();
       System.out.println(fact(N));
       
       
    }
    static long fact(long n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
          return n*fact(n-1);  
        }
    }
}
