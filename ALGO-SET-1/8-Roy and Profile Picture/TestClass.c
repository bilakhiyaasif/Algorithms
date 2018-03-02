#include<stdio.h>
int main(){
  int L=0;
  int N=0;
  scanf("%d", &L);
  scanf("%d", &N);

  int i=0,j=0;
  for(i=0;i<N;i++)
  {
    int W=0;
    int H=0;
    scanf("%d", &W);
    scanf("%d", &H);


     if(W<L||H<L)
     {
       printf("\nUPLOAD ANOTHER");
     }
     else if(W>=L&&H>=L)
     {
       if(W==L&&H==L)
       {
             printf("\nACCEPTED");
       }
       else if(W==H)
       {
          printf("\nACCEPTED");
       }
       else
       {
         printf("\nCROP IT");
       }
     }


  }
}
