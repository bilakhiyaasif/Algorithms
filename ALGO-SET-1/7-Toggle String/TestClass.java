import java.util.Scanner;
public class TestClass
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //char str[]=new char[100];
        String s1=sc.nextLine();
        char str[]=s1.toCharArray();
        char c;
        for(int i=0;i<s1.length();i++)
        {
          c=str[i];
          if(c>='a'&&c<='z')
          {
            c=c-32;
          }
          else if(c>='A'&&c<='Z')
          {
            c=c+32;
          }
          str[i]=c;
        }
        for(int i=0;i<s1.length();i++)
        {
          System.out.print(str[i]);
        }
    }
}
