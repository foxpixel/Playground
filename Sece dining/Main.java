#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char c[10];
  int a;
  cin>>c>>a;
  if(strlen(c)==5)
    if(a==1)
      cout<<"Left Handed";
  	else
      cout<<"Right Handed";
  else
    if(a==1)
      cout<<"Right Handed";
  	else
      cout<<"Left Handed";
}