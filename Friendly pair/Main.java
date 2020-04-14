#include<iostream>
using namespace std;
int main()
{
float k,l;
  int a,b,i,j,sum1=1,sum2=1;
  cin>>a>>b;
 for(i=2;i<=a;i++){
 
   if(a%i==0)
     //cout<<c<<endl;
     sum1=sum1+i;
 }
   k=sum1;
   for(j=2;j<=b;j++){
 
   if(b%j==0)
     //cout<<c<<endl;
     sum2=sum2+j;
 }
  l=sum2;
  if((k/a) == (l/b))
    cout<<"Friendly Pair";
  else
    cout<<"Not Friendly Pair";
}