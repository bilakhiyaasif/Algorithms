#include <iostream>

using namespace std;

int main()
{
	  int N;
	  //scanf("%d",&N);
      cin>>N;
	   if(N>=1&&N<=1000)
	   {
		for (int i=2; i<N; i++)
		{
		for (int j=2; j<=i; j++)
		{
		if (i == j)
		printf("%d ",i);
		else if (i%j == 0)
		break;
		}
		}
		}

    return 0;
}
