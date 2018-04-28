#include<iostream>
using namespace std;
int main(){
  int L=0;
  int N=0;
//  scanf("%d", &L);
  cin>>L;
  //scanf("%d", &N);
  cin>>N;

  int i=0,j=0;
  for(i=0;i<N;i++)
  {
    int W=0;
    int H=0;
  //  scanf("%d", &W);
    cin>>W;
    //scanf("%d", &H);
    cin>>H;


     if(W<L||H<L)
     {
       cout<<"\nUPLOAD ANOTHER";
     }
     else if(W>=L&&H>=L)
     {
       if(W==L&&H==L)
       {
             cout<<"\nACCEPTED";
       }
       else if(W==H)
       {
          cout<<"\nACCEPTED";
       }
       else
       {
         cout<<"\nCROP IT";
       }
     }


  }
}
