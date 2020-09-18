#include <iostream>
using namespace std;

int main() 
{
	string str;
  	string output="";
  	getline(cin,str);
   	char c;
  	cin>>c;
  	for(int i=0;i<str.length();i++){
     if(str[i]==c){
       continue;
     }else{
      output+=str[i];
     }
    }
  cout<<output;
  
  
    return 0;
}