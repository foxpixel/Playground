#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b=2,i;
  cin>>a;
  for(i=1;i<=a;i++){
  cout<<b<<" ";
    b=b*b-1;
  }
}