#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%s",&str);
  char c;
  for(int i=0;i<strlen(str);i++)
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
  printf("%s",str);
  return 0;
}
