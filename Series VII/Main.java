#include<iostream>
using namespace std;
int main()
{
 int a,b=1,i;
  cin>>a;
  for(i=1;i<=a;i++){
  cout<<b<<" ";
  if(i%2==0)
  	b=b*1.5;
  else
    b=b*2;
  }
}