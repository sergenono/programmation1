/*
 * Zeit.h
 *
 *  Created on: 16 nov. 2023
 *      Author: kiano
 */

#ifndef ZEIT_H_
#define ZEIT_H_
#include<iostream>
using namespace std ;

class Zeit {
public:
	int stunden ;
	int minuten ;
public:
	Zeit( int s , int m);
	virtual ~Zeit();
	 int getMinute() ;
	 int getStunde();
	 void setMinute(int min);
	 void setStunden(int std);

	Zeit operator+ ( const  Zeit& other) const  ;

	void print() ;
};

#endif /* ZEIT_H_ */
