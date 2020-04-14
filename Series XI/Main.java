#include<iostream>
using namespace std;
int main()
{
 int a,i;
  float b=95;
  cin>>a;
  for(i=0;i<a;i++){
  cout<<b<<" ";
    b=b+(20.5+(i*2));
  }
}