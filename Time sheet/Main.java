#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e,f,g,sum=0,thours,ehours;
 cin>>a>>b>>c>>d>>e>>f>>g;
 if(f<=8)
   sum=sum+(f*100);
  else
    sum=sum+800+((f-8)*115);
  if(b<=8)
   sum=sum+(b*100);
  else
    sum=sum+800+((b-8)*115);
   if(c<=8)
   sum=sum+(c*100);
  else
    sum=sum+800+((c-8)*115);
  if(d<=8)
   sum=sum+(d*100);
  else
    sum=sum+800+((d-8)*115);
   if(e<=8)
   sum=sum+(e*100);
  else
    sum=sum+800+((e-8)*115);
  thours=a+b+c+d+e;
  if(thours>40){
    ehours=thours-40;
  	sum=sum+ehours*25;
  }
  sum=sum+g*125;
  sum=sum+a*150;
  cout<<sum;
}