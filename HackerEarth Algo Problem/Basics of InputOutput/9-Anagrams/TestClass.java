import java.util.Scanner;
class TestClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a0=0;a0<t;a0++)
        {
            String A=sc.next();
            String B=sc.next();
            
            int c1=findAnagram(A.toCharArray(),B.toCharArray());
            int c2=findAnagram(B.toCharArray(),A.toCharArray());
            System.out.println(c1+c2);
        }
    }
    public static int findAnagram(char A[],char B[])
    {
        int m[]=new int[A.length];
        int f=0,c=0,allone=0;
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
				if(B[i]==A[j])
				{
					A[j]='@';
					f=0;
					break;
				}
				else
				{
					f=1;
				}
			}
			if(f==1)
			{
				c++;
			}
			f=0;
        }
        return c;
    }
}