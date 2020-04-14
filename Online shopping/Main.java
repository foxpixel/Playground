#include<iostream>
using namespace std;
int main()
{
  int fc,fd,ft,sc,sd,st,ac,ad,at,df,ds,da,f,s,a;
  cin>>fc>>fd>>ft>>sc>>sd>>st>>ac>>ad>>at;
  df=(fc*fd)/100;
  ds=(sc*sd)/100;
  da=(ac*ad)/100;
  f=(fc-df)+ft;
  s=(sc-ds)+st;
  a=(ac-da)+at;
  cout<<"In Flipkart Rs."<<f<<endl<<"In Snapdeal Rs."<<s<<endl<<"In Amazon Rs."<<a<<endl;
  if(f<=s && f<=a)
    cout<<"He will prefer Flipkart";
  else if(s<=a && s<f)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}