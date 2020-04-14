#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0,count=0;
  cin>>a;
  while(sum<a){
  cin>>b;
   sum=sum+b; 
   count++;
    if(sum==a)
      break;
  }
    
    cout<<"The number of turns is "<<count;
    
}