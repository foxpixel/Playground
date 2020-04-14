#include<iostream>
using namespace std;
int main()
{
int a,b,c,p,i,hcf=1;
  cin>>a>>b>>c;
  if(a<b && a<c){
    if(b<c)
      cout<<"The treasure is in box which has number "<<b;
  	else if(c<b)
      cout<<"The treasure is in box which has number "<<c;
  }
  else if(b<a && b<c){
    if(a<c)
      cout<<"The treasure is in box which has number "<<a;
  	else if(c<a)
      cout<<"The treasure is in box which has number "<<c;
  }
  else if(c<a && c<b){
    if(a<b)
      cout<<"The treasure is in box which has number "<<a;
  	else if(b<a)
      cout<<"The treasure is in box which has number "<<b;
  }
  p=a*b*c;
  for(i=2;i<=p;i++){
    if(a%i==0 && b%i==0 && c%i==0 )
      hcf=i;
     
  }
  cout<<endl<<"The code to open the box is "<<hcf;
}