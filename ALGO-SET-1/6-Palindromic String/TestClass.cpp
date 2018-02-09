#include<iostream>
#include<string.h>
using namespace std;
int main()
{
char str[101];
cin>>str;

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
	  cout<<"YES";
  }
  else
  {
	  cout<<"NO";
  }

return 0;
}