#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  b=a/10;
  if(b>0){
  b=b%10;
  if(b%3==0)
    cout<<"Trendy Number";
  else
    cout<<"Not a Trendy Number";
  }
  else
    cout<<"Not a Trendy Number";
}