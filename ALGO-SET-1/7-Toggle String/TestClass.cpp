#include<iostream>
#include<string.h>
int main()
{
  char str[100];
  gets(str);
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
  puts(str);
  return 0;
}
