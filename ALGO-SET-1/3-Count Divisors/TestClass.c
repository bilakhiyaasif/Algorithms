#include <stdio.h>
int main()
{
    int l,r,k,c=0;
    scanf("%d%d%d",&l,&r,&k);
    for(int i=l;i<=r;i++)
    {
     if(i%k==0)
        {
            c++;
        }
    }
    printf("%d",c);
    return 0;
}
