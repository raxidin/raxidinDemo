#include<iostream>
using namespace std;
int main(){
	cout<<"请输入两个变量";
	int a,b;
	cin>>a>>b;
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<a<<"\t"<<b<<endl;
	//cout<<"b="<<b<<endl;
	return 0;
}
