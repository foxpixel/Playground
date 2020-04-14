#include<iostream>
using namespace std;
int main()
{
float a,b;
cin>>a>>b;
  if((b*12) > a)
    cout<<"Profit : Rs."<<b*12-a;
  else if((b*12) < a)
    cout<<"Loss : Rs."<<a-(b*12);
  else
    cout<<"No profit nor loss";
}