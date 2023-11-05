/*
 * Bankkonto.cpp
 *
 *  Created on: 3 nov. 2023
 *      Author: kiano
 */

#include "Bankkonto.h"
#include<string>
using namespace std ;
#include<iostream>

Bankkonto::Bankkonto( const std::string& knummer ,const  std::string& kinhaber , double kstand) {

	kontoinhaber = kinhaber ;
	kontostand = kstand ;
	kontonummer = knummer ;

}

Bankkonto::~Bankkonto() {
std::cout<<"bankkonto  fuer" <<kontoinhaber<<"wurde  geloscht" ;
std::cout<<"\n" ;
}

Bankkonto& Bankkonto::operator=(const Bankkonto  &other)
{
	string nkontonummer  = other.kontonummer ;
	kontostand = getKontostand();

	//delete kontonummer ;
	return *this ;
}
double Bankkonto:: getKontostand()const
{
	return kontostand ;
}
 double Bankkonto:: einzahlung(double wert)
 {
	 kontostand += wert ;
	 return kontostand ;
 }
 double Bankkonto:: auszahlung(double wert)
 {
	 if(kontostand  <= wert)
		 std::cout<< "konto aufgedeckt";
	 else
		 kontostand -= wert ;
	 return kontostand ;
 }
 void Bankkonto:: print()
 {
      std::cout<< "kontonummer :"<<kontonummer ;
      std::cout<<"\n";
      std::cout<<"kontoinhaber :"<<kontoinhaber ;
      std::cout<<"\n";
      std::cout<<"kontostand :"<<kontostand ;
      std::cout<<"\n" ;
 }
 int main()
 {
	 Bankkonto k1{"0166987" , "serge nono" , 60000.0} ;
	// Bankkonto k2 ;
	 // k2 = k1 ;
	   k1.print();
	  std::cout<<"\n" ;
	  k1.einzahlung(1000)  ;
	/*  std::cout<<"kontostand nach der Ein-und-Auszahlung";
	  std::cout<<"\n" ;*/
	   k1.print();


	 return 0 ;
 }

