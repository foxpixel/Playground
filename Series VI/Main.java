#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int a,b=0,i;
  cin>>a;
  for(i=2;i<=a+1;i++){
    cout<<b<<" ";
    if(i%2== 0)
      b=pow(i,2)-2;
    else
      b=pow(i,2)-1;

  }
}