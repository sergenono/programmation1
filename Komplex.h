/*
 * Komplex.h
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#ifndef KOMPLEX_H_
#define KOMPLEX_H_
#include<iostream>
#include<algorithm>
using namespace std ;

class Komplex {
public:
	 double  real ;
	 double imag ;
public:
	Komplex(double r , double i);
	friend ostream& operator<<(ostream& s ,  const Komplex& other );
	virtual ~Komplex();
};

ostream& operator<<(ostream& s, const Komplex& other);

#endif /* KOMPLEX_H_ */
