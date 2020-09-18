#include <iostream>
using namespace std;

int main() 
{
	string inputString;
  	string reversedString="";
  	cin>>inputString;
  	for(int i=inputString.length()-1;i>=0;i--){
      
      reversedString+=inputString[i];
    }
  	if(reversedString==inputString){
     cout<<"1"; 
    }else{
     cout<<"0";
    }
  
    return 0;
}