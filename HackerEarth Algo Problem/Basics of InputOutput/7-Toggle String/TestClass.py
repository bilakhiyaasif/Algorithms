#include<stdio.h>
#include<string.h>
int main()
{

        String data=sc.nextLine();
		char data[100];
		gets(data);
      //  System.out.println(data);
        
       // String out="";
		char out[100];
        //String temp="";
		char temp[]=out;
		
		
        for(int i=0;i<strlen(data);i++)
        {
            if(data[i]>='a'&&data[i]<='z')
            {
                
				
				
				temp[i]=data.charAt(i)+"";
				
                out+=temp.toUpperCase();
                
            }
            else if(data.charAt(i)>='A'&&data.charAt(i)<='Z')
            {
                temp=data.charAt(i)+"";
                out+=temp.toLowerCase();
                
            }
            else
            {
                out+=data.charAt(i)+"";
            }
        }
        System.out.println(out);
return 0;
}






import java.util.Scanner;
public class TestClass
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
      //  System.out.println(data);
        
        String out="";
        String temp="";
        for(int i=0;i<data.length();i++)
        {
            if(data.charAt(i)>='a'&&data.charAt(i)<='z')
            {
                temp=data.charAt(i)+"";
                out+=temp.toUpperCase();
                
            }
            else if(data.charAt(i)>='A'&&data.charAt(i)<='Z')
            {
                temp=data.charAt(i)+"";
                out+=temp.toLowerCase();
                
            }
            else
            {
                out+=data.charAt(i)+"";
            }
        }
        System.out.println(out);
    }
}