import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();

//String s="";
//s=sc.nextLine();

char str[]=s.toCharArray();
int j=0,c=0;
int l=s.length();
  for(int i=l-1;i>=0;i--)
  {
	  
	  if(str[j]==str[i])
	  {
		  c++;
	  }
	  j++;
	  
  }
   if(c==l)
  {
	  System.out.println("YES");
  }
  else
  {
	System.out.println("NO");
  }

       

    }
   
    }
