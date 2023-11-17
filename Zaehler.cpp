/*
 * Zaehler.cpp
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#include "Zaehler.h"
#include<iostream>
#include<algorithm>
using namespace std ;

Zaehler::Zaehler(int z)  : zahl(z){


}

Zaehler::~Zaehler() {
	// TODO Auto-generated destructor stub
}



Zaehler& Zaehler:: operator ++() {

	++zahl ;
	return *this  ;
}

void Zaehler::print() {
	std::cout<< zahl ;
}
