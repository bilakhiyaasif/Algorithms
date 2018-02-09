#include<iostream>
using namespace std;
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
	
	cin>>N;
	cout<<fact(N);
	
	return 0;
}



