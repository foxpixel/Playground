#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a==2)
    cout<<b+(b/2);
  else if(a==3)
    cout<<b*2;
  else 
    cout<<"Number of items is more";
}