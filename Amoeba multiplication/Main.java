#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,temp,n,i;
  cin>>n;
  for(i=2;i<n;i++){
    temp=a+b;
  	a = b;
  	b=temp;
  }
  cout<<temp;
}