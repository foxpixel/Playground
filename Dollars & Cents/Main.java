#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,r,q;
  cin>>a>>b>>c>>d;
  q=(b+d)/100;
  r=(b+d)%100;
  cout<<a+c+q<<endl<<r;
}