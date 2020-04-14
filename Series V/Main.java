#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int a,i,b=11;
  cin>>a;
  for(i=1;i<=a;i++){
    cout<<pow(b,2)<<" ";
    b=b+4;
  }
}