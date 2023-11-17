/*
 * Komplex.cpp
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#include "Komplex.h"
#include<iostream>
#include<algorithm>
using namespace std ;


Komplex::Komplex(double r, double i) : real(r), imag(i){
}

Komplex::~Komplex() {
	// TODO Auto-generated destructor stub
}

ostream& operator <<(ostream &s,const Komplex& other) {
	s<<other.real <<"+"<<other.imag<<"i" ;
	return s ;
}
