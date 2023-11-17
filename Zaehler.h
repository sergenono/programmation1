/*
 * Zaehler.h
 *
 *  Created on: 17 nov. 2023
 *      Author: kiano
 */

#ifndef ZAEHLER_H_
#define ZAEHLER_H_
#include<iostream>
#include<algorithm>
using namespace std ;

class Zaehler {
public:
int zahl ;
public:
	Zaehler(int z);
	 Zaehler& operator++();
	void print() ;
	virtual ~Zaehler();
};



#endif /* ZAEHLER_H_ */
