//prime num upto n
import java.util.Scanner;
class primenumber
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int  x=2;
   int c=0;
   int t=0;
   int limit=sc.nextInt();
   while(t!=limit)
   {
   for(int i=2;i<x;i++)
   {
     if(x%i==0)
     {
       c++;
       break;
     }
   }
   if(c==0)
    {
    System.out.print((t+1)+"th Prime Num:"+"["+x+"]"+"\n");
    t++;
    }
    c=0;
    x++;
  }
 }
}
