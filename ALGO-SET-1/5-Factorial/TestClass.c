#include<stdio.h>
 long int fact(long int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
          return n*fact(n-1);  
        }
    }
int main()
{
	long int N=0;
	scanf("%ld",&N);
	printf("%ld",fact(N));
	
	return 0;
}



