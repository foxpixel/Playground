#include<iostream>
using namespace std;
int main()
{
int a,i,count=0;
  cin>>a;
  cout<<a<<endl;
while(a!=1){
  if(a%2==0){
    a=a/2;
  	cout<<a<<endl;
    count++;
  		}
  else{
  	a=(3*a)+1;	
    cout<<a<<endl;
    count++;	
  		}
	}
  cout<<count;
}