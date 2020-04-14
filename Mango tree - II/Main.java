#include<iostream>
using namespace std;
int main()
{
  int a, b, c,d;
  cin>>a>>b>>c;
  d=a*b-b;
  if((a*b)%c==1 || ((a+b)*10)%c==1 || (c>d && c<(a*b)) )
    cout<<"Yes";
  else
    cout<<"No";
}