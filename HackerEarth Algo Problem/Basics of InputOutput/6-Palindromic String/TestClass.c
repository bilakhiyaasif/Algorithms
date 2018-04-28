#include<stdio.h>
#include<string.h>

int main()
{
char str[100];
gets(str);

int j=0,c=0;
int l=strlen(str);
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
	  printf("YES");
  }
  else
  {
	  printf("NO");
  }

return 0;
}