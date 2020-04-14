#include<iostream>
using namespace std;
int main()
{
  int a,b,i,sum=1;
  cin>>a;
  for(i=2;i<a;i++){
    b=a/i;
    if(a%i==0)
      //cout<<b<<endl;
      sum=sum+b;
  }
  		

  //cout<<sum;
  if(sum>a)
    cout<<"Abundant Number";
  else
    cout<<"Not Abundant Number";
}