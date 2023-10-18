
#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std ;

void zeitraum(int &sekunde, int &minute , int &stunde ,int &tage);

int main(){


int x   ;
int y  ;
int z  ;
int u  ;



std::cout<<"enter a number !"<<endl ;
std::cin>> x;
std::cout<<"enter a number!"<<endl ;
std::cin>>y ;
std::cout<<"enter a number!"<<endl ;
std::cin>>z ;
std::cout<<"enter a number !"<<endl ;
std::cin>>u;


 zeitraum(x , y , z ,u)   ;

return 0;
}
void zeitraum(int &sekunde  ,  int &minute , int &stunde ,int &tage)
{
int counter1 = 0 ;
int counter2 = 0 ;
int counter3 = 0;
 while(sekunde >60)
 {
	 counter1 = sekunde /60 ;
      sekunde = sekunde % 60 ;;

  }
 if(sekunde < 60)
 {
	 minute = counter1 + minute ;

	 while(minute >60)
	 {
		 counter2 = minute / 60 ;
		 minute = minute % 60 ;

	 }
 }
 if(minute < 60)
 {
	 stunde = counter2 + stunde ;
	 while(stunde > 24)
	 {
		 counter3 = stunde / 24 ;
		 stunde = stunde %24 ;

	 }
 }
 if(stunde < 24)
 {
	 tage = counter3 + tage ;
 }


  std::cout<< sekunde <<"second  " <<minute <<"minute " <<stunde <<"hour " <<tage <<"day  " ;


}


