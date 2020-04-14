#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d,cnt=0;
 cin>>a>>b>>c>>d;
if(d<a)
  cnt++;
 if(d<b)
  cnt++;
if(d<c)
  cnt++;

cout<<cnt;  	   
  	
}