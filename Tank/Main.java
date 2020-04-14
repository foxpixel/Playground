#include<iostream>
using namespace std;
int main()
{
  float r,h,tt,a,t;
  cin>>r>>h>>a>>t;
  tt=(3.14*r*r*h)/a;
 if(tt<t)
   cout<<"The tank can be filled within "<<t<<" hours" ;
  else
    cout<<"The tank cannot be filled within "<<t<<" hours" ;
  
}