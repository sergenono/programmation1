/*
 * Uhrzeit.cpp
 *
 *  Created on: 5 nov. 2023
 *      Author: kiano
 */

#include "Uhrzeit.h"
#include<iostream>
#include<algorithm>

Uhrzeit::Uhrzeit(unsigned  int h , unsigned int m , unsigned int s) {

	stunde = h ;
	minute = m ;
	sekunde = s ;

	norm(stunde ,  minute , sekunde);

}
void Uhrzeit::norm(unsigned int &uhr , unsigned int &min , unsigned int &sec )
{
	int counter1 = 0 ;
	int counter2 = 0 ;
	int  counter3 = 0 ;

	while(sec > 60)
	{
		counter1 =  sec /60;
		sec =  sec %60 ;
	}
	if(sec < 60)
	{
		min = counter1 + min ;
		while(min> 60)
		{
			counter2 = min/60 ;
			min = min% 60;
		}
	}
	if(min < 60)
	{
		uhr = counter2+ uhr ;
		while(uhr > 24)
		{
			counter3 = uhr /24 ;
			uhr = uhr %24 ;
		}
	}
	if(uhr < 24)
	{
		int tag = counter3 ;
	}
}
int Uhrzeit::getStunde()
{
	norm(stunde , minute , sekunde);
	return stunde ;

}
int Uhrzeit ::getMinute()
{
	norm(stunde , minute , sekunde);
	return minute ;

}
int Uhrzeit ::getSekunde()
{
	norm(stunde , minute , sekunde);
	return sekunde ;
}
void Uhrzeit:: setStunde(unsigned int std  )
{
	norm(stunde , minute , sekunde );
	stunde = std ;


}
void Uhrzeit::setMinute(unsigned int minu)
{
	norm(stunde , minute , sekunde );
	minute = minu ;
}
void Uhrzeit::setSekunde(unsigned int sek)
{
	norm(stunde , minute , sekunde );
	sekunde = sek ;
}
/* Uhrzeit Uhrzeit:: add(  const Uhrzeit &other)
{
  Uhrzeit result   ;
  result.setStunde(this->stunde + other.stunde);
 result.setMinute(this->minute + other.minute);
  result.setSekunde(this->sekunde + other.sekunde);
	return  result ;
	norm(stunde , minute , sekunde );
*/

Uhrzeit::~Uhrzeit() {


}
void   Uhrzeit::addSek(unsigned int sek)
{
	this->setSekunde (this->getSekunde() + sek);
	norm(stunde , minute , sekunde );

}
void   Uhrzeit::addMin(unsigned int min)
{
	this->setMinute(this->getMinute() + min );
	norm(stunde , minute , sekunde );
}
void   Uhrzeit::addStunde(unsigned int std)
{
	this->setStunde (this->getStunde() + std);
	norm(stunde , minute , sekunde );
}
void Uhrzeit::print()
{
	std::cout<< stunde <<":"<<minute <<":" << sekunde ;
}
int main()
{
	Uhrzeit  u1{11 , 132, 138} ;
	Uhrzeit u2{0 , 0 , 0};
	Uhrzeit u3{0 , 0 , 0} ;


	  u2.addSek(6000);

     u2.print() ;
   // u3 = u1.add(u2);
	//u3.print();

	return 0 ;
}


