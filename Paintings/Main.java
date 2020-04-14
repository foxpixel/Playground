#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,aw,afp,asp;
  cin>>a>>b>>c>>d>>e>>f;
  aw=a*b;
  afp=c*d;
  asp=e*f;
  if(aw > (afp+asp))
    cout<<"Raj can fix both painting";
  else
    cout<<"Raj cannot fix both painting";
}