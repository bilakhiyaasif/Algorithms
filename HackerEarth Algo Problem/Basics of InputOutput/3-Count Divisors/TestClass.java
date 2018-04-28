import java.util.Scanner;
class TestClass
{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int l,r,k,c=0;

  l=sc.nextInt();
  r=sc.nextInt();
  k=sc.nextInt();

  for(int i=l;i<=r;i++)
  {
   if(i%k==0)
      {
          c++;
      }
  }

  System.out.println(c);
}
}
